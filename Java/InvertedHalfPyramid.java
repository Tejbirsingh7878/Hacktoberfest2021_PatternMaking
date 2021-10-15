package com.kholood;

import java.util.Scanner;
public class InvertedHalfPyramid
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: "); //takes input from user

        int rows = sc.nextInt();

        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    // mirror number pattern 
    /*
     12345
   1234
  123
 12
1 */
    
    public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter the value ");
		  int n=s.nextInt();
		  int i=1;
		  while(i<=n) {
			  int j=1;
			  while(j<=n-i) {
				  System.out.print(" ");
				  j++;
			  }
			  j=1;
			  while(j<=n-i+1) {
				  System.out.print(j);
				  j++;
			  }
					
			  System.out.println();
			  i++;
		  }
}
