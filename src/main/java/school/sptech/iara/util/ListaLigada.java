package school.sptech.iara.util;

import school.sptech.iara.model.Cliente;

public class ListaLigada {

    // Atributos
    private Node head;

    // Construtor
    public ListaLigada() {
        head = new Node(null);
    }

    // Métodos
    public void insereNode(Cliente valor) {
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void exibe()
    {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.print(atual.getInfo() + "\t");
            atual = atual.getNext();
        }
        System.out.println();
    }

    public Node buscaNode(String valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo().getCpf().equals(valor)) {
                return atual;
            }
            atual = atual.getNext();
        }
        return null;
    }

    public Boolean removeNode(Cliente valor) {
        Node ant = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo().equals(valor)) {
                ant.setNext(atual.getNext());
                return true;
            }
            ant = atual;
            atual = atual.getNext();
        }
        return false;
    }

    public int getTamanho() {
        Node atual = head.getNext();
        int tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }

}
