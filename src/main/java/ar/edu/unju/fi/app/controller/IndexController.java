package ar.edu.unju.fi.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import ar.edu.unju.fi.util.ListaCartas;



@Controller
public class IndexController {
	

	@GetMapping("/inicio")
	public String getIndexPagina(Model model) {
		ListaCartas listacartas = new ListaCartas();
		model.addAttribute("listacartas", listacartas.getListaCartas());
		System.out.println(listacartas.getListaCartas());
		
		return "inicio";
	}

}
