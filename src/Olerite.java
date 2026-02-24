import java.util.Scanner;

public class Olerite {
    public static void main(String[] args) {
        double valorHora;
        int quantidadeHora;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada:");
        valorHora = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas:");
        quantidadeHora = input.nextInt();

        double salarioBruto;
        salarioBruto = valorHora * quantidadeHora;
        double inss = 0.14 * salarioBruto;
        double ir = 0.15 * salarioBruto;
        double sindicato  = 0.05 * salarioBruto;
        double salarioLiquido = salarioBruto - (inss + ir + sindicato);

        System.out.println("+ Salário Bruto: " + salarioBruto);
        System.out.println("- INSS: " + inss);
        System.out.println("- IR: " + ir);
        System.out.println("- Sindicato: " + sindicato);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        input.close();
    }
}
