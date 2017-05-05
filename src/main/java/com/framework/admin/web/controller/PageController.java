package com.framework.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/{path}.html")
	public String page(@PathVariable("path") String path){
		return path + ".html";
	}
}
