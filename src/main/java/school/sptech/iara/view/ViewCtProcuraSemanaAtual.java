package school.sptech.iara.view;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Immutable
@AllArgsConstructor
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_procura_semana_atual hs")
@Table(name = "vw_ct_procura_semana_atual")
public class ViewCtProcuraSemanaAtual {

    @JsonIgnore
    @Id
    private String id;

    @Column(name="dia_semana")
    private String diaSemana;

    @Column(name="data")
    private LocalDate data;

    @Column(name="qtd_servicos")
    private Integer qtdServicos;

}
