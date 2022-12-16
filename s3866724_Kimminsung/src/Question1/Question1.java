package Question1;/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Assessment: Test 1
  Author: Kim minsung
  ID: Your student: s3866724
  Created date: 03/12/2022
  Acknowledgement: W2 - Control Structures & Methods, https://rmit.instructure.com/courses/113608/pages/w2-control-structures-and-methods?module_item_id=4524288
*/

import java.util.Scanner;

public class Question1 {

    public static void printFirstFiveAdditions(int n, int m) {

        for (int i = 1; i <= 5; i++) {
            int result = n + i * m;
            System.out.printf("%d + %d * %d = %d", n, i, m, result);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the n: ");
        int n = scanner.nextInt();

        System.out.println("Input the m: ");
        int m = scanner.nextInt();

        printFirstFiveAdditions(n, m);
    }
}
