package Questao2;

public class Media {
    private String nome;
    private double nota1;
    private double nota2;

    public Media(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    public double tirarmedia() {
        return (nota1 + nota2) / 2;
    }
    public void exibirMedia() {
        System.out.println("Nota de " + nome);
        System.out.println("Sua primeira nota foi: " + nota1);
        System.out.println("Sua segunda nota foi: " + nota2);
        System.out.println("Sua média é " + tirarmedia());
        if (tirarmedia() <= 7) {
            System.out.println("Você foi aprovado!");

        } else {
            System.out.println("Você foi reprovado!");
        }
    }
}
