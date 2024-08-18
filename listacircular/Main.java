import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] numeros = new int[1000];

        // Gerando 1000 números aleatórios entre -9999 e 9999
        for (int i = 0; i < 1000; i++) {
            numeros[i] = aleatorio.nextInt(19999) - 9999;
        }

        // Imprimindo os números na ordem de geração
        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // Inserindo números na lista encadeada em ordem crescente
        for (int num : numeros) {
            lista.inserirEmOrdem(num);
        }

        // Imprimindo a lista em ordem crescente
        System.out.println("Lista em ordem crescente:");
        lista.imprimirListaCrescente();

        // Imprimindo a lista em ordem decrescente
        System.out.println("Lista em ordem decrescente:");
        lista.imprimirListaDecrescente();

        // Removendo números primos da lista
        lista.removerPrimos();

        // Imprimindo a lista após a remoção dos primos
        System.out.println("Lista após remoção dos números primos:");
        lista.imprimirListaCrescente();
    }
}
