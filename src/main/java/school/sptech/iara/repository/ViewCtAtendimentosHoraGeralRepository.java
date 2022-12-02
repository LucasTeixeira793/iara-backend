package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtAtendimentosHora;
import school.sptech.iara.view.ViewCtAtendimentosHoraGeral;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtAtendimentosHoraGeralRepository extends PagingAndSortingRepository<ViewCtAtendimentosHoraGeral, Long> {
    List<ViewCtAtendimentosHoraGeral> findAll();
    List<ViewCtAtendimentosHoraGeral> findAllByOrderByQtdAtendimentos();
    List<ViewCtAtendimentosHoraGeral> findAllByOrderByQtdAtendimentosDesc();
}
