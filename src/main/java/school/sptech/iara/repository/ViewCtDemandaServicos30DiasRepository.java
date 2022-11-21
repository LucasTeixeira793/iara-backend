package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtDemandaServicos30Dias;
import school.sptech.iara.view.ViewCtUsuarios;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtDemandaServicos30DiasRepository extends PagingAndSortingRepository<ViewCtDemandaServicos30Dias, Long> {
    List<ViewCtDemandaServicos30Dias> findAll();
    List<ViewCtDemandaServicos30Dias> findAllByServico(String servico);
}
