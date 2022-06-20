package com.pastry.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pastry.ecom.serviceImpl.UsuarioService;

@Controller
@RequestMapping("/Sesion")
public class UsuarioController {
	
	
	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		//modelo.addAttribute("usuarios", servicio.listarUsuarios());
		return "index";
	}

}


