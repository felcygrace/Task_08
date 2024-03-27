package Task_08;

import java.util.Scanner;

public class CountNumbersOfIntegers {
    int number;
    public void getUserInput(){
        Scanner sc =new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
    }
    public void numberOfDigits(int number){
       int count =0;
       
       if(number ==0){
        count =1;
       }
       else{
        int temp_digit = number;
        while(temp_digit!=0){
            temp_digit /=10;
            count++;
        }
        
       }
       System.out.print("The number of digit in "+ number+ " is: "+ count);
    }



    public static void main(String[] args) {
        CountNumbersOfIntegers countnumberofintegers = new CountNumbersOfIntegers();
        countnumberofintegers.getUserInput();
        countnumberofintegers.numberOfDigits(countnumberofintegers.number);
    }
}
