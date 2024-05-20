/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Node;
import entity.Task;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class LinkedList {

    private Node head, tail;

    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isNull(Node x) {
        return x == null;
    }

    public void clear() {
        head = null;
    }

    public void addLast(Task x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(Task x) {
        if (isEmpty()) {
            return;
        }
        Node newNode = new Node(x);
        if (head == tail) {
            head = tail = null;
        }
        else if (newNode == head) {
            head = head.next;
        } else {
            Node p = head;
            while (!isNull(p) && p.next != newNode) {
                p = p.next;
            }
            p.next = newNode.next;
            if (isNull(p.next)) {
                tail = p;
            }
        }
    }

    public ArrayList<Task> traversal() {
        ArrayList<Task> tasks = new ArrayList<>();
        Node p = head;
        while (!isNull(p)) {
            tasks.add(p.infor);
            p = p.next;
        }
        return tasks;
    }

    public int size() {
        int count = 0;
        Node p = head;
        while (!isNull(p)) {
            ++count;
            p = p.next;
        }
        return count;
    }
}
