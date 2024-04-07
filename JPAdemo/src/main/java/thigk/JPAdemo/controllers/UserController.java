package thigk.JPAdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/user")
public class UserController {
	@GetMapping("/")
	public String HomeUser() {
		return "user/userhome";
	}
}
