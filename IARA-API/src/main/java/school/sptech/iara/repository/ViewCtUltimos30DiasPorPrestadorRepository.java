package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtUltimos30DiasPorPrestador;
import school.sptech.iara.view.ViewCtUltimos7DiasPorPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtUltimos30DiasPorPrestadorRepository extends PagingAndSortingRepository<ViewCtUltimos30DiasPorPrestador, Long> {
    List<ViewCtUltimos30DiasPorPrestador> findAll();
    List<ViewCtUltimos30DiasPorPrestador> findAllByPrestadorId(Integer id);
}
