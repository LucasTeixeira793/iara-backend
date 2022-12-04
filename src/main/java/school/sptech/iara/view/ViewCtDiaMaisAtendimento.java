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
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_dia_mais_atendimento hs")
@Table(name = "vw_ct_dia_mais_atendimento")
public class ViewCtDiaMaisAtendimento {
    @JsonIgnore
    @Id
    private String id;

    @Column(name="prestador")
    private Integer prestador;

    @Column(name="atendimentos")
    private Integer atendimentos;

    @Column(name="dia")
    private String dia;

    public ViewCtDiaMaisAtendimento(Integer prestador, Integer atendimentos, String dia) {
        this.prestador = prestador;
        this.atendimentos = atendimentos;
        this.dia = dia;
    }
}
