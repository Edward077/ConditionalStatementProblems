package com.Edward;

public class Main {

    public static void main(String[] args) {
	// While statement
        int sum = 0; // initialized the sum
        int number = 1; // initialized the number

        while (number <= 100){

            sum += number;
            number += 1;

        }
        System.out.println(sum);

        int  x = 10;
        while (x < 20){
            System.out.println("Print X = " +x);
            x++;
       }
        int sum =0;

        for (int number =1; number<=100; number++){
            sum += number;
        }
        System.out.println(sum);




    }
}
