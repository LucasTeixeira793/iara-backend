package school.sptech.iara.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtMesAnterior;
import school.sptech.iara.view.ViewCtProcuraSemanaAtual;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtProcuraSemanaAtualRepository extends PagingAndSortingRepository<ViewCtProcuraSemanaAtual, Long> {
    List<ViewCtProcuraSemanaAtual> findAll();
}
