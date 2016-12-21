package com.utn.controlador;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class LoginController {

	@RequestMapping(value = "/login")
	public String login(Model model) {
		System.out.println("Entro a login");
		return "login";
	}

	@RequestMapping(value = "/logout")
	public String logout(Model model) {
		return "login";
	}

//	@RequestMapping(value = "/loginFail")
//	public String registrar(@Valid @ModelAttribute("registronuevousuario") Persona persona, BindingResult result) {
//
//		System.out.println(persona);
//		// conectarnos a hibernate ...
//
//		return "loginFail";
//	}

}
