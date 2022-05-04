package ustptrabalhofinal.vestuario.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import ustptrabalhofinal.vestuario.classes.Vestuarios;
import ustptrabalhofinal.vestuario.repositorios.VestuariosRepositorio;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping (value ="/api/vestuarios")
public class VestuarioControlador {
	
	
	
	
	@Autowired
	 VestuariosRepositorio repository;
	
	@GetMapping
	public List<Vestuarios> list() {
	
		return repository.findAll();
	}
	
	
	@GetMapping(value = "/{codigo}")
	public Vestuarios findById(@PathVariable Long codigo) {
		
		 Vestuarios result = repository.findById(codigo).get();
		
		 return result;
	}
	
	
	@PostMapping
	public void salvar (@RequestBody Vestuarios vestuario) {
		
	repository.save(vestuario);
	}
	
	 
}
