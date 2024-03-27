package Task_08;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int sum =1;
    for(int i=1;i<=number;i++){
        sum =sum*i;
    }
    System.out.print(sum);
    }
    
}
