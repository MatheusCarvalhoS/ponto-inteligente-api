package com.kazale.pontointeligente.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	public PasswordUtils() {
	}
	
	public static String gerarBCrypt(String senha) {
		if(senha == null) {
			return senha;
		}
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(senha);
	}
}
