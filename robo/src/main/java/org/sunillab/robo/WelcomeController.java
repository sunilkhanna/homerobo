/***************************************************************************
 *  Copyright (C) Belgacom 2018
 *
 *  The reproduction, transmission or use of this document  or its contents
 *  is not  permitted without  prior express written consent of Belgacom.
 *  Offenders will be liable for damages. All rights, including  but not
 *  limited to rights created by patent grant or registration of a utility
 *  model or design, are reserved.
 *
 *  Belgacom reserves the right to modify technical specifications and features.
 *
 *  Technical specifications and features are binding only insofar as they
 *  are specifically and expressly agreed upon in a written contract.
 *
 **************************************************************************/

package org.sunillab.robo;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author sunil.khanna
 *
 */
@Controller
public class WelcomeController {
	
	
	@RequestMapping(value = "/forward", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody  <T> T moveFwd(Map<String, Object> model) {
		System.out.println("move-forward");
		return (T)"forward";
	}

	@RequestMapping(value = "/backward", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
	public @ResponseBody  <T> T moveBwd(Map<String, Object> model) {
		System.out.println("move-backward");
		return (T)"backward";
	}
	
	
	

}
