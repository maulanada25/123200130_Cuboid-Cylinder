/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author MYWINDOWS
 */
public class Lingkaran implements MenghitungBidang {
    private double r1;
    
    public Lingkaran (double r){
        this.r1 = r;
    }

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }
    
    @Override
    public double area() {
        return pi*(r1*r1);
    }

    @Override
    public double circum() {
        return 2*pi*r1;
    }
    
}
