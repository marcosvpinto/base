package br.com.mvpdev.base.service;

import java.util.List;

import br.com.mvpdev.base.models.Usuario;

public interface IUsuarioService {

    public void criaUsuario(Usuario usuario);

    public Usuario atualizaUsuario(Usuario usuario);

    public void removeUsuario(Usuario usuario);

    public void removeUsuarioPeloId(long usuarioId);

    public Usuario buscaUsuario(long id);

    public List<Usuario> buscaTodosUsuarios();

    public boolean checaUsuario(Usuario usuario);

}
