package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaameldingController {

    @RequestMapping("/")
    public String redirectToPaaMeldingMedMelding(Model model) {
        return "paamelding_med_melding";
    }
}