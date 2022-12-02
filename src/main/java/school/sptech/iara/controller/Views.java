package school.sptech.iara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.sptech.iara.model.Prestador;
import school.sptech.iara.repository.*;
import school.sptech.iara.view.*;
import school.sptech.iara.view.ViewCtDiaMaisAtendimento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/view")
public class Views {

    @Autowired
    private ViewCtUltimos7DiasRepository viewCtUltimos7DiasRepository;
    @Autowired
    private ViewCtUltimos30DiasRepository viewCtUltimos30DiasRepository;
    @Autowired
    private ViewCtUltimos90DiasRepository viewCtUltimos90DiasRepository;
    @Autowired
    private ViewCtUltimos7DiasPorPrestadorRepository viewCtUltimos7DiasPorPrestadorRepository;
    @Autowired
    private ViewCtUltimos30DiasPorPrestadorRepository viewCtUltimos30DiasPorPrestadorRepository;
    @Autowired
    private ViewCtUltimos90DiasPorPrestadorRepository viewCtUltimos90DiasPorPrestadorRepository;
    @Autowired
    private ViewCtSemanaAnteriorRepository viewCtSemanaAnteriorRepository;
    @Autowired
    private ViewCtSemanaAnteriorPorPrestadorRepository viewCtSemanaAnteriorPorPrestadorRepository;
    @Autowired
    private ViewCtMesAnteriorRepository viewCtMesAnteriorRepository;
    @Autowired
    private ViewCtMesAnteriorPorPrestadorRepository viewCtMesAnteriorPorPrestadorRepository;
    @Autowired
    private ViewCtDiaMaisAtendimentoRepository viewCtDiaMaisAtendimentoRepository;
    @Autowired
    private ViewCtUsuariosRepository viewCtUsuariosRepository;
    @Autowired
    private ViewCtUsuariosSolicitaramAtendimentoRepository viewCtUsuariosSolicitaramAtendimentoRepository;
    @Autowired
    private ViewCtDemandaServicos30DiasRepository viewCtDemandaServicos30DiasRepository;
    @Autowired
    private ViewGraficoProcura30DiasPrestadorRepository viewGraficoProcura30DiasPrestadorRepository;
    @Autowired
    private ViewGraficoProcura30DiasRepository viewGraficoProcura30DiasRepository;
    @Autowired
    private ViewCtDiaSemanaRepository viewCtDiaSemanaRepository;
    @Autowired
    private ViewCtDiaSemanaPrestadorRepository viewCtDiaSemanaPrestadorRepository;
    @Autowired
    ViewCtProcuraSemanaAtualPrestadorRepository viewCtProcuraSemanaAtualPrestadorRepository;
    @Autowired
    ViewCtProcuraSemanaAtualRepository viewCtProcuraSemanaAtualRepository;
    @Autowired
    ViewCtAtendimentosHoraRepository viewCtAtendimentosHoraRepository;
    @Autowired
    ViewCtAtendimentosHoraGeralRepository viewCtAtendimentosHoraGeralRepository;


