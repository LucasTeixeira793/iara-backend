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
@Subselect("SELECT uuid() AS id, hs.* FROM vw_grafico_procura_30_dias hs")
@Table(name = "vw_grafico_procura_30_dias")
public class ViewGraficoProcura30Dias {
    @JsonIgnore
    @Id
    private String id;

    @Column(name="tipo")
    private String tipo;

    @Column(name="atendimentos")
    private Integer atendimentos;

}
