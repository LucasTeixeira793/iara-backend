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
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_dia_semana_prestador hs")
@Table(name = "vw_ct_dia_semana_prestador")
public class ViewCtDiaSemanaPrestador {

    @Id
    private String id;

    @Column(name="prestador")
    private Integer prestador;

    @Column(name="dia")
    private String dia;

    @Column(name="qtd_atendimentos")
    private Integer qtd_atendimentos;

}
