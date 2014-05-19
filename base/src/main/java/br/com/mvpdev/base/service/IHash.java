package br.com.mvpdev.base.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IHash {

    public String geraHash(String texto) throws UnsupportedEncodingException,
	    NoSuchAlgorithmException;

}
