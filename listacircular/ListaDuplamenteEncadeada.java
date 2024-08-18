class ListaDuplamenteEncadeada {
    Node sentinela;

    ListaDuplamenteEncadeada() {
        sentinela = new Node(0);
        sentinela.prev = sentinela.next = sentinela;
    }

    void inserirEmOrdem(int data) {
        Node novoNode = new Node(data);
        Node current = sentinela.next;

        while (current != sentinela && current.data < data) {
            current = current.next;
        }

        novoNode.next = current;
        novoNode.prev = current.prev;
        current.prev.next = novoNode;
        current.prev = novoNode;
    }

    void imprimirListaCrescente() {
        Node current = sentinela.next;
        while (current != sentinela) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void imprimirListaDecrescente() {
        Node current = sentinela.prev;
        while (current != sentinela) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    void removerPrimos() {
        Node current = sentinela.next;
        while (current != sentinela) {
            if (ehPrimo(current.data)) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            current = current.next;
        }
    }

    boolean ehPrimo(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
