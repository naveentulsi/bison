/**
 * 
 */
package one.bison.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ntulsi
 *
 */
@RestController
public class BisonController {
	
	@GetMapping
	public String test() {
		return "You are have requested a GET method. Thanks!";
	}
	
	@PostMapping
	public String testPost(@RequestBody String body) {
		return String.format("You have reached a POST Method with body %s . Thanks!", body);
	}

}
