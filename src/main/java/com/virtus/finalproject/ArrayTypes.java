package com.virtus.finalproject;

// this class inherits to Processes class and has Implements to arrInterface class
public class ArrayTypes extends Processes implements arrInterface {
    
    @Override
    public void oneDim(){ // for 1D array
        System.out.println("Enter size of the 1D array: "); // getting size of array
        size = scan.nextInt();
        
        int oneD[] = new int[size];
        
        for (int i = 0; i < size; i++){ // getting the user input
            System.out.println("Enter a number in 1D array in index[" + i + "]: ");
            oneD[i] = scan.nextInt();
        }
        
        System.out.println("Size: [" + size + "]");
        
        for (int i = 0; i < size; i++){ // displaying the input value from array
            System.out.print(oneD[i] + " ");
        }
        
        selection1D(oneD);
    }
    
    @Override
    public void twoDim(){ // for 2D array
        System.out.println("Enter the first size of 2D array: ");
        size1 = scan.nextInt();
        System.out.println("Enter the second size of 2D array: ");
        size2 = scan.nextInt();
        
        int twoD[][] = new int[size1][size2];
        
        for (int i = 0; i < size1; i++){ // getting the user input using 2 loops
            for (int j = 0; j < size2; j++){
                System.out.println("Enter a number in 2D array in index[" + i + "]" + "[" + j + "]: ");
                twoD[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Row: [" + size1 + "] Column: [" + size2 + "]");
        
        for (int i = 0; i < size1; i++){ // displaying the input value from 2D array
            for (int j = 0; j < size2; j++){
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println(); // printing new line
        }
        
        selection2D(twoD);
    }
    
    @Override
    public void threeDim(){ // for 3D array
        System.out.println("Enter the first size of 3D array: ");
        size1 = scan.nextInt();
        System.out.println("Enter the second size of 3D array: ");
        size2 = scan.nextInt();
        System.out.println("Enter the third size of 3D array: ");
        size3 = scan.nextInt();
        
        int threeD[][][] = new int[size1][size2][size3];
        
        for (int i = 0; i < size1; i++){ // getting the user input using 3 loops
            for (int j = 0; j < size2; j++){
                for (int k = 0; k < size3; k++){
                    System.out.println("Enter a number in 3D array in index[" + i + "]" + "[" + j + "][" + k + "]: ");
                    threeD[i][j][k] = scan.nextInt();
                }
            }
        }
        
        System.out.println("Layer: [" + size1 + "] Row: [" + size2 + "] Column: [" + size3 + "]");
        
        for (int i = 0; i < size1; i++){ // displaying the input value from 3D array
            for (int j = 0; j < size2; j++){
                for (int k = 0; k < size3; k++){
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
        selection3D(threeD);
    }
    
    @Override
    public void selectMethod(){ // for seleting an array
        System.out.println("[1] One Dimensional");
        System.out.println("[2] Two Dimensional");
        System.out.println("[3] Three Dimensional\n");
        System.out.println("Select an array: ");
        select = scan.nextInt();
    }
        
    @Override
    public void whatToDo(){ // to invoke the selected array
        switch (select){
            case 1:
                oneDim(); break;
            case 2:
                twoDim(); break;
            case 3:
                threeDim(); break;
            default:
                System.out.println("Try Again...");
                whatToDo();
        }
    }
}
