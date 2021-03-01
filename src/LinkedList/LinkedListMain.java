/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 27-02-2021
 *   Time: 20:40
 *   File: LinkedListMain.java
 */

package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList1 ll = new LinkedList1();


        ll.addFront(new Node(14));
        ll.addFront(new Node(15));
        ll.addFront(new Node(16));

        ll.display();
    }
}
