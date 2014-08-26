package de.uni_koeln.spinfo.maalr.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping(value = "/jsondemo", method = RequestMethod.GET)
	public ModelAndView jsonDemo() {
		return new ModelAndView("jsondemo");
	}
	
}
