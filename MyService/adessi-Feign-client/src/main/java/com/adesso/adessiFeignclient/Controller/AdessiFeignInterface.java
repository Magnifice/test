package com.adesso.adessiFeignclient.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import feign.RequestLine;

@FeignClient("AdessiService")
public interface AdessiFeignInterface {

	/*
	 * Feign ist in der Lage, aus Sprin MVC-annotierten Request Mappings direkt den Client zu erzeugen.
	 * Wenn man den Builder verwendet, muss hierfür allerdings der Contract new SpringMvcContract()
	 * in der Aufruf-Kette mitgegeben werden. Hat man den Contract nicht, kann man die Methoden mit 
	 * @RequestLine annotieren, Feign macht dann daraus den Client (siehe getFristName() unten).
	 */
	
	/**
	 * @return the adessi's first name.
	 */
	@RequestLine("GET /adessi/firstName")
	@RequestMapping("/adessi/firstName")
	String getFirstName();

	/**
	 * @return the adessi's last name.
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/adessi/lastName")
	String getLastName();

	/**
	 * @return the adessi's line of business.
	 */
	@RequestMapping(value = "/adessi/lob", method = RequestMethod.GET)
	String getLineOfBusiness();

	/**
	 * @return the adessi's competence center.
	 */
	@RequestMapping(value = "/adessi/cc", method = RequestMethod.GET)
	String getCompetenceCenter();

	/**
	 * @return leader of the adessi's competence center.
	 */
	@RequestMapping(value = "/adessi/ccleader", method = RequestMethod.GET)
	String getCompetenceCenterLeader();

	/**
	 * @return the adessi's job description. Everything that has to be or can be said about the adessi's work at adesso.
	 */
	@RequestMapping(value = "/adessi/job", method = RequestMethod.GET)
	String getJobDescription();
}
