package javas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class Java2Controller {

@RequestMapping("/java4s")
public ModelAndView helloWorld(){
	String message="Welcome to Java Spring session";
	message+="<br>You Did It..!";
	return new ModelAndView("welcomePage","welcomeMessage",message);
}

}
