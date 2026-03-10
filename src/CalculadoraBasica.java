import java.util.Scanner;

public class CalculadoraBasica {
    public static double somar(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        String operacao;

        System.out.println("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.println("Digite a operação 1 para somar: ");
        System.out.println("Digite a operação 2 para subtrair: ");
        System.out.println("Digite a operação 3 para multiplicar: ");
        System.out.println("Digite a operação 4 para dividir: ");
        System.out.println("Digite a operação 5 para sair: ");
        operacao = input.next();

        double resultado = 0.0;
        switch (operacao) {
            case "1":
                resultado = somar(num1, num2);
                break;
            case "2":
                resultado = subtrair(num1, num2);
                break;
            case "3":
                resultado = multiplicar(num1, num2);
                break;
            case "4":
                if (num2 != 0) {
                    resultado = dividir(num1, num2);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                break;
            case "5":
                System.out.println("Saindo...");
                return;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}