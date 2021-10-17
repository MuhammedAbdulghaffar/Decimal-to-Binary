/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinary;

import java.util.Scanner;

/**
 *
 * @author xhivd
 */
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int decimal = input.nextInt();
		System.out.println("The binary number is " + Integer.toBinaryString(decimal));
        
        
        
        // TODO code application logic here
    }
    
}
