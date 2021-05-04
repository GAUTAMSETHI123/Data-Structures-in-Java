/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-02-2021
 *   Time: 02:27
 *   File: LinkedList1.java
 */

package SinglyLinkedList;

public class LinkedList1 {

    Node head;


    public LinkedList1() {
        head = null;
    }


    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(Node newNode) {
        if (isEmpty()) {
            head = newNode;

        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;


        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }


    public void addFront(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addPos(int pos, Node data2) {
        Node temp = this.head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        data2.next = temp.next;
        temp.next = data2;


    }

    public Node deleteFront() {
        if (isEmpty())
            System.out.println("the list is empty");
        else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }


        return null;
    }


    public Node deleteLast() {
        if (isEmpty())
            System.out.println("the list is empty");
        else {
            Node current = head;
            Node previous = head;
            while (current.next != null) {
                previous = current;
                current = current.next;


            }
            previous.next = null;
            return current;
        }
        return null;
    }

    public Node removeAt(int pos) {

        if (head == null) {
            System.out.println("Element Not Found!!");
        } else {
            Node current = head;
            Node previous = head;
            for (int i = 0; i < pos - 1; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;


        }


        return null;
    }
}















