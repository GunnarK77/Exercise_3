package com.company.schmidt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        fahrenheit();
    }
    static void fahrenheit(){
        Scanner sc = new Scanner(System.in);
        double temp;

        for (;;){
            System.out.println("Enter a temp in fahrenheit: ");
            temp = sc.nextInt();
            double celsius = 5*(temp-32)/9;
            System.out.println(celsius);
            if (temp<-460) {
                System.out.println("You entered a number lower than absolute 0");
                break;
            }
        }

    }
}
