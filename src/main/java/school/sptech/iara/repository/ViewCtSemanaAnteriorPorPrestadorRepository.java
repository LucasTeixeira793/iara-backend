package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtSemanaAnterior;
import school.sptech.iara.view.ViewCtSemanaAnteriorPorPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtSemanaAnteriorPorPrestadorRepository extends PagingAndSortingRepository<ViewCtSemanaAnteriorPorPrestador, Long> {
    List<ViewCtSemanaAnteriorPorPrestador> findAll();
    List<ViewCtSemanaAnteriorPorPrestador> findAllByPrestadorId(Integer id);
}
