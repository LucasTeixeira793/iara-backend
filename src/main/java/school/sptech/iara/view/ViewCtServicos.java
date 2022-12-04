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
public class ViewCtServicos {
    @JsonIgnore
    @Id
    private String id;

    @Column(name="prestador")
    private Integer prestador;

    @Column(name="tipo")
    private String tipo;

    @Column(name="agendamentos")
    private Integer agendamentos;

}
