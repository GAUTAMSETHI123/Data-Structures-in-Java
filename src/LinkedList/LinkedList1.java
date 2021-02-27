/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-02-2021
 *   Time: 02:27
 *   File: LinkedList1.java
 */

package LinkedList;

public class LinkedList1 {

    private class Node{
         int data;
         Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList1() {
        head = null;
    }


    public void display(){
        Node temp = this.head;
        while (temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void addLast(Node data){
        if(isEmpty()){
            head = data;

        }

        else{
            Node temp = this.head;
            while(temp!=null){
                temp = temp.next;
            }
            temp.next = data;


        }
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }


    public void addFront(Node data1){
        if(isEmpty()){
            head = data1;
        }

        else{
            data1.next = head;
            head = data1;
        }
    }



}
