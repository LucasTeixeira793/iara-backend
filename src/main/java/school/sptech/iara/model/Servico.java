package school.sptech.iara.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@Entity
public class Servico {
//    Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Min(10)
    private double valor;
    @NotNull
    private String descricao;
    @NotNull
    private String tipo;
    private boolean ativo;
    @NotNull
    private LocalTime duracaoEstimada;

//    @OneToMany
//    private List<ServicoAtribuido> servicoAtribuidos;

    @NotNull
    private Integer prestador;

//    Constructor
    public Servico(double valor, String descricao, String tipo, LocalTime duracaoEstimada, Prestador prestador) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
        ativo = true;
        this.prestador = prestador.getId();
        this.duracaoEstimada = duracaoEstimada;
    }
    public Servico(double valor, String descricao, String tipo, LocalTime duracaoEstimada) {
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
        ativo = true;
        this.duracaoEstimada = duracaoEstimada;
//        servicoAtribuidos = new ArrayList<>();
    }


    // Retorna a quantidade de serviços avaliados
    public int getQtdServicosAvaliados(){
        int soma = 0;
//        for (ServicoAtribuido serv: servicoAtribuidos) {
//            if (Objects.nonNull(serv.calcAvaliacao())){
//                soma++;
//            }
//        }
        return soma;
    }

    //Retorna média das avaliações dos servicos atribuidos a este
    public double getAvaliacao(){
        Double somaAvaliacoes = 0d;
//        for (ServicoAtribuido serv: servicoAtribuidos) {
//            Double avaliacao = serv.calcAvaliacao();
//            if(!avaliacao.isNaN()){
//                somaAvaliacoes += serv.calcAvaliacao();
//            }
//        }
//        if(!somaAvaliacoes.isNaN()){
//            return somaAvaliacoes/servicoAtribuidos.size();
//        }else{
//            return 0d;
//        }
        return 0d;
    }


    //Se servicoAtribuido não existir na lista, adiciona
    public void addServicoAtribuido(ServicoAtribuido servicoAtribuido){

    }

    // Deleta o registro de ServicoAtribuido da lista somente se ele não estiver finalizado ainda
    public void cancelarServicoAtribuido(@NotNull ServicoAtribuido servico){
        if (!servico.isFinalizado()){

        }
    }

    public void desativarServico(){
        boolean existeServicosAtribuidosNaoFinalizados = false;

        if (!existeServicosAtribuidosNaoFinalizados){
            setAtivo(false);
        }
    }

    // Altera os valores dos atributos da classe pelos passados por parâmetro, menos o ativo
    public void atualizarServico(double valor, String descricao, String tipo){
        setValor(valor);
        setDescricao(descricao);
        setTipo(tipo);
    }

}

