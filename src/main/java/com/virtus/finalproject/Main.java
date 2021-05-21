package com.virtus.finalproject;
import java.util.Scanner;
/*
    This project has two function Array and LinkedList.
    In Array you can select what dimension your using, in Linkedlist you only ask to input a sequnce of number.
    Once you selected a dimension in Array you ask to input a size and a sequence of number and then you can
    do what you want on the Array, you can sort it, reverse and do both of these.
    On the other hand in LinkedList you only ask if you want to insert new number or clear the Linkedlist.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayTypes array = new ArrayTypes();
        LinkedLists list = new LinkedLists();
        
        System.out.println("[1] Array");
        System.out.println("[2] LinkedList");
        System.out.println("Choose: ");
        int choose = scan.nextInt();
        
        switch(choose) {
            case 1: 
                array.selectMethod();
                array.whatToDo();
                break;
            case 2: list.getData(); break;
        }
    }
    
}
