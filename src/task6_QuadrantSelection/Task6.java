package task6_QuadrantSelection;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int quadrant=0;

        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();

        if(a>0 && b>0){
            quadrant=1;
        }
        else if(a<0 && b>0){
            quadrant=2;
        }
        else if(a<0 && b<0){
            quadrant=3;
        }
        else if(a>0 && b<0){
            quadrant=4;
        }
        System.out.println(quadrant);
    }
}
