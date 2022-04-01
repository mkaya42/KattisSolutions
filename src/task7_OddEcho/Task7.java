package task7_OddEcho;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        String word = "";
        int groupId = input.nextInt();
        int count = 0;

        while (count < groupId) {
            word = input.next();
            wordList.add(word);
            count++;
        }
        for (int i = 0; i < wordList.size(); i++) {

            if(i%2==0){
                System.out.println(wordList.get(i));
            }
        }


    }
}
