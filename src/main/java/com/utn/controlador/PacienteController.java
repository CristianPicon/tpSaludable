package com.utn.controlador;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.utn.dao.HibernateUtil;

import com.utn.modelo.Formulario;


@Controller
public class PacienteController {

	@RequestMapping(value = "/paciente")
	public String paciente(@ModelAttribute("paciente") Formulario formulario, BindingResult result) {
		return "paciente";
	}

	@RequestMapping(value = "/formularios", method = RequestMethod.POST)
	public String formularios(@ModelAttribute("paciente") Formulario formulario, BindingResult result) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		if (!result.hasErrors()) {
			Transaction transaccionos = session.beginTransaction();
			

			session.save(formulario);
			
			transaccionos.commit();
			
		}else{
			
			return "redirect:error.do";
		}

		return "paciente";
	}
	
	

}
