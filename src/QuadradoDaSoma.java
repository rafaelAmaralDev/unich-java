public class QuadradoDaSoma {
    public static void main(String[] args) throws Exception {

        int somaQuadrados = 0;
        int quadradoSoma = 0;
        
        do {
            int i = 1;
            while (i <= 10) {
                somaQuadrados += i * i; //soma dos quadrados
                System.out.println("Este é o valor da soma dos quadrados: " + somaQuadrados);
                i++;
            }
        } while (false);
        System.out.println("------------------------------");
        do {
            int i = 1;
            while (i <= 10) {
                quadradoSoma += i; //soma dos numeros
                System.out.println("Este é o valor da soma dos numeros: " + quadradoSoma);
                i++;
            }
        } while (false);
        quadradoSoma = quadradoSoma * quadradoSoma; //quadrado da soma
        System.out.println("Este é o valor do quadrado da soma: " + quadradoSoma);

        System.out.println("------------------------------");

        int diferenca = quadradoSoma - somaQuadrados;
        System.out.println("A diferença entre o quadrado da soma e a soma dos quadrados é: " + diferenca);
    }
}
