public class StringManipulacao {
    public static void main(String[] args) {
        String nome = "Rafael Amaral"();
        //name = name.toUpperCase();
        //name = name.toLowerCase();        
        
        System.out.println(nome.length());
        System.out.println(nome.charAt(0));
        System.out.println(nome.concat(" Teste"));
        System.out.println(nome.contains("fael"));
        System.out.println(nome.contains("lea"));
        System.out.println(nome.equals("Rafael Amaral"));
        System.out.println(nome.equals("Rafael"));
    }
}
