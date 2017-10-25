package com.bluesoft.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bluesoft.application.model.Contract;
import com.bluesoft.application.service.ContractService;

@Controller
public class ContractController {

	@Autowired
	private ContractService contractService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String regetAddNewContractForm(Model model) {
		Contract newContract = new Contract();
		model.addAttribute("newContract", newContract);
		return "addContract";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String proccessAddNewContractForm(@ModelAttribute("newContract") @Valid Contract newContract, BindingResult result) {
		if(result.hasErrors()) {
			return "addContract";
		}
		contractService.insert(newContract);
		return "success";
	}
	
	@RequestMapping("/all")
	public String allContracts(Model model) {
		model.addAttribute("contracts", contractService.select());
		return "allContracts";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String proccessUpdateContractForm(@ModelAttribute("newContract") @Valid Contract newContract, BindingResult result) {
		if(result.hasErrors()) {
			return "updateContract";
		}
		contractService.update(newContract);
		return "success";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String proccessDeleteContractForm(@ModelAttribute("newContract") Contract newContract) {
		contractService.delete(newContract.getNumber());
		return "success";
	}
	
	@RequestMapping("/success")
	public String success(Model model) {
		return "success";
	}
}
