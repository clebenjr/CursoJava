import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int nA = scanner.nextInt();

        for (int i = 0; i <nA; i++){
            set.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course B? ");
        int nB = scanner.nextInt();

        for (int i = 0; i <nB; i++){
            set.add(new Student(scanner.nextInt()));
        }

        System.out.print("How many students for course C? ");
        int nC = scanner.nextInt();

        for (int i = 0; i <nC; i++){
            set.add(new Student(scanner.nextInt()));
        }

        System.out.println("Total students: " + set.size());

        scanner.close();
    }
}