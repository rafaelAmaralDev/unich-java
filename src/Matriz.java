import java.util.Scanner;

public class Matriz {
    //faça um programa que leia uma matriz de qualquer quantidade de  elementos mas precisa ser o mesmo número, se não for, precisa dizer que não pode efetuar operação. calcule a soma dos elementos que estão na diagonal principal.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = input.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = input.nextInt();
        int[][] matriz = new int[linhas][colunas];
        int cotadorDiagonal = 0;

        if (linhas != colunas) {
            System.out.println("Não é possível efetuar a operação. O número de linhas e colunas deve ser o mesmo.");
        } else {
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.printf("matriz [%d][%d] = ", i, j);
                    matriz[i][j] = input.nextInt();
                    if (i == j) {
                        cotadorDiagonal += matriz[i][j];
                    }
                }
            }
            System.out.println("Soma dos elementos da diagonal principal: " + cotadorDiagonal);
        }
    }
}
