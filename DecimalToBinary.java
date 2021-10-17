
package decimaltobinary;

import java.util.Scanner;


public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int decimal = input.nextInt();
		System.out.println("The binary number is " + Integer.toBinaryString(decimal));
        
        
        
    }
    
}







