/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Word;
import utils.Validation;

/**
 *
 * @author ADMIN
 */
public class Input {

    private final Word word;

    public Input() {
        this.word = new Word();
    }

    public Word getWord() {
        word.setEnglishWord(Validation.getStringByRegex("Enter English: ", "[A-Za-z ]+", "Only word and space"));
        word.setVietnameseWord(Validation.getStringByRegex("Enter Vietnamese: ", "[A-Za-z ]+", "Only word and space"));
        return word;
    }

    public String getEnglishWord() {
        return Validation.getStringByRegex("Enter English: ", "[A-Za-z ]+", "Only word and space");
    }
}
