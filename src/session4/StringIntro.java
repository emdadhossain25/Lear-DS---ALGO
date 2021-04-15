package session4;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "hello";
        subStrings(str);
    }

    private static void subStrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

}