/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022C
  Assessment: Test 1
  Author: Kim minsung
  ID: Your student: s3866724
  Created date: 03/12/2022
  Acknowledgement: Acknowledge the resources that you use here.
*/

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";

        char[] arr = new char[upper_case.length()];
        char[] arr1 = new char[lower_case.length()];

        for (int i = 0; i < upper_case.length(); i++) {
            arr[i] = upper_case.charAt(i);
        }

        for (int j = 0; j < lower_case.length(); j++) {
            arr1[j] = lower_case.charAt(j);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

    }
}
