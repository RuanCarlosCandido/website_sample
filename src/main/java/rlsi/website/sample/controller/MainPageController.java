package rlsi.website.sample.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {

	private static final String INDEX_PAGE_ENDPOINT = "/";

	@GetMapping(INDEX_PAGE_ENDPOINT)
	public String overview(Model model) {
		model.addAttribute("now", new Date());
		return "index";
	}

}
