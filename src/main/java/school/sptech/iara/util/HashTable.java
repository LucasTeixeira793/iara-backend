package school.sptech.iara.util;

import school.sptech.iara.enums.Letras;
import school.sptech.iara.model.Cliente;

public class HashTable {

    // Atributo
    private ListaLigada[] table;

    // Construtor
    public HashTable() {
        int tam = 10;
        this.table = new ListaLigada[tam];
        for (int i = 0; i < table.length; i++) {
            table[i] = new ListaLigada();
        }
    }

    // Métodos

    public Integer funcaoHash(String valor){ // Retorna o numero da lista que será inserida na lista
        String inicial = valor.substring(0,1);
        for(Integer i = 0; i < 10; i++){
            if (i.toString().equals(inicial)){
                return i;
            }
        }
        return null;
    }


    public void insere(Cliente valor) {
        this.table[funcaoHash(valor.getCpf())].insereNode(valor);
    }

    public Cliente busca(String cpf) {
        Node nodeCliente = this.table[funcaoHash(cpf)].buscaNode(cpf);
        return nodeCliente == null ? null : nodeCliente.getInfo();
    }

    public boolean remove(Cliente valor) {
        return this.table[funcaoHash(valor.getCpf())]
                .removeNode(valor);
    }

    public void exibe(){
        for (ListaLigada lista: this.table) {
            lista.exibe();
        }
    }

}
