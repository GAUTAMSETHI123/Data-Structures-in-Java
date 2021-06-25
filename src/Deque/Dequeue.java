/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-06-2021
 *   Time: 09:54
 *   File: Dequeue.java
 */

package Deque;

public class Dequeue {
    Node front;
    Node rear;
    public Dequeue(){
        front = null;
        rear = null;
    }
    public void pushFront(int d){
        Node n = new Node(d);
        if(front == null){
            front = n;
            rear = n;
        }
        else{
            n.next = front;
            front = n;
        }
    }
    public void pushRear(int d){
        Node n = new Node(d);
        if(rear == null){
            front = n;
            rear = n;
        }
        else{
            rear.next = n;
            rear = n;
        }
    }
    public void popFront(){
        if(front == null)
            System.out.println("Dequeue empty!");
        else{
            int d = front.data;
            front = front.next;
            if(front == null)
                rear = null;
            System.out.println(d + " popped from front.");
        }
    }
    public void popRear(){
        if(rear == null)
            System.out.println("Dequeue empty!");
        else{
            int d = rear.data;
            if(front == rear){
                front = null;
                rear = null;
            }
            else{
                Node n = front;
                while(n.next != rear)
                    n = n.next;
                rear = n;
                rear.next = null;
            }
            System.out.println(d + " popped from rear.");
        }
    }
    public void display(){
        if(front == null)
            System.out.println("Dequeue empty!");
        else{
            Node n = front;
            System.out.println("Dequeue contents:");
            while(n != null){
                System.out.print(n.data + "\t");
                n = n.next;
            }
            System.out.println();
        }
    }
}
