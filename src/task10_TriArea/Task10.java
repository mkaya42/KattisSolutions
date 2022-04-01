package task10_TriArea;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int base = input.nextInt();
        double area = (height * base) / 2.0;
        System.out.println(area);
    }
}
