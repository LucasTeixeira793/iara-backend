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
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_total_usuarios_solicitaram_atendimento hs")
@Table(name = "vw_ct_total_usuarios_solicitaram_atendimento")
public class ViewCtUsuariosSolicitaramAtendimento {
    @JsonIgnore
    @Id
    private String id;

    @Column(name="vw_ct_total_usuarios_solicitaram_atendimento")
    private Integer vw_ct_total_usuarios_solicitaram_atendimento;
}
