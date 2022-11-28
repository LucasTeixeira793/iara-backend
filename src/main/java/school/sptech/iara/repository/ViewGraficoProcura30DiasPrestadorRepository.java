package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewGraficoProcura30DiasPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewGraficoProcura30DiasPrestadorRepository extends PagingAndSortingRepository<ViewGraficoProcura30DiasPrestador, Long> {
    List<ViewGraficoProcura30DiasPrestador> findAll();
    List<ViewGraficoProcura30DiasPrestador> findAllByPrestador(Integer prestador);
    List<ViewGraficoProcura30DiasPrestador> findAllByTipo(String tipo);
    List<ViewGraficoProcura30DiasPrestador> findAllByTipoAndPrestador(String tipo, Integer prestador);
}
