package Task_08;


import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the input value:"+ " ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int num3=0;
        while (num3==0) {
            num3=num2;
            num2=num1;
            num1=num3;
        }
    System.out.println("The given numbers are: num 1 "+num1+" and num 2 "+num2);
    
    }

    }