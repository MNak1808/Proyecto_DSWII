package com.pastry.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class UsuarioRegistroController {
	
	@Controller
	@RequestMapping("/RegistroUser")
	public class RegistroUsuarioControlador {


		@GetMapping
		public String mostrarFormularioDeRegistro() {
			return "RegistroUser";
		}
		
		
	}

}
