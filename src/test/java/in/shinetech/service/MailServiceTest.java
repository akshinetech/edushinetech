package in.shinetech.service;

import in.shinetech.service.intf.MailService;
import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:D:/workspace_parent/SpringModules/src/main/webapp/WEB-INF/ApplicationContext-servlet.xml")
public class MailServiceTest extends TestCase {

	@Autowired
	private MailService mailService;

	@Test
	public void testSendMail() {
		mailService.sendMail("Rahul", "how r u", "");
	}

}
