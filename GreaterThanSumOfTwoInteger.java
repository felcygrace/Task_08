package Task_08;

import java.util.Scanner;

public class GreaterThanSumOfTwoInteger {
    public static void main(String[] args) {
        System.out.print("Enter the four integers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        if((a+b)>(c+d)){
            System.out.println("The sum of a and b is greater than sum of c and d");
        }
        else{
            System.out.println("The sum of a and b is not greater than sum of c and d");
        }
    }
}
