package com.company.schmidt;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       int fTemp =  getUserInput();
        fahrenheit(fTemp);
    }
    static int getUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a temp in fahrenheit");
        int temp = sc.nextInt();
        return temp;
    }
    static void fahrenheit(double a){

        while (a>-460){
            double celsius = 5*(a-32)/9;
            displayOutput(celsius);
            a = getUserInput();
        }
        System.out.println("what you entered was below -460");
    }
    static void displayOutput(double a){
        System.out.println(a);
    }




}
