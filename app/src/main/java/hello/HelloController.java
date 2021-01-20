package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello from Spring Boot!";
    }   
	
	 @RequestMapping("/hello")
    public String hello() {
        return "deployed Hello In Azure!";
    } 
}
