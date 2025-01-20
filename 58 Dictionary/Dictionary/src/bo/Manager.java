/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ADMIN
 */
public class Manager {

    private final List<Word> listOfWord;

    public Manager() {
        this.listOfWord = new ArrayList<>();
    }

    public void addWord(Word word) throws Exception {
        if (listOfWord.contains(word)) throw new Exception("This word is existed");
        listOfWord.add(word);
    }

    public void deleteWord(String string) throws Exception {
//        for (Word word : listOfWord) {
//            if (word.getEnglishWord().equalsIgnoreCase(string)) {
//                listOfWord.remove(word);
//            }
//        }
        // doan code tren tuong duong voi doan code duoi
        listOfWord.removeIf(word -> word.getEnglishWord().equalsIgnoreCase(string));
        throw new Exception("This word is not existed");
    }

    public String translate(String string) throws Exception {
//        for (Word word : listOfWord) {
//            if (word.getEnglishWord().equalsIgnoreCase(string)) {
//                return word.getVietnameseWord();
//            }
//        }
//        throw new Exception("This word is not existed");
        // co the thay the bang doan code duoi
        return listOfWord.stream().filter(word -> word.getEnglishWord().equalsIgnoreCase(string))
                .findAny().orElseThrow(() -> new Exception("This word is not existed")).getVietnameseWord();
    }

    public List<Word> getList() {
        return new ArrayList<>(listOfWord);
    }
}
