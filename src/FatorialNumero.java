import java.util.Scanner;

public class FatorialNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.println("Número: ");
        valor = input.nextInt();
        if (valor < 0) {
            System.out.println("Valor inválido");
        } else {
            int fatorial = 1;
            for(int i = 1; i <= valor; i++) {
                fatorial =  fatorial * i;
            }
            System.out.println("Fatorial: " + fatorial);
        }
        input.close();
    }
}
