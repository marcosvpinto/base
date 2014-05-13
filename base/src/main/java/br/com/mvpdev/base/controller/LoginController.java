package br.com.mvpdev.base.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.persistence.IUsuarioDao;

@Controller
public class LoginController {

    List<Usuario> usuarios = new ArrayList<Usuario>();

    @Autowired
    IUsuarioDao usuarioDao;

    private List<Usuario> carregaUsuarios() {
	return usuarioDao.findAll();
    }

    @RequestMapping("/")
    public String login() {
	return "login";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:login";
    }

    @Transactional
    @RequestMapping("/login")
    public String efetuaLogin(Usuario usuario, HttpSession session) {
	usuarios = carregaUsuarios();
	for (Usuario usuario2 : usuarios) {
	    if (usuario2.getLogin().equals(usuario.getLogin())
		    && usuario2.getSenha().equals(usuario.getSenha())) {
		session.setAttribute("usuarioLogado", usuario);
		return "redirect:home";
	    }
	}
	return "redirect:/";
    }

}
