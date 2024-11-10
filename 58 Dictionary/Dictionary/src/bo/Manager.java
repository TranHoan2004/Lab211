/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Word;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private final ArrayList<Word> listOfWord;

    public Manager() {
        this.listOfWord = new ArrayList<>();
    }

    public void addWord(Word word) throws Exception {
        if (isExisted(word)) {
            throw new Exception("This word is existed");
        }
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
        for (Word word : listOfWord) {
            if (word.getEnglishWord().equalsIgnoreCase(string)) {
                return word.getVietnameseWord();
            }
        }
        throw new Exception("This word is not existed");
    }

    public ArrayList<Word> getList() {
        return listOfWord;
    }

    private boolean isExisted(Word word) {
        for (Word w : listOfWord) {
            if (w == word) {
                return true;
            }
        }
        return false;
    }
}
