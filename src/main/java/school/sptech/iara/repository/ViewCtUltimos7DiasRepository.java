package school.sptech.iara.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtUltimos7Dias;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtUltimos7DiasRepository extends PagingAndSortingRepository<ViewCtUltimos7Dias, Long> {
    List<ViewCtUltimos7Dias> findAll();
}
