/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author SAJAL KULSHRESHTHA
 */
public class A_basic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = 5,i;//in.nextInt();
        int half = n/2,k;
        for(int j=0;j<n;j++){
           for(i=n;i>j;i--){ 
            System.out.print(" ");    
            }
           System.out.print("*");
           for(k=0;k<=j*2;k++){
               System.out.print(" ");
               
           }
          System.out.println("*");
           }
        System.out.println("hello world");
      /* for(int k =0;k<n;k++){
           for(int l=0;l<k;l++ ){
                System.out.print(" ");
            }   
            
            System.out.println("*");
         
          }*/
             
    }
}
