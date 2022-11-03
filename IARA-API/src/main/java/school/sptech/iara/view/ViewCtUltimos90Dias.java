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
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Immutable
@AllArgsConstructor
@Subselect("SELECT uuid() AS id, hs.* FROM vw_ct_ultimos_90_dias hs")
@Table(name = "vw_ct_ultimos_90_dias")
public class ViewCtUltimos90Dias implements Serializable {

    @Id
    private String id;

    @Column(name="ct_ultimos_90_dias")
    private Integer ct_ultimos_90_dias;

}
