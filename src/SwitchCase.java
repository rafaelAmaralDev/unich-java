import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        
        System.out.println("Digite seu sexo: M, ou F");
        String sexo = scanner.next();

        switch (sexo) {
            case "M":
            case "m":
                double pesoIdealM = (72.7 * altura) - 58;
                System.out.printf("Seu peso ideal é: %.2f%n", pesoIdealM);
                break;

            case "F":
            case "f":
                double pesoIdealF = (62.1 * altura) - 44.7;
                System.out.printf("Seu peso ideal é: %.2f%n", pesoIdealF);
                break;

            default:
                System.out.println("Sexo inválido");
                break;
        }

        scanner.close();
    }
}