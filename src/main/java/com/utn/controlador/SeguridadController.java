package com.utn.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.utn.dao.HibernateUtil;
import com.utn.modelo.User;
import com.utn.modelo.UserRole;

@Controller
public class SeguridadController {
	
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

		ModelAndView model = new ModelAndView();
		
		return model;

	}


	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", getErrorMessage(request, "SPRING_SECURITY_LAST_EXCEPTION"));
		}

		if (logout != null) {
			model.addObject("msg", "fin de la sesion");
		}
		model.setViewName("login");
		
		System.out.println("afuera");

		return model;

	}

	
	private String getErrorMessage(HttpServletRequest request, String key) {

		Exception exception = (Exception) request.getSession().getAttribute(key);

		String error = "";
		if (exception instanceof BadCredentialsException) {
			error = "usuario o contraseña invalida";
		} else if (exception instanceof LockedException) {
			error = exception.getMessage();
		} else {
			error = "usuario o contraseña invalida";
		}

		return error;
	}
	
	
	
	@RequestMapping(value = "/index")
	public String altaAuto(@ModelAttribute("reg") User user, BindingResult result) {
		return "index";
	}

	@RequestMapping(value = "/registro", method = RequestMethod.POST)
	public String alta(@ModelAttribute("reg") User user, BindingResult result,@ModelAttribute("reg")UserRole userrole, BindingResult bindingUserRole) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		if (!result.hasErrors()) {
			Transaction transaccionos = session.beginTransaction();
			
			user.setUserrole(  new UserRole(user.getUsername(),"ROLE_USER"));
			
			
			
			
			session.save(user);
			
			transaccionos.commit();
			
		}else{
			
			return "redirect:error.do";
		}

		return "registro";
	}
	
	

}
