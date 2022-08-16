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
public class expt1a {
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter the integer:");
        n=obj.nextInt();
        for(i=2;i<=n;i++)
        {
            for(j=2;j<=i;j++){
                if(i%j==0)
                    break;
            }
if(i==j)
    System.out.println("prime number:"+j);
}
}
}