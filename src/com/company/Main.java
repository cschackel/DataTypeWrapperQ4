package com.company;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean notANum = true;
        double num=0;
        do {
            System.out.println("Enter A Number: ");
            String userNum = input.nextLine();
            try {
                num = Double.parseDouble(userNum);
                notANum = false;
            } catch (Exception e) {
                notANum = true;
            }
        } while (notANum);

        boolean intValue = false;
        if(num%1==0)
        {
            intValue=true;
        }

        if(num>=Byte.MIN_VALUE&&num<=Byte.MAX_VALUE&&intValue)
        {
            System.out.println("Byte");
        }
        else if(num>=Short.MIN_VALUE&&num<=Short.MAX_VALUE&&intValue)
        {
            System.out.println("Short");
        }
        else if(num>=Integer.MIN_VALUE&&num<=Integer.MAX_VALUE&&intValue)
        {
            System.out.println("Int");
        }
        else if(num>=Float.MIN_VALUE&&num<=Float.MAX_VALUE)
        {
            System.out.println("Float");
        }
        else if(num>=Long.MIN_VALUE&&num<=Long.MAX_VALUE&&intValue)
        {
            System.out.println("Long");
        }
        else if(num>=Double.MIN_VALUE&&num<=Double.MAX_VALUE)
        {
            System.out.println("Double");
        }
        else
        {
            System.out.println("BigDecimal");
        }
    }
}
