package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtDiaSemana;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtDiaSemanaRepository extends PagingAndSortingRepository<ViewCtDiaSemana, Long> {
    List<ViewCtDiaSemana> findAll();
    List<ViewCtDiaSemana> findAllByDia(String dia);
}
