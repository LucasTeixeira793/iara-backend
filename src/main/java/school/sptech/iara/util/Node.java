package school.sptech.iara.util;

import school.sptech.iara.model.Cliente;

public class Node {

    // Atributos
    private Cliente info;
    private Node next;

    // Construtor
    public Node (Cliente info) {
        this.info = info;
        next = null;
    }

    // Métodos

    public Cliente getInfo() {
        return info;
    }

    public void setInfo(Cliente info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
