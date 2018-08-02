package com.kazale.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {

	//Geração de logs 
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public static String gerarBCrypt(String senha) {
		
		if(senha == null) {
			return senha;
		}
		
		log.info("Gerando Hash com o BCrypt");
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		return bCryptEncoder.encode(senha);
	}
	
}
