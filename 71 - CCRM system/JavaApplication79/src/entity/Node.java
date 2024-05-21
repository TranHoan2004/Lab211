/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Node {

    public Task infor;
    public Node next;

    public Node(Task infor, Node next) {
        this.infor = infor;
        this.next = next;
    }

    public Node(Task infor) {
        this.infor = infor;
        this.next = null;
    }
}
