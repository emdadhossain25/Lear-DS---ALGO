package session5;

public class Recusrsion {
    public static void main(String[] args) {
//        print(5);
        printInc(5);
    }

    private static void print(int n) {
        if (n == 0) {
            return;
        }
//        printing before pushing in stack
        System.out.println(n);
        print(n - 1);
    }

    private static void printInc(int n) {
        if (n == 0) {
            return;
        }
//        pushing in stack
        printInc(n - 1);
//        poping out of the stack and printing
        System.out.println(n);
    }
}



