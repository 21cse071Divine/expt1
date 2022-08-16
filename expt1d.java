/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.util.Scanner;
/**
 *
 * @author 91984
 */
public class expt1d {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        float num;
        System.out.println("Enter the number:");
        num=obj.nextFloat();
        System.out.println("The Smallest integer not less than the number is");
        System.out.println(Math.ceil(num));
        System.out.println("The number is "+num);
        System.out.println("The Largest integer not greater than the number is");
        System.out.println(Math.floor(num));  
    }
}

