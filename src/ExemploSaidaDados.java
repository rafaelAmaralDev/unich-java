import java.util.Scanner;

public class ExemploSaidaDados {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome:");
        nome = input.nextLine();
        
        System.out.print("Digite sua idade:");
        idade = input.nextInt();
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Olá, eu sou Java! Seu nome é " + nome + " e você tem " + idade + " anos!");
        
    }
}