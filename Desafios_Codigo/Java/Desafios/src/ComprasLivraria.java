import java.util.Scanner;

public class ComprasLivraria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        double valorTotalCompra = (livro1.preco* livro1.quantidade) + (livro2.preco* livro2.quantidade);
        int quantidadeTotalLivros = livro1.quantidade + livro2.quantidade;
        System.out.println("Valor total da compra: " + String.format("%.2f", valorTotalCompra) + "\n"
                + "Numero de livros comprados: " + quantidadeTotalLivros + "\n" +
                "Obrigado por comprar na nossa livraria!");
        scanner.close();
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}