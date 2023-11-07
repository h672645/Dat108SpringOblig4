package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import interfaces.DeltagerRepo;
import objects.Deltager;
import services.DeltagerService;

@Controller
public class PaameldingController {

	@Autowired 
	private DeltagerService service;
	
    @RequestMapping("/")
    public String redirectToPaaMeldingMedMelding(Model model) {
        return "paamelding_med_melding";
    }
    
    @GetMapping("/deltagere")
    @ResponseBody
    public List<Deltager> visAlleDeltagere(Model model) {
        List<Deltager> deltagerList = service.findAllDeltager();
        return deltagerList;
    }
    
    
}