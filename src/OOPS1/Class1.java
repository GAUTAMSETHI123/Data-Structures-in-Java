/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 26-03-2022
 *   Time: 15:10
 *   File: Class1.java
 */

package OOPS1;

import java.util.Arrays;

public class Class1 {
    public static void main(String[] args) {
//        Student [] student = new Student[5];
//        System.out.println(Arrays.toString(student));

        Student student1 = new Student(13, "Gautam", 56.9f);
        student1.Greeting();


        System.out.println(student1.Name);
        System.out.println(student1.rollNo);
        System.out.println(student1.marks);







    }

}

class Student {  //instance variables
    int rollNo;
    String Name;
    double marks;

//    Student()
//    {
//        this.rollNo = 13;
//        this.Name = "Gautam";
//        this.marks = 89.8;
//    }

    //Parameterised constructor
    Student(int roll, String Name, float marks){
        this.marks = marks;
        this.rollNo = roll;
        this.Name = Name;
    }


    void Greeting(){
        System.out.println("hello my name is "+ this.Name);
    }
}
