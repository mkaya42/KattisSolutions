package task4_Autori;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word= input.nextLine();
        String [] wordArr = word.split("-");
        String output="";

        for (int i =0;i< wordArr.length;i++){
            output+=wordArr[i].substring(0,1);
        }
        System.out.println(output);
    }
}
