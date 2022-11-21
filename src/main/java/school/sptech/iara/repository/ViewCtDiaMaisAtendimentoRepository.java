package school.sptech.iara.repository;

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
}
