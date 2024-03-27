package Task_08;

import java.util.Scanner;

public class EvenNumbers {
    int number;

    public void findOddOrEven(int num){
        if(num%2==0){
            System.out.println("The given number is an even number");
        }
        else{
            System.out.println("The given number is not an even number");
        }
        
    }

    public void getInputFromUser(){
        
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
    }
        
    public static void main(String[] args) {
      EvenNumbers evennumbers = new EvenNumbers();

      evennumbers.getInputFromUser();
      evennumbers.findOddOrEven(evennumbers.number);
      
    }
}
