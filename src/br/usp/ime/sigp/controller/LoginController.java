/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.usp.ime.sigp.controller;

import java.util.List;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.usp.ime.sigp.IndexController;
import br.usp.ime.sigp.UserInfo;
import br.usp.ime.sigp.jpa.BaseEntityString;

import br.usp.ime.sigp.dao.GenericDAOString;
import br.usp.ime.sigp.jpa.BaseEntityString;
import br.usp.ime.sigp.modelo.Usuario;

import java.io.UnsupportedEncodingException;
import java.security.*;

@Resource
public class LoginController {
	private final GenericDAOString dao;
	private final Result result;
	private UserInfo info;
	private Usuario usuario;
	
	public LoginController(Result result, UserInfo info, GenericDAOString dao) {
		this.dao = dao;
		this.info = info;
		this.result = result;
	}

	@Path({"/login/", "/login"})
	public void index() {
		result.include("variable", "VRaptor!");
	}
	
	@Post
	@Path({"/login/validate/", "/login/validate"})
	public void login(String username, String password) {
		byte[] bytesOfMessage = null;
		MessageDigest md = null;
		try {
			bytesOfMessage = password.getBytes("UTF-8");
			md = MessageDigest.getInstance("MD5");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] thedigest = md.digest(bytesOfMessage);
		
		List users = dao.selectByNamedQuery("selectUsuario", username, password);
		if(users.size() != 1) {
			// Xiii....
			result.redirectTo(IndexController.class).index();
			return;
		}
		Usuario user = (Usuario) users.get(0);
		info.setUsuario(user);
		
		result.redirectTo(IndexController.class).index();
	}
	
	@Path({"/logout/", "/logout"})
	public void logout() {
		info.setUsuario(null);
		result.redirectTo(IndexController.class).index();
	}
}
