package com.content.scream.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.content.scream.spaceservice.SpaceResolverService;

@RestController
public class ContentScreamSpaceController {

	@Autowired
	private SpaceResolverService spaceResolverService;
	
	@RequestMapping(path = "/space", method = RequestMethod.GET)
	public String getContent() {
		return spaceResolverService.getSpacesOfCurrentCustomer();
	}
}
