package Introduction;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
//        System.out.print("Enter your age: ");
     Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextByte();
//        System.out.println(age);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
