package br.com.mvpdev.base.persistence.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.mvpdev.base.models.Usuario;
import br.com.mvpdev.base.persistence.IUsuarioDao;

@Repository
public class UsuarioDao extends AbstractHibernateDao<Usuario> implements
	IUsuarioDao {

    private static final Logger logger = LoggerFactory
	    .getLogger(UsuarioDao.class);

    public UsuarioDao() {
	super();
	setClazz(Usuario.class);
    }

    @Override
    public Usuario findOne(long id) {
	logger.info("Buscando usuário com id: " + id);
	return super.findOne(id);
    }

    @Override
    public List<Usuario> findAll() {
	logger.info("Buscando todos os usuários");
	return super.findAll();
    }

    @Override
    public void create(Usuario entity) {
	logger.info("Criação do usuário: " + entity.getNome());
	super.create(entity);
    }

    @Override
    public Usuario update(Usuario entity) {
	logger.info("Usuário atualizado: " + entity.getNome());
	return super.update(entity);
    }

    @Override
    public void delete(Usuario entity) {
	logger.info("Usuário removido: " + entity.getNome());
	super.delete(entity);
    }

    @Override
    public void deleteById(long entityId) {
	logger.info("Usuário removido: " + entityId);
	super.deleteById(entityId);
    }

}
