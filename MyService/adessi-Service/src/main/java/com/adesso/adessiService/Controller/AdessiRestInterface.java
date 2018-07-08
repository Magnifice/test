package com.adesso.adessiService.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public interface AdessiRestInterface {
	/**
	 * @return the adessi's first name.
	 */
	@RequestMapping("/adessi/firstName")
    String getFirstName();
	
	/**
	 * @return the adessi's last name.
	 */
	@RequestMapping("/adessi/lastName")
	String getLastName();

	/**
	 * @return the adessi's line of business.
	 */
	@RequestMapping("/adessi/lob")
	String getLineOfBusiness();
	
	/**
	 * @return the adessi's competence center.
	 */
	@RequestMapping("/adessi/cc")
	String getCompetenceCenter();

	/**
	 * @return leader of the adessi's competence center.
	 */
	@RequestMapping("/adessi/ccleader")
	String getCompetenceCenterLeader();
	
	/**
	 * @return the adessi's job description. Everything that has to be or can be said about the adessi's work at adesso.
	 */
	@RequestMapping("/adessi/job1")
	String getJobDescription();
}