package br.com.mvpdev.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.service.IUsuarioService;

@RequestMapping("/usuario")
@Controller
public class UsuarioController {

    @Autowired
    IUsuarioService usuarioService;

    @RequestMapping("novo")
    public String novo() {
	return "usuarios/adicionar";
    }

    @RequestMapping("adicionaUsuario")
    public String adiciona(Usuario usuario) {
	usuarioService.criaUsuario(usuario);
	return "redirect:/";
    }

}
