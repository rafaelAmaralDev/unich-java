public class TarefaCasa {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double aumentoPercentual = scanner.nextDouble();

        double valorAumento = salario * (aumentoPercentual / 100);
        double salarioComAumento = salario + valorAumento;

        System.out.printf("Valor do aumento: %.2f%n", valorAumento);
        System.out.printf("Salário com aumento: %.2f%n", salarioComAumento);

        scanner.close();
    }
}
