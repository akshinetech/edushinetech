package in.shinetech.controller;

import in.shinetech.service.intf.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@Autowired
	private MailService mailService;

	@RequestMapping(method = RequestMethod.POST, value = "contact")
	public void contact(@RequestParam String name, @RequestParam String email,
			@RequestParam String message) {
		System.out.println("contact++++++++++++sender email : " + email);
		mailService.sendMail(name, message, email);
	}

}
