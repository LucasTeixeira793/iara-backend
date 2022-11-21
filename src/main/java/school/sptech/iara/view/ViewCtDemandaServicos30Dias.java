package school.sptech.iara.view;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Immutable
@AllArgsConstructor
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_procura_servicos_ultimo_mes_agrupado_por_servico hs")
@Table(name = "vw_ct_procura_servicos_ultimo_mes_agrupado_por_servico")
public class ViewCtDemandaServicos30Dias {
    @Id
    private String id;

    @Column(name="servico")
    private String servico;

    @Column(name="ct_atendimentos")
    private Integer ct_atendimentos;
}
