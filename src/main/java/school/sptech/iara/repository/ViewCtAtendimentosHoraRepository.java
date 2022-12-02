package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtAtendimentosHora;
import school.sptech.iara.view.ViewCtUsuarios;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtAtendimentosHoraRepository extends PagingAndSortingRepository<ViewCtAtendimentosHora, Long> {
    List<ViewCtAtendimentosHora> findAll();
    List<ViewCtAtendimentosHora> findAllByOrderByQtdAtendimentos();
    List<ViewCtAtendimentosHora> findAllByOrderByQtdAtendimentosDesc();
    List<ViewCtAtendimentosHora> findAllByPrestadorIdOrderByQtdAtendimentos(Integer prestadorId);
    List<ViewCtAtendimentosHora> findAllByPrestadorIdOrderByQtdAtendimentosDesc(Integer prestadorId);
}
