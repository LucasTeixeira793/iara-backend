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

@Entity
@Data
@NoArgsConstructor
@Immutable
@AllArgsConstructor
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_semana_anterior_por_prestador hs")
@Table(name = "vw_ct_semana_anterior_por_prestador")
public class ViewCtSemanaAnteriorPorPrestador {
    @JsonIgnore
    @Id
    private String id;

    @Column(name="prestador_id")
    private Integer prestadorId;

    @Column(name="ct_semana_anterior_por_prestador")
    private Integer ct_semana_anterior_por_prestador;

}
