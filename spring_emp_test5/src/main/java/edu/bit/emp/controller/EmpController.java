package edu.bit.emp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.bit.emp.Service.empService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@Controller
public class EmpController {
	private empService empservice;
	
	@GetMapping("/employInput")
	public void employInput(Model model) {
		log.info("employInput controller");
		model.addAttribute("listMgr", empservice.getListMgr());
		model.addAttribute("listDep", empservice.getListDep());
	}
	
	@GetMapping("/tables")
	public void list(Model model) {
		log.info("tables");
		model.addAttribute("list", empservice.getList());
		
	}

}
