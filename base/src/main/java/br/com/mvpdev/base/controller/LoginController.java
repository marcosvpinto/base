package br.com.mvpdev.base.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.service.IUsuarioService;

@Controller
public class LoginController {

    @Autowired
    IUsuarioService usuarioService;

    @RequestMapping("/")
    public String login() {
	return "login";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:login";
    }

    @RequestMapping("/login")
    public String efetuaLogin(Usuario usuario, HttpSession session) {
	if (usuarioService.checaUsuario(usuario) == true) {
	    session.setAttribute("usuarioLogado", usuario);
	} else {
	    return "redirect:/";
	}
	return "home";
    }

}
