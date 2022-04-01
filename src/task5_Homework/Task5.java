package task5_Homework;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        String word = "1-3;5;7;10-13";
        String[] wordArr = word.split(";");
        String[] wordArr2 =new String[2];

        ArrayList <Integer> sumOfNumbersList ;
        int  countInterval=0;
        int reference=0;
        for(int i =0;i<wordArr.length;i++){

            if (wordArr[i].length() != 1) {
                wordArr2 = wordArr[i].split("-");

                if(wordArr2.length==2){
                    countInterval+=Integer.parseInt(wordArr2[1])-Integer.parseInt(wordArr2[0]);

                }

            }
        }
        int result = countInterval+wordArr.length;
        System.out.println("The Result is "+result);


    }
}
