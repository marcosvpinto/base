package br.com.mvpdev.base.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String login;
    private String senha;

    public Usuario(String nome, String login, String senha) {
	this.nome = nome;
	this.login = login;
	this.senha = senha;
    }

    public Usuario() {
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getSenha() {
	return senha;
    }

    public void setSenha(String senha) {
	this.senha = senha;
    }

}
