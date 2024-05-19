package med.voll.api.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import med.voll.api.medico.DatosRegistroMedico;
import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;


@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@PostMapping("/save")
	public void registrarMedico(@RequestBody @Valid DatosRegistroMedico datosRegistroMedico) {
		medicoRepository.save(new Medico(datosRegistroMedico));
    }
	
	@GetMapping("/all")
	public List<Medico> listadoMedicos() {
		return medicoRepository.findAll();
	}
    	
}
