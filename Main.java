/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author MYWINDOWS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        double l, w, h, r;
        boolean loop=true;
        
        Scanner input = new Scanner(System.in);
        
        while (loop){
            System.out.println("\n+===========+");
            System.out.println("| Main Menu |");
            System.out.println("+===========+");
            System.out.println("1. Rectangle & Beam Calculator");
            System.out.println("2. Cirle & Tube Calculator");
            System.out.println("3. Exit");
            System.out.print("Choose : ");
            x = input.nextInt();
            
            switch (x){
                case 1:
                    System.out.print("\nInput length : ");
                    l = input.nextInt();
                    System.out.print("Input width : ");
                    w = input.nextInt();
                    System.out.print("Input height : ");
                    h = input.nextInt();
                    
                    Balok beam = new Balok(l,w,h);
                    
                    System.out.println("\nRectangle area = " + beam.area());
                    System.out.println("Rectangle perimeter = " + beam.circum());
                    System.out.println("Beam volume = " + beam.volume());
                    System.out.println("Beam surface area = " + beam.surface());
                    System.out.println("\nGo back? (Yes : 1 || No : 0)");
                    System.out.print("Choose : ");
                    y = input.nextInt();
                    loop = y != 0;
                    break;
                case 2:
                    System.out.print("\nInput height : ");
                    h = input.nextInt();
                    System.out.print("Input radius : ");
                    r = input.nextInt();

                    Tabung tube = new Tabung(r,h);

                    System.out.println("\nCircle area = " + tube.area());
                    System.out.println("Circle circumference = " + tube.circum());
                    System.out.println("Tube volume = " + tube.volume());
                    System.out.println("Tube surface area = " + tube.surface());
                    System.out.println("\nGo back? (Yes : 1 || No : 0)");
                    System.out.print("Choose : ");
                    y = input.nextInt();
                    loop = y != 0;
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Option not available");
                    break;
            }
        }
    }
}
