public class Main
{
    public static void main(String[] args) {
        String texto = "Foo Fighters";
        int tamanho = texto.length();
		System.out.println(tamanho);

        String nome = "Gabriel";
        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);

        String linguagem = "Java";
        String linguagemMinuscula = linguagem.toLowerCase();
        System.out.println(linguagemMinuscula);
        
        String palavra = "Java";
        char primeiroChar = palavra.charAt(0);
        System.out.println(primeiroChar);

        String email = "usuario@dominio.com";
        boolean contemArroba = email.contains("@");
        System.out.println(contemArroba);

        String texto2 = "Olá, mundo";
        boolean contemMundo = texto2.contains("mundo");
        System.out.println(contemMundo);

        String email2 = "usuario@dominio.com";
        int indiceArroba = email2.indexOf("@");
        System.out.println(indiceArroba);

        String frase = "Programação em Java";
        int indiceJava = frase.indexOf("Java");
        System.out.println(indiceJava);
	}
}
