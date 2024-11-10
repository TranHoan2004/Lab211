/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bo.Input;
import bo.Manager;
import entity.Word;

/**
 *
 * @author ADMIN
 */
public class Controller {

    private Input input;
    private final Manager manager;

    public Controller() {
        this.manager = new Manager();
    }

    public void createWord() throws Exception {
        input = new Input();
        Word word = input.getWord();
        manager.addWord(word);
    }

    public void delete() throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("Dictionary is empty, please add some words");
        }
        String string = input.getEnglishWord();
        manager.deleteWord(string);
    }

    public String translate() throws Exception {
        if (manager.getList().isEmpty()) {
            throw new Exception("Dictionary is empty, please add some words");
        }
        String string = input.getEnglishWord();
        return manager.translate(string);
    }

}
