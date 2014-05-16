package br.com.mvpdev.base.persistence.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.persistence.IUsuarioDao;

@Repository
public class UsuarioDao extends AbstractHibernateDao<Usuario> implements
	IUsuarioDao {

    public UsuarioDao() {
	super();
	setClazz(Usuario.class);
    }

    @Override
    public Usuario findOne(long id) {
	return super.findOne(id);
    }

    @Override
    public List<Usuario> findAll() {
	return super.findAll();
    }

    @Override
    public void create(Usuario entity) {
	super.create(entity);
    }

    @Override
    public Usuario update(Usuario entity) {
	return super.update(entity);
    }

    @Override
    public void delete(Usuario entity) {
	super.delete(entity);
    }

    @Override
    public void deleteById(long entityId) {
	super.deleteById(entityId);
    }

}
