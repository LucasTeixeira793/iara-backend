package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewGraficoProcura30Dias;
import school.sptech.iara.view.ViewGraficoProcura30DiasPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewGraficoProcura30DiasRepository extends PagingAndSortingRepository<ViewGraficoProcura30Dias, Long> {
    List<ViewGraficoProcura30Dias> findAll();
    List<ViewGraficoProcura30Dias> findAllByTipo(String tipo);
}
