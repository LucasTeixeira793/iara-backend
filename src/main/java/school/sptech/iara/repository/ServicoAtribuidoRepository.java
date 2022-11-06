package school.sptech.iara.repository;

import com.github.javafaker.Bool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import school.sptech.iara.model.Cliente;
import school.sptech.iara.model.Prestador;
import school.sptech.iara.model.Servico;
import school.sptech.iara.model.ServicoAtribuido;

import java.util.List;

public interface ServicoAtribuidoRepository extends JpaRepository<ServicoAtribuido,Integer> {
//    List<ServicoAtribuido> findAllByFinalizadoAndServico_AtivoAndServico_PrestadorOrderByDataHoraInicio
//            (Boolean fin, Boolean ativ, Prestador prestador);

    List<ServicoAtribuido> findAllByServicoAndStatus(Servico servico, String status);
    List<ServicoAtribuido> findAllByServico_PrestadorAndStatus(Prestador prestador, String status);

    @Query("SELECT sa FROM ServicoAtribuido sa WHERE sa.cliente = ?1")
    List<ServicoAtribuido> buscaServicosAttrPorCliente(Cliente cliente);
    @Query("SELECT sa FROM ServicoAtribuido sa WHERE sa.cliente = ?1 AND sa.status = 'Agendado'")
    List<ServicoAtribuido> buscaServicosAttrPorClienteAtivo(Cliente cliente);


}
