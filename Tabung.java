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
public class Tabung extends Lingkaran implements MenghitungRuang {
    private double height1;
    
    public Tabung(double r, double h){
        super(r);
        this.height1 = h;
    }

    public double getHeight1() {
        return height1;
    }

    public void setHeight1(double height1) {
        this.height1 = height1;
    }
    
    @Override
    public double volume() {
        return super.area()*height1;
    }

    @Override
    public double surface() {
        return 2*pi*super.getR1()*(super.getR1()+height1);
    }
    
}
