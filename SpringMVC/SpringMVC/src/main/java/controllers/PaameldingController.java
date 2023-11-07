package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import interfaces.DeltagerRepo;
import jakarta.validation.Valid;
import objects.Deltager;
import services.DeltagerService;

@Controller
public class PaameldingController {

	@Autowired
	private static DeltagerService service;
	
    @GetMapping("/")
    public String redirectToPaaMeldingMedMelding(Model model) {
    	model.addAttribute("deltager", new Deltager());
    	return "paamelding_med_melding";
    }
    
    @PostMapping("/lagreDeltager")
    public String lagreDeltager(@Valid @ModelAttribute("deltager") Deltager deltager,
    		BindingResult bindingResult) {
    	
    	if(bindingResult.hasErrors()) {
    		return "paamelding_med_melding";
    	}
    	
    	return "paameldt";
    }
    
    @GetMapping("/deltagere")
    @ResponseBody
    public Deltager visAlleDeltagere(Model model) {
        Deltager deltagerList = service.finnDeltagerMedMobil("12345678");
        return deltagerList;
    }
    
    
}