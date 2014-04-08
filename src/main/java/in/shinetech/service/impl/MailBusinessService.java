package in.shinetech.service.impl;

import in.shinetech.service.intf.MailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service("mailService")
public class MailBusinessService implements MailService {

	@Autowired
	private MailSender mailSender;

	@Autowired
	private SimpleMailMessage simpleMailMessage;

	public void sendMail(String name, String content, String email) {
		try {
			SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);
			message.setTo(new String[] { "kundu.anilkumar@gmail.com" });
			message.setText(String.format(simpleMailMessage.getText(), name,
					content));
			message.setFrom(email);
			// message.setTo("anil.kundu@gspann.com");
			// message.setFrom("anil.kundu0283@gmail.com");
			// message.setSubject("Spring Worlflow Test");
			mailSender.send(message);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
