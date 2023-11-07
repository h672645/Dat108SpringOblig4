package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import objects.Deltager;

@Controller
public class TestController {

	@RequestMapping("/reg")
	public String regSkjema(Model model) {
		return "hilsen";
	}

//		@PostMapping("/registrer")
//		public String paamelding(Model model,
//				@RequestParam(name = "fornavn") String fornavn,
//				@RequestParam(name = "etternavn") String etternavn,
//				@RequestParam(name = "mobil") int mobil,
//				@RequestParam(name = "passord") String passord,
//				@RequestParam(name = "kjonn") Kjonn kjonn
//				) {
//			
//			Deltager deltager = new Deltager(fornavn, etternavn, mobil, passord, kjonn);
//			model.addAttribute("d", deltager);
//			System.err.println(deltager);
//			return "hilsen";
//		}

	@PostMapping("/registrer")
	public String paamelding(@Valid @ModelAttribute("deltager") Deltager deltager, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			// Handle validation errors
			return "form-page"; // Return to the form page to display errors
		}
		// Process the valid data
		return "success-page";
	}

	@RequestMapping("/lagrePerson")
	public String lagrePerson(@ModelAttribute("deltager") Deltager deltager) {
		System.err.println(deltager);
		System.err.println("Lagrer i database...");
		return "paameldt";
	}

}
