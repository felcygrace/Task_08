package Task_08;


import java.util.Scanner;

public class SeniorCitizen {
     int Age;

    public void findSeniorCitizen(int age){
        if(age>=60){
            System.out.print("The Person is a senior Citizen");
        }
        else{
            System.out.print("The person is not a senior citizen");
        }
    }

    public void getUserInput(){
        Scanner sc = new Scanner(System.in);
        Age = sc.nextInt();
        sc.close();
    }
    public static void main(String[] args) {
        SeniorCitizen seniorcitizen = new SeniorCitizen();
        seniorcitizen.getUserInput();
        seniorcitizen.findSeniorCitizen(seniorcitizen.Age);
    }
    
}