    @GetMapping("/agendamento/contagem/7dias")
    public ResponseEntity<List<ViewCtUltimos7Dias>> getUltimos7Dias(){
        List<ViewCtUltimos7Dias> contagemUltimos7Dias = viewCtUltimos7DiasRepository.findAll();
        if (!contagemUltimos7Dias.isEmpty()){
            return ResponseEntity.status(200).body(contagemUltimos7Dias);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/30dias")
    public ResponseEntity<List<ViewCtUltimos30Dias>> getUltimos30Dias(){
        List<ViewCtUltimos30Dias> contagemUltimos30Dias = viewCtUltimos30DiasRepository.findAll();
        if (!contagemUltimos30Dias.isEmpty()){
            return ResponseEntity.status(200).body(contagemUltimos30Dias);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/90dias")
    public ResponseEntity<List<ViewCtUltimos90Dias>> getUltimos90Dias(){
        List<ViewCtUltimos90Dias> contagemUltimos90Dias = viewCtUltimos90DiasRepository.findAll();
        if (!contagemUltimos90Dias.isEmpty()){
            return ResponseEntity.status(200).body(contagemUltimos90Dias);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/7dias/prestador")
    public ResponseEntity<List<ViewCtUltimos7DiasPorPrestador>> getUltimos7DiasPrestador(Optional<Integer> idPrestador){
        List<ViewCtUltimos7DiasPorPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtUltimos7DiasPorPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtUltimos7DiasPorPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/30dias/prestador")
    public ResponseEntity<List<ViewCtUltimos30DiasPorPrestador>> getUltimos30DiasPrestador(Optional<Integer> idPrestador){
        List<ViewCtUltimos30DiasPorPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtUltimos30DiasPorPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtUltimos30DiasPorPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/90dias/prestador")
    public ResponseEntity<List<ViewCtUltimos90DiasPorPrestador>> getUltimos90DiasPrestador(Optional<Integer> idPrestador){
        List<ViewCtUltimos90DiasPorPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtUltimos90DiasPorPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtUltimos90DiasPorPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/semana-anterior")
    public ResponseEntity<ViewCtSemanaAnterior> getUltimos90DiasPrestador(){
        List<ViewCtSemanaAnterior> contagemAgendamentos;
        contagemAgendamentos = viewCtSemanaAnteriorRepository.findAll();

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/semana-anterior/prestador")
    public ResponseEntity<List<ViewCtSemanaAnteriorPorPrestador>> getSemanaAnteriorPrestador(Optional<Integer> idPrestador){
        List<ViewCtSemanaAnteriorPorPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtSemanaAnteriorPorPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtSemanaAnteriorPorPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/mes-anterior")
    public ResponseEntity<ViewCtMesAnterior> getMesAnterior(){
        List<ViewCtMesAnterior> contagemAgendamentos;
        contagemAgendamentos = viewCtMesAnteriorRepository.findAll();

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/contagem/mes-anterior/prestador")
    public ResponseEntity<List<ViewCtMesAnteriorPorPrestador>> getMesAnteriorPrestador(Optional<Integer> idPrestador){
        List<ViewCtMesAnteriorPorPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtMesAnteriorPorPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtMesAnteriorPorPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/dia/maior")
    public ResponseEntity<List<ViewCtDiaMaisAtendimento>> getDiaComMaisAtendimentos(Optional<Integer> idPrestador){
        List<ViewCtDiaMaisAtendimento> contagemAgendamentos;
        if (idPrestador.isPresent()) {
            contagemAgendamentos = viewCtDiaMaisAtendimentoRepository.findAllByPrestador(idPrestador.get());
        }
        else {
            contagemAgendamentos = viewCtDiaMaisAtendimentoRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/cliente/contagem")
    public ResponseEntity<ViewCtUsuarios> getContagemUsuarios(){
        List<ViewCtUsuarios> contagemAgendamentos;
        contagemAgendamentos = viewCtUsuariosRepository.findAll();

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/cliente/servico/contagem")
    public ResponseEntity<ViewCtUsuariosSolicitaramAtendimento> getContagemUsuariosSolicitaramServico(){
        List<ViewCtUsuariosSolicitaramAtendimento> contagemAgendamentos;
        contagemAgendamentos = viewCtUsuariosSolicitaramAtendimentoRepository.findAll();

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/servico/contagem")
    public ResponseEntity<List<ViewCtDemandaServicos30Dias>> getDemandaServicos30Dias(Optional<String> servico){
        List<ViewCtDemandaServicos30Dias> contagemAgendamentos;
        if (servico.isPresent()){
            contagemAgendamentos = viewCtDemandaServicos30DiasRepository.findAllByServico(servico.get());
        }else{
            contagemAgendamentos = viewCtDemandaServicos30DiasRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/grafico/procura/30dias/prestador")
    public ResponseEntity<List<ViewGraficoProcura30DiasPrestador>> getGraficoProcuraPrestador30Dias(Optional<Integer> prestadorId,
                                                                                           Optional<String> servico){
        List<ViewGraficoProcura30DiasPrestador> contagemAgendamentos;
        if (servico.isPresent() && prestadorId.isPresent()){
            contagemAgendamentos = viewGraficoProcura30DiasPrestadorRepository.findAllByTipoAndPrestador(servico.get(), prestadorId.get());
        }else if(servico.isPresent()){
            contagemAgendamentos = viewGraficoProcura30DiasPrestadorRepository.findAllByTipo(servico.get());
        }else if(prestadorId.isPresent()){
            contagemAgendamentos = viewGraficoProcura30DiasPrestadorRepository.findAllByPrestador(prestadorId.get());
        }else{
            contagemAgendamentos = viewGraficoProcura30DiasPrestadorRepository.findAll();
        }

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/grafico/procura/30dias")
    public ResponseEntity<List<ViewGraficoProcura30Dias>> getGraficoProcura30Dias(Optional<String> servico){
        List<ViewGraficoProcura30Dias> contagemAgendamentos;
        if(servico.isPresent()){
            contagemAgendamentos = viewGraficoProcura30DiasRepository.findAllByTipo(servico.get());
        }else{
            contagemAgendamentos = viewGraficoProcura30DiasRepository.findAll();
        }

        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/dia-semana")
    public ResponseEntity<List<ViewCtDiaSemana>> getContagemServicoDiaSemana(){
        List<ViewCtDiaSemana> contagemAgendamentos = viewCtDiaSemanaRepository.findAll();
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/agendamento/dia-semana/prestador")
    public ResponseEntity<List<ViewCtDiaSemanaPrestador>> getContagemServicoDiaSemanaPrestador(Optional<Integer> idPrestador){
        List<ViewCtDiaSemanaPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtDiaSemanaPrestadorRepository.findAllByPrestador(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtDiaSemanaPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/grafico/contagem/semana-atual/prestador")
    public ResponseEntity<List<ViewCtProcuraSemanaAtualPrestador>> getContagemServicoSemanaPrestadorAtual(Optional<Integer> idPrestador){
        List<ViewCtProcuraSemanaAtualPrestador> contagemAgendamentos;
        if (idPrestador.isPresent()){
            contagemAgendamentos = viewCtProcuraSemanaAtualPrestadorRepository.findAllByPrestadorId(idPrestador.get());
        }else{
            contagemAgendamentos = viewCtProcuraSemanaAtualPrestadorRepository.findAll();
        }
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/grafico/contagem/semana-atual")
    public ResponseEntity<List<ViewCtProcuraSemanaAtual>> getContagemServicoSemanaAtual(){
        List<ViewCtProcuraSemanaAtual> contagemAgendamentos;
        contagemAgendamentos = viewCtProcuraSemanaAtualRepository.findAll();
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos);
        }
        return ResponseEntity.status(204).build();
    }
    @GetMapping("/atendimento/hora/{idPrestador}/maior")
    public ResponseEntity<ViewCtAtendimentosHora> getContagemAtendimentosHoraMaiorPrestador(@PathVariable Integer idPrestador){
        List<ViewCtAtendimentosHora> contagemAgendamentos;
        contagemAgendamentos = viewCtAtendimentosHoraRepository.findAllByPrestadorIdOrderByQtdAtendimentosDesc(idPrestador);
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/atendimento/hora/{idPrestador}/menor")
    public ResponseEntity<ViewCtAtendimentosHora> getContagemAtendimentosHoraMenorPrestador(@PathVariable Integer idPrestador){
        List<ViewCtAtendimentosHora> contagemAgendamentos;
        contagemAgendamentos = viewCtAtendimentosHoraRepository.findAllByPrestadorIdOrderByQtdAtendimentos(idPrestador);
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

    @GetMapping("/atendimento/hora/maior")
    public ResponseEntity<ViewCtAtendimentosHoraGeral> getContagemAtendimentosHoraMaior(){
        List<ViewCtAtendimentosHoraGeral> contagemAgendamentos;
        contagemAgendamentos = viewCtAtendimentosHoraGeralRepository.findAllByOrderByQtdAtendimentosDesc();
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }
    @GetMapping("/atendimento/hora/menor")
    public ResponseEntity<ViewCtAtendimentosHoraGeral> getContagemAtendimentosHoraMenor(){
        List<ViewCtAtendimentosHoraGeral> contagemAgendamentos;
        contagemAgendamentos = viewCtAtendimentosHoraGeralRepository.findAllByOrderByQtdAtendimentos();
        if (!contagemAgendamentos.isEmpty()){
            return ResponseEntity.status(200).body(contagemAgendamentos.get(0));
        }
        return ResponseEntity.status(204).build();
    }

}
