package thomc.FormSubmit_Thymeleaf.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thomc.FormSubmit_Thymeleaf.models.SinhVien;

@Controller
public class SinhVienController {
	@GetMapping("/themMoiSV")
	public String showForm(Model model) {
        SinhVien sinhvienNull = new SinhVien();
        model.addAttribute("svDTO", sinhvienNull);
        return "themSinhVien_form";
    }
	@PostMapping("/themMoiSV")
	public String submitForm(@ModelAttribute("svDTO") SinhVien sv) {
	    return "themSinhVien_OK";
	}
	 
}
