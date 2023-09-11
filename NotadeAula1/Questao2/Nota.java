package Questao2;

import java.util.Scanner;

public class Nota {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.next();

        System.out.println("Informe sua primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a sua segunda nota: ");
        double nota2 = sc.nextDouble();

        Media aluno = new Media(nome, nota1, nota2);
        aluno.exibirMedia();

        sc.close();

    }

}
