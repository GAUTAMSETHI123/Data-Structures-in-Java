/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-06-2021
 *   Time: 10:02
 *   File: Main.java
 */

package Deque;
import java.io.*;

public class Main {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dequeue q = new Dequeue();
        while(true){
            System.out.println("1. Push from front");
            System.out.println("2. Push from rear");
            System.out.println("3. Pop from front");
            System.out.println("4. Pop from rear");
            System.out.println("5. Display");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.print("Enter data to be pushed from the front: ");
                    int d = Integer.parseInt(br.readLine());
                    q.pushFront(d);
                    break;
                case 2:
                    System.out.print("Enter data to be pushed from rear: ");
                    d = Integer.parseInt(br.readLine());
                    q.pushRear(d);
                    break;
                case 3:
                    q.popFront();
                    break;
                case 4:
                    q.popRear();
                    break;
                case 5:
                    q.display();
                    break;
                default:
                    System.out.println("Bye...");
                    return;
            }
        }
    }
}

