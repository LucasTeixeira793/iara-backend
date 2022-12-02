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
            "                       when 0 then 'Segunda-feira'\n" +
            "                       when 1 then 'Terça-feira'\n" +
            "                       when 2 then 'Quarta-feira'\n" +
            "                       when 3 then 'Quinta-feira'\n" +
            "                       when 4 then 'Sexta-feira'\n" +
            "                       when 5 then 'Sábado'\n" +
            "                       when 6 then 'Domingo'                 \n" +
            "                       END) AS dia_semana from agendamento ag \n" +
            "inner join agenda a on ag.agenda_id = a.id\n" +
            "where a.prestador_id =:idPrestador\n" +
            "and ag.data > NOW()\n" +
            "group by dia_semana",nativeQuery = true)
    List<String> findDiasDisponiveisByPrestador(@Param("idPrestador") Integer idPrestador);
}
