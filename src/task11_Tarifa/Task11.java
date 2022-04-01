package task11_Tarifa;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x=input.nextInt();
        int n=input.nextInt();
        int t = x*(n+1);
        for(int i =0;i<n;i++){
            t-=input.nextInt();
        }
        System.out.println(t);

    }
}
