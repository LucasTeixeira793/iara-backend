package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtUltimos30DiasPorPrestador;
import school.sptech.iara.view.ViewCtUltimos90DiasPorPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtUltimos90DiasPorPrestadorRepository extends PagingAndSortingRepository<ViewCtUltimos90DiasPorPrestador, Long> {
    List<ViewCtUltimos90DiasPorPrestador> findAll();
    List<ViewCtUltimos90DiasPorPrestador> findAllByPrestadorId(Integer id);
}
