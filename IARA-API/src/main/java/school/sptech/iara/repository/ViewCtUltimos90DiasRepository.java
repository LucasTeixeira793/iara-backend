package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtUltimos30Dias;
import school.sptech.iara.view.ViewCtUltimos90Dias;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtUltimos90DiasRepository extends PagingAndSortingRepository<ViewCtUltimos90Dias, Long> {
    List<ViewCtUltimos90Dias> findAll();
}
