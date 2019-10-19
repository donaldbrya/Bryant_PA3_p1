package com.company;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    public static int randomFunction(int num1, int num2, int type){
        int ans=0, num;
        SecureRandom randomNum = new SecureRandom();
        if(type == 5) {
            num = randomNum.nextInt(4) + 1;
        }
        else{
            num = type;
        }
        if(num == 1){
            ans = num1 + num2;
            System.out.println("How much is " + num1 + " plus " + num2 + "?");
        }
        else if(num == 2){
            ans = num1 * num2;
            System.out.println("How much is " + num1 + " times " + num2 + "?");
        }
        else if(num == 3){
            ans = num1 - num2;
            System.out.println("How much is " + num1 + " minus " + num2 + "?");
        }
        else if(num == 4){
            ans = num1 / num2;
            System.out.println("How much is " + num1 + " divided by " + num2 + "?");
        }
        return ans;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scnr = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();
        int ans, x=10, i, truAns, type, level, num1, num2, num3 = 0, val=0;
        double correct=0, wrong=0, total;


        while(true){
            System.out.println("Enter a difficulty level");
            level = scnr.nextInt();
            if(level == 1){
                x = 10;
            }
            else if(level == 2){
                x = 100;
            }
            else if(level == 3){
                x = 1000;
            }
            else if(level == 3){
                x = 10000;
            }
            System.out.println("Choose what type of arithmetic expression you would like to study");
            type = scnr.nextInt();
            for(i=0;i<10;i++) {
                num1 = randomNumbers.nextInt(x);
                num2 = randomNumbers.nextInt(x);
                num3 = randomNumbers.nextInt(4) + 1;
                truAns = randomFunction(num1, num2, type);
                ans = scnr.nextInt();

                if (ans == truAns) {
                    switch (num3) {
                        case 1:
                            System.out.println("Very Good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;

                        default:
                            break;
                    }
                    correct = correct + 1.0;
                } else {
                    switch (num3) {
                        case 1:
                            System.out.println("No, please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don't give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying.");
                            break;

                        default:
                            break;
                    }
                    wrong = wrong + 1.0;
                }
            }
                total = correct / 10.0;
                if(total >= .75){
                    System.out.println("Congratulations, you are ready to go to the next level!");
                }
                else{
                    System.out.println("Please ask your teacher for extra help.");
                }
                correct = 0;
                wrong = 0;



        }








    }
}
