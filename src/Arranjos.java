public class Arranjos {
    public static void main(String[] args) {
    //faça um algoritmo que leia um vetor de 10 posições. conte e mostre quantos valores pares ele possui.
    int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int countPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                countPares++;
                System.out.println("Valor par encontrado: " + vetor[i]);
            }
        }
    System.out.println("Quantidade de valores pares: " + countPares);
    }
}
