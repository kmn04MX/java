package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controlador")
public class Controlador1 {
	@GetMapping("/devuelve")
	public String devuelve() {
		return "Hola desde el controlador";
	}
}
