import java.util.Scanner;

public class TesteRadiano {
    public static void main(String[] args) {               
           
        double g, r;
        final double pi = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do ângulo em graus:");
        g = input.nextDouble();

        r = g * pi / 180;

        System.out.println("O valor do ângulo em radianos é: " + r);
    }
}
