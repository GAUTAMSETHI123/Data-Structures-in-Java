/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-02-2021
 *   Time: 02:27
 *   File: LinkedList1.java
 */

package LinkedList;

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
        if(isEmpty())
            System.out.println("the list is empty");
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }

        return null;
    }



}















