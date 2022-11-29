package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtDiaSemana;
import school.sptech.iara.view.ViewCtDiaSemanaPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtDiaSemanaPrestadorRepository extends PagingAndSortingRepository<ViewCtDiaSemanaPrestador, Long> {
    List<ViewCtDiaSemanaPrestador> findAll();
    List<ViewCtDiaSemanaPrestador> findAllByPrestador(Integer idPrestador);
}
