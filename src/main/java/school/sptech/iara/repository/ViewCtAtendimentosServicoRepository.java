package school.sptech.iara.repository;

import feign.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import school.sptech.iara.view.ViewCtAtendimentosHoraGeral;
import school.sptech.iara.view.ViewCtServicos;

import javax.transaction.Transactional;
import java.util.List;

@CrossOrigin(origins = "*")
@Repository
@Transactional
public interface ViewCtAtendimentosServicoRepository extends PagingAndSortingRepository<ViewCtServicos, Long> {
    @Query(value = "select uuid() id, null prestador, s.tipo, count(*) agendamentos from agendamento ag\n" +
            "\tinner join servico_atribuido sa on sa.id = servico_atribuido_id\n" +
            "\tinner join servico s on sa.servico_id = s.id\n" +
            "\twhere servico_atribuido_id is not null\n" +
            "\tgroup by s.tipo\n" +
            "\torder by agendamentos desc",nativeQuery = true)
    List<ViewCtServicos> buscaTudo();

    @Query(value = "select uuid() id, null prestador, s.tipo, count(*) agendamentos from agendamento ag\n" +
            "\tinner join servico_atribuido sa on sa.id = servico_atribuido_id\n" +
            "\tinner join servico s on sa.servico_id = s.id\n" +
            "\twhere servico_atribuido_id is not null\n" +
            "\tand datediff(now(), data) <= 30\n" +
            "\tand datediff(now(), data) >= 0\n" +
            "\tgroup by s.tipo\n" +
            "\torder by agendamentos desc",nativeQuery = true)
    List<ViewCtServicos> buscaTudoUltimoMes();

    @Query(value = "select uuid() id, s.prestador, s.tipo, count(*) agendamentos from agendamento ag\n" +
            "\tinner join servico_atribuido sa on sa.id = servico_atribuido_id\n" +
            "\tinner join servico s on sa.servico_id = s.id\n" +
            "\twhere servico_atribuido_id is not null\n" +
            "\tand datediff(now(), data) <= 30\n" +
            "\tand datediff(now(), data) >= 0\n" +
            "    and s.prestador =:idPrestador\n" +
            "\tgroup by s.prestador, s.tipo\n" +
            "\torder by agendamentos desc", nativeQuery = true)
    List<ViewCtServicos> buscaTudoUltimoMesPrestador(@Param("idPrestador") Integer idPrestador);


}
