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
public class expt1b {
    public static void main(String[] args){
        int i;
        int a[]=new int[5];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
        a[i]=obj.nextInt();
        }        
        for(i=0;i<5;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println("The number " +a[i]+ " is even");
            }
            else
                System.out.println("The number " +a[i]+ " is odd");
        }
    }
    
}
