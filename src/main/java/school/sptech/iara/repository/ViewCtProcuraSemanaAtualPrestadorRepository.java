package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtProcuraSemanaAtual;
import school.sptech.iara.view.ViewCtProcuraSemanaAtualPrestador;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtProcuraSemanaAtualPrestadorRepository extends PagingAndSortingRepository<ViewCtProcuraSemanaAtualPrestador, Long> {
    List<ViewCtProcuraSemanaAtualPrestador> findAll();
    List<ViewCtProcuraSemanaAtualPrestador> findAllByPrestadorId(Integer prestadorId);
}
