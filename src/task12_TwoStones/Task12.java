package task12_TwoStones;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n%2==1){
            System.out.println("Alice");
        }
        else {
            System.out.println("Bob");
        }
    }
}
