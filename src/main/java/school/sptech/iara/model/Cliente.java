package school.sptech.iara.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Cliente extends Usuario {
//    Attributes
    @OneToMany(cascade= CascadeType.PERSIST)
    @JsonIgnore
    private List<AvaliacaoCliente> avaliacoes;
//    Constructor

    public Cliente(String nome, String sobrenome,
                   String cpf, LocalDate dataNasc,
                   String email, String senha,
                   char sexo, String telefone) {
        super(nome, sobrenome, cpf, dataNasc, email, senha, sexo, telefone);
//        avaliacoes = new ArrayList<>();
    }

//    Methods
//    Adiciona na lista de avaliações
    public void addAvaliacao(AvaliacaoCliente avaliacao) {
        avaliacoes.add(avaliacao);
    }

    @Override
//   Retourna a média de todas avaliações na lista
    public double calcAvaliacao(){
//        Double somaAvaliacoes = 0d;
//        for (AvaliacaoCliente avaliacao : avaliacoes) {
//            somaAvaliacoes += avaliacao.getAvaliacao();
//        }
//        return somaAvaliacoes/avaliacoes.size();
        return 0d;
    }

}
