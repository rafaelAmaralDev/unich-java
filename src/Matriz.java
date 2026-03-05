import java.util.Scanner;

public class Matriz {
    //faça um programa que leia uma matriz de 3x3 elementos. calcule a soma dos elementos que estão na diagonal principal.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int cotadorDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
