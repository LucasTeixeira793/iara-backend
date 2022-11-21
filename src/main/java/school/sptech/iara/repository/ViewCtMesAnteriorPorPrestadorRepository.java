package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtMesAnterior;
import school.sptech.iara.view.ViewCtMesAnteriorPorPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtMesAnteriorPorPrestadorRepository extends PagingAndSortingRepository<ViewCtMesAnteriorPorPrestador, Long> {
    List<ViewCtMesAnteriorPorPrestador> findAll();
    List<ViewCtMesAnteriorPorPrestador> findAllByPrestadorId(Integer idPrestador);
}
