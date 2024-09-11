package adoPOO;

public class TesteLocadora {

    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("Ana Silva", "123.456.789-00");
        Pessoas pessoa2 = new Pessoas("Victor Pereira", "987.654.321-00");

        Aluguel aluguel1 = new Aluguel(pessoa1, "Câmera", "2024-09-01", "2024-09-10");
        Aluguel aluguel2 = new Aluguel(pessoa2, "Projetor", "2024-09-05", "2024-09-15");

        Locadora locadora = new Locadora("Locadora XYZ");

        locadora.adicionarAluguel(aluguel1);
        locadora.adicionarAluguel(aluguel2);

        System.out.println("Detalhes das Pessoas:");
        System.out.println(pessoa1);
        System.out.println(pessoa2);

        System.out.println("\nDetalhes dos Aluguéis:");
        System.out.println(aluguel1);
        System.out.println(aluguel2);

        System.out.println("\nDetalhes da Locadora:");
        System.out.println(locadora);
    }
}