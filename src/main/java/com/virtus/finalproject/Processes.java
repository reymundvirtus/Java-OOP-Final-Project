package com.virtus.finalproject;
import java.util.Scanner;
import java.util.Arrays;

// this Processes class is extending to abstractFunction class and hides the method in this class
public class Processes extends abstractArrFunction {
    Scanner scan = new Scanner(System.in);
    protected int select; // we set the select variable to protected
    protected int size, size1, size2, size3;
    
    // FOR 1D ARRAY
    @Override
    public void arrSort1D(int one[]){ // sorting 1D array
        Arrays.sort(one);
        for (int i = 0; i < size; i++){
            System.out.print(one[i] + " ");
        }
        
        selection1D(one);
    }
    
    @Override
    public void arrReverse1D(int one[]){  // reverse 1D array
        for (int i = size - 1; i >= 0; i--){
            System.out.print(one[i] + " ");
        }
        
        selection1D(one);
    }
    
    @Override
    public void bothFun1D(int one[]){ // both sort and reverse
        System.out.println("Sorted: ");
        Arrays.sort(one);
        for (int i = 0; i < size; i++){
            System.out.print(one[i] + " ");
        }
        
        System.out.println("\nReverse: ");
        for (int i = size - 1; i >= 0; i--){
            System.out.print(one[i] + " ");
        }
        
        System.out.println("\nThanks for using this tool!");
    }
    
    // FOR 2D ARRAY
    @Override
    public void arrSort2D(int two[][]){ // sorting 2D array by row using bubble sort
        // time complexity O(n2), space complexity O(1)
        int temp;
        for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
                for (int x = 0 ; x < size1; x++ ){
                    for (int y = 0 ; y < size2; y++ ){
                        if (two[i][j] < two[x][y]){
                            temp = two[i][j];
                            two[i][j] = two[x][y];
                            two[x][y] = temp;
                        }
                    }
                }
            }
        }
                            
        for (int i = 0 ; i < size1; i++ ){ // displaying the sorted array
            for (int j = 0 ; j < size2; j++ ){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
    	}
        
        selection2D(two);
    }
    
    @Override
    public void arrReverse2D(int two[][]){  // reverse 2D array
        for (int i = size1 - 1; i >= 0; i--){
            for (int j = size2 - 1; j >= 0; j--){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }
        
        selection2D(two);
    }
    
    @Override
    public void bothFun2D(int two[][]){ // both sort and reverse
        System.out.println("Sorted: ");
        // time complexity O(n2), space complexity O(1)
        int temp;
        for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
                for (int x = 0 ; x < size1; x++ ){
                    for (int y = 0 ; y < size2; y++ ){
                        if (two[i][j] < two[x][y]){
                            temp = two[i][j];
                            two[i][j] = two[x][y];
                            two[x][y] = temp;
                        }
                    }
                }
            }
        }
                            
        for (int i = 0 ; i < size1; i++ ){ // displaying the sorted array
            for (int j = 0 ; j < size2; j++ ){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
    	}
        
        System.out.println("Reverse: ");
        for (int i = size1 - 1; i >= 0; i--){
            for (int j = size2 - 1; j >= 0; j--){
                System.out.print(two[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Thanks for using this tool!");
    }
    
    // FOR 3D ARRAY
    @Override
    public void arrSort3D(int three[][][]){ // sorting 3D array by row using bubble sort
        // time complexity O(n2), space complexity O(1)
        int temp;
    	for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
                for (int k = 0 ; k < size3; k++ ){
                    for (int a = 0 ; a < size1; a++ ){
                        for (int b = 0 ; b < size2; b++ ){
                            for (int c = 0 ; c < size3; c++ ){
                                if (three[i][j][k] < three[a][b][c]){
                                    temp = three[i][j][k];
                                    three[i][j][k] = three[a][b][c];
                                    three[a][b][c] = temp;
                                }
                            }
                        }
                    }
                }
            }
    	}
                            
    	for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
            	for (int k = 0 ; k < size3; k++ ){
                    System.out.print(three[i][j][k] + " ");
        	}
                System.out.println();
            }
            System.out.println();
    	}
        
        selection3D(three);
    }
    
    @Override
    public void arrReverse3D(int three[][][]){  // reverse 2D array
        for (int i = size1 - 1; i >= 0; i--){
            for (int j = size2 - 1; j >= 0; j--){
                for (int k = size3 - 1; k >= 0; k--){
                    System.out.print(three[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        selection3D(three);
    }
    
    @Override
    public void bothFun3D(int three[][][]){ // both sort and reverse
        System.out.println("Sorted: ");
        // time complexity O(n2), space complexity O(1)
        int temp;
    	for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
                for (int k = 0 ; k < size3; k++ ){
                    for (int a = 0 ; a < size1; a++ ){
                        for (int b = 0 ; b < size2; b++ ){
                            for (int c = 0 ; c < size3; c++ ){
                                if (three[i][j][k] < three[a][b][c]){
                                    temp = three[i][j][k];
                                    three[i][j][k] = three[a][b][c];
                                    three[a][b][c] = temp;
                                }
                            }
                        }
                    }
                }
            }
    	}
                            
    	for (int i = 0 ; i < size1; i++ ){
            for (int j = 0 ; j < size2; j++ ){
            	for (int k = 0 ; k < size3; k++ ){
                    System.out.print(three[i][j][k] + " ");
        	}
                System.out.println();
            }
            System.out.println();
    	}
        
        System.out.println("Reverse: ");
        for (int i = size1 - 1; i >= 0; i--){
            for (int j = size2 - 1; j >= 0; j--){
                for (int k = size3 - 1; k >= 0; k--){
                    System.out.print(three[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        System.out.println("Thanks for using this tool!");
    }
    
    // SELECTIONS
    
    public void selection1D(int one[]){ // selection for 1D
        System.out.println("\n\n[1] Sort the array");
        System.out.println("[2] Reverse the array");
        System.out.println("[3] Both 1 & 2");
        System.out.println("What do you want to do on the array? ");
        select = scan.nextInt();
        
        switch (select){
            case 1:
                arrSort1D(one); break;
            case 2:
                arrReverse1D(one); break;
            case 3:
                bothFun1D(one); break;
            default:
                System.out.println("Try Again...");
                selection1D(one);
        }
    }
    
    public void selection2D(int two[][]){ // selection for 2D
        System.out.println("\n[1] Sort the array");
        System.out.println("[2] Reverse the array");
        System.out.println("[3] Both 1 & 2");
        System.out.println("What do you want to do on the array? ");
        select = scan.nextInt();
        
        switch (select){
            case 1:
                arrSort2D(two); break;
            case 2:
                arrReverse2D(two); break;
            case 3:
                bothFun2D(two); break;
            default:
                System.out.println("Try Again...");
                selection2D(two);
        }
    }
    
    public void selection3D(int three[][][]){ // selection for 3D
        System.out.println("[1] Sort the array");
        System.out.println("[2] Reverse the array");
        System.out.println("[3] Both 1 & 2");
        System.out.println("What do you want to do on the array? ");
        select = scan.nextInt();
        
        switch (select){
            case 1:
                arrSort3D(three); break;
            case 2:
                arrReverse3D(three); break;
            case 3:
                bothFun3D(three); break;
            default:
                System.out.println("Try Again...");
                selection3D(three);
        }
    }
}