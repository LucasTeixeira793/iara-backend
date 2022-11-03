package school.sptech.iara.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.iara.repository.*;
import school.sptech.iara.view.*;

import java.util.List;
import java.util.Objects;
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
}
