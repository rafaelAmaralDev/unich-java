public class MediaAritmetica {

    public static void main(String[] args){

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double num2 = scanner.nextDouble();

        double media = (num1 + num2) / 2;

        System.out.printf("A média das notas é: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media >= 4) {
            System.out.println("Aluno vai para a Final!");
            System.out.println("Qual o valor da nota final?");
            double notaFinal = scanner.nextDouble();
            if (notaFinal >= 5) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}