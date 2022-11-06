package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtUltimos7DiasPorPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtUltimos7DiasPorPrestadorRepository extends PagingAndSortingRepository<ViewCtUltimos7DiasPorPrestador, Long> {
    List<ViewCtUltimos7DiasPorPrestador> findAll();
    List<ViewCtUltimos7DiasPorPrestador> findAllByPrestadorId(Integer id);
}
