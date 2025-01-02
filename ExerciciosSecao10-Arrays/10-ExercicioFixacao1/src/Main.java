import entities.Estudante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");

        int room, n = sc.nextInt();
        String nome, email;

        Estudante[] estudantes = new Estudante[10];

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.printf("Rent #%d:\n", i);
            System.out.println("Name: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Room: ");
            room = sc.nextInt();
            estudantes[room] = new Estudante(nome, email);
        }

        System.out.println();
        System.out.println("Busy rooms: ");

        for (int i = 0; i < 10; i++){
            if(estudantes[i] != null){
                System.out.print(i + ": " + estudantes[i].getNome() + ", " + estudantes[i].getEmail() + "\n");
            }
        }

        sc.close();
    }
}