package com.virtus.finalproject;

public abstract class abstractArrFunction {
    // in abstract we hide the actual process or work and display the result only
    // FOR 1D ARRAY
    abstract void arrSort1D(int one[]);
    abstract void arrReverse1D(int one[]);
    abstract void bothFun1D(int one[]);
    
    // FOR 2D ARRAY
    abstract void arrSort2D(int two[][]);
    abstract void arrReverse2D(int two[][]);
    abstract void bothFun2D(int two[][]);
    
    // FOR 3D ARRAY
    abstract void arrSort3D(int three[][][]);
    abstract void arrReverse3D(int three[][][]);
    abstract void bothFun3D(int three[][][]);
}
