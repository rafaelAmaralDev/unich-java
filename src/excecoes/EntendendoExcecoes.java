package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class EntendendoExcecoes {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0; // ArithmeticException
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage() + " - Divisão por zero não é permitida.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            String texto = null;
            System.out.println(texto.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage() + " - Tentativa de acessar um objeto nulo.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage() + " - Índice fora dos limites do array.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            String numeroString = "abc";
            int numero = Integer.parseInt(numeroString); // NumberFormatException
            System.out.println("Número: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage() + " - Formato de número inválido.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            int numero = -5;
            if (numero < 0) {
                throw new IllegalArgumentException("O número não pode ser negativo.");
            }
            System.out.println("Número: " + numero);
        } catch (IllegalArgumentException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            Scanner scanner = new Scanner("texto");
            int numero = scanner.nextInt(); // InputMismatchException
            System.out.println("Número digitado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Era esperado um número.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            Object obj = "Texto";
            Integer numero = (Integer) obj; // ClassCastException
            System.out.println(numero);
        } catch (ClassCastException e) {
            System.out.println("Erro: Conversão de tipo inválida.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            String nome = "Java";
            System.out.println(nome.charAt(10)); // StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice inválido ao acessar a string.");
        } finally {
            System.out.println("Bloco finally executado.");
        }

        try {
            FileReader arquivo = new FileReader("arquivo.txt"); // IOException
            arquivo.read();
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao tentar ler o arquivo: " + e.getMessage());
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }
}

/*
EXPLICAÇÃO PRÁTICA DAS EXCEÇÕES UTILIZADAS

ArithmeticException
Ocorre quando uma operação matemática inválida é realizada.
Exemplo prático: tentar dividir um número por zero.

NullPointerException
Acontece quando tentamos acessar um objeto que não foi inicializado.
Exemplo prático: chamar um método de uma variável que está com valor null.

ArrayIndexOutOfBoundsException
Ocorre quando tentamos acessar uma posição de um array que não existe.
Exemplo prático: um array com 3 posições e tentar acessar a posição 5.

NumberFormatException
Acontece quando tentamos converter uma String para número, mas o conteúdo não é numérico.
Exemplo prático: tentar converter "abc" para inteiro.

IllegalArgumentException
Ocorre quando um método recebe um argumento inválido.
Exemplo prático: passar um número negativo quando o método espera apenas números positivos.

InputMismatchException
Acontece quando o tipo de dado inserido não corresponde ao esperado.
Exemplo prático: o programa espera um número inteiro, mas o usuário digita texto.

ClassCastException
Ocorre quando tentamos converter um objeto para um tipo incompatível.
Exemplo prático: tentar converter uma String para Integer.

StringIndexOutOfBoundsException
Acontece quando tentamos acessar uma posição inválida dentro de uma String.
Exemplo prático: acessar o caractere de índice 10 em uma String que possui apenas 4 caracteres.

IOException
Ocorre quando há erro em operações de entrada e saída, geralmente envolvendo arquivos.
Exemplo prático: tentar abrir um arquivo que não existe no sistema.
*/