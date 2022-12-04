package school.sptech.iara.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtDiaMaisAtendimento;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtDiaMaisAtendimentoRepository extends PagingAndSortingRepository<ViewCtDiaMaisAtendimento, Long> {
    List<ViewCtDiaMaisAtendimento> findAll();
    List<ViewCtDiaMaisAtendimento> findAllByPrestador(Integer idPrestador);
    List<ViewCtDiaMaisAtendimento> findAllByPrestadorOrderByAtendimentosAsc(Integer idPrestador);
    @Query(value = "select uuid() id, null prestador, a.data dia, count(*) atendimentos from agendamento a\n" +
            "where a.servico_atribuido_id is not null\n" +
            "group by a.data\n" +
            "order by atendimentos desc", nativeQuery = true)
    List<ViewCtDiaMaisAtendimento> buscaMaiorQtdAgendamentos();
    @Query(value = "select uuid() id, null prestador, a.data dia, count(*) atendimentos from agendamento a\n" +
            "where a.servico_atribuido_id is not null\n" +
            "group by a.data\n" +
            "order by atendimentos", nativeQuery = true)
    List<ViewCtDiaMaisAtendimento> buscaMenorQtdAgendamentos();

}
