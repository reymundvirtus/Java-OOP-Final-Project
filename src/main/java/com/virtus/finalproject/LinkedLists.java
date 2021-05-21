package com.virtus.finalproject;
import java.util.Scanner;
import java.util.LinkedList; // including the LinkedList class

// this LinkedLists class is extending to abstractListFunction class and hides the method in this class
// this class has also Implementing listInterface
public class LinkedLists extends abstractListFunction implements listInterface {
    LinkedList list = new LinkedList(); // Creating object of LinkedList
    Scanner scan = new Scanner(System.in);
    public int newData, deleteData, choose;
    private int data; // we encapsulate the data in linkedlist
    protected int size;
    
    @Override
    public void getData(){
        do{
            System.out.println("Enter any number to store in linkedlist (0 to stop): ");
            data = scan.nextInt();
            list.add(data);
            
        } while (data != 0);
        
        System.out.println(list);
        selectFun();
    }
    
    @Override
    public void selectFun(){
        System.out.println("\n[1] Insert new number: ");
        System.out.println("[2] Clear all the inputs");
        System.out.println("What do you want?");
        choose = scan.nextInt();
        switch (choose){
            case 1: insertData(); break;
            case 2: clearList(); break;
        }
    }
    
    public void insertData(){
        System.out.println("Insert new number: ");
        newData = scan.nextInt();
        setter(newData);
    }
    
    public void clearList(){ // we use this setter to access the private variable
        list.clear();
        System.out.println(list + " list is empty");
        System.out.println("\nThanks for using this tool!");
    }
    
    public void setter(int newData){ // we use this setter to access the private variable
        list.addLast(newData);
        System.out.println(list);
        System.out.println("\nThanks for using this tool!");
    }
    
    public int getter(){
        return data;
    }
}
