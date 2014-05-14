package br.com.mvpdev.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("adiciona")
    public String adiciona(Usuario usuario) {
	usuarioService.criaUsuario(usuario);
	return "redirect:/";
    }

    @RequestMapping("lista")
    public ModelAndView lista() {
	ModelAndView mv = new ModelAndView("usuarios/lista");
	mv.addObject("usuarios", usuarioService.buscaTodosUsuarios());
	return mv;
    }

    @RequestMapping("remove")
    public String remove(Usuario usuario) {
	usuarioService.removeUsuarioPeloId(usuario.getId());
	return "forward:lista";
    }

    @RequestMapping("edita")
    public String edita(int id, Model model) {
	model.addAttribute("usuario", usuarioService.buscaUsuario(id));
	return "usuarios/editar";
    }

    @RequestMapping("altera")
    public String altera(Usuario usuario) {
	usuarioService.atualizaUsuario(usuario);
	return "forward:lista";
    }

}
