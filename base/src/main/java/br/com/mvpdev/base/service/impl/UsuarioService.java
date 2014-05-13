package br.com.mvpdev.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.persistence.IUsuarioDao;
import br.com.mvpdev.base.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    IUsuarioDao usuarioDao;

    @Override
    public void criaUsuario(Usuario usuario) {
	usuarioDao.create(usuario);
    }

    @Override
    public Usuario atualizaUsuario(Usuario usuario) {
	return usuarioDao.update(usuario);
    }

    @Override
    public void removeUsuario(Usuario usuario) {
	usuarioDao.delete(usuario);
    }

    @Override
    public void removeUsuarioPeloId(long usuarioId) {
	usuarioDao.deleteById(usuarioId);
    }

    @Override
    public Usuario buscaUsuario(long id) {
	return usuarioDao.findOne(id);
    }

    @Override
    public List<Usuario> buscaTodosUsuarios() {
	return usuarioDao.findAll();
    }

    @Override
    public boolean checaUsuario(Usuario usuario) {
	List<Usuario> usuarios = buscaTodosUsuarios();
	for (Usuario usuario2 : usuarios) {
	    if (usuario2.getLogin().equals(usuario.getLogin())
		    && usuario2.getSenha().equals(usuario.getSenha())) {
		return true;
	    }
	}
	return false;
    }

}
