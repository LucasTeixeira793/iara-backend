package school.sptech.iara.repository;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import school.sptech.iara.model.Agenda;
import school.sptech.iara.model.Agendamento;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    List<Agendamento> findAllByAgendaAndData(Agenda agenda, LocalDate data);
    List<Agendamento> findAllByAgendaAndDataOrderByHoraInicio(Agenda agenda, LocalDate data);
    List<Agendamento> findAllByAgendaOrderByDataAscHoraInicioAsc(Agenda agenda);
    List<Agendamento> findAllByAgendaAndDataAndHoraInicioAndHoraFim(Agenda agenda, LocalDate data, LocalTime hrIn, LocalTime hrFim);
    List<Agendamento> findAllByDataBefore(LocalDate day);
    List<Agendamento> findAllByAgendaAndDataAfter(Agenda agenda, LocalDate day);
    Integer countAgendamentoByData(LocalDate data);
    Agendamento findByServicoAtribuido_Id(Integer idServicoAttr);
    @Query(value="select (CASE WEEKDAY(ag.data)    \n" +
            "                       when 0 then 'Seg '\n" +
            "                       when 1 then 'Ter '\n" +
            "                       when 2 then 'Qua '\n" +
            "                       when 3 then 'Qui '\n" +
            "                       when 4 then 'Sex '\n" +
            "                       when 5 then 'Sáb '\n" +
            "                       when 6 then 'Dom '                 \n" +
            "                       END) AS dia_semana from agendamento ag \n" +
            "inner join agenda a on ag.agenda_id = a.id\n" +
            "where a.prestador_id =:idPrestador\n" +
            "and ag.data > NOW()\n" +
            "group by dia_semana",nativeQuery = true)
    List<String> findDiasDisponiveisByPrestador(@Param("idPrestador") Integer idPrestador);
}
