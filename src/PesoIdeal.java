import java.util.Scanner;

public class PesoIdeal {

    public static double calcularIMC(double pesoAtual, double altura){
        double imc = pesoAtual / (altura * altura);
        return imc;
    }

    public static double calcularPesoIdeal(String sexo, double altura){
        double pesoIdeal = 0.0;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Use 'M' para masculino ou 'F' para feminino.");
        }
        return pesoIdeal;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sexo;
        double altura;
        double pesoAtual;

        System.out.println("Digite seu sexo (M/F): ");
        sexo = input.next();

        System.out.println("Digite sua altura do paciente: ");
        altura = input.nextDouble();

        System.out.println("Digite seu peso atual: ");
        pesoAtual = input.nextDouble();

        double imc = calcularIMC(pesoAtual, altura);
        double pesoIdeal = calcularPesoIdeal(sexo, altura);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Seu peso ideal é: " + pesoIdeal);

    }

}
