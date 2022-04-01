package task13_TimeLoop;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int magicNumber =input.nextInt();
        for(int i=1;i<=magicNumber;i++){
            System.out.println(i+" Abracadabra");
        }
    }
}
