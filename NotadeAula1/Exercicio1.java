import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe a sua matrícula: ");
        int matricula = sc.nextInt();

        System.out.println("Informe o seu nome: ");
        String nome = sc.next();

        System.out.println("Informe o salário bruto: ");
        double salarioBruto = sc.nextDouble();

        Dados colaborador = new Dados(matricula, nome, salarioBruto);
        colaborador.exibirContracheque();

        sc.close();
    }
}
