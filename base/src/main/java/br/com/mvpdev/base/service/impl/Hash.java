package br.com.mvpdev.base.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.mvpdev.base.service.IHash;

public class Hash implements IHash {

    @Override
    public String geraHash(String texto) throws UnsupportedEncodingException,
	    NoSuchAlgorithmException {

	byte[] textoRecebido = texto.getBytes("UTF-8");
	MessageDigest messageDigest = MessageDigest.getInstance("MD5");
	messageDigest.update(textoRecebido);
	byte[] digest = messageDigest.digest();
	String hexValue = "";
	for (int i = 0; i < digest.length; i++) {
	    int b = digest[i] & 0xff;
	    if (Integer.toHexString(b).length() == 1)
		hexValue += "0";
	    hexValue += Integer.toHexString(b);
	}
	return hexValue;

    }

}
