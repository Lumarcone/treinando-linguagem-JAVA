public class Main {
    public static void main(String[] args) {
        System.out.println("**********Esse é o Screen Match**********");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("IMDB:" + notaDoFilme);

        double media = ( 9.5 + 7.3 + 8.2) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de ação e aventura com um Delicío dos anos 80
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}