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
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_ultimos_7_dias_por_prestador hs")
@Table(name = "vw_ct_ultimos_7_dias_por_prestador")
public class ViewCtUltimos7DiasPorPrestador {
    @JsonIgnore
    @Id
    private String id;

    @Column(name = "prestador_id")
    private Integer prestadorId;

    @Column(name = "ct_ultimos_7_dias")
    private Integer contagemUltimos7Dias;
}
