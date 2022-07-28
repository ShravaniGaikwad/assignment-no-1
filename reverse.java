/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprograms;

/**
 *
 * @author kanev
 */
public class reverse {
   public static void main(String[] args) {
        int num;
        int sum;
        int temp;

        System.out.print("Enter an integer, positive or negative: ");
        num = keyboard.nextInt();
        System.out.println();

        if (num < 0)
            num = -num;

        sum = 0;

        while (num > 0) {
            temp = num;
            sum = sum + num % 10;           //Extracts the last digit and adds it to the sum
            num = num / 10;                 //removes the last digit
            System.out.print(temp % 10 + " ");
        }

        System.out.println(" and the sum is " + sum);
    }
}
