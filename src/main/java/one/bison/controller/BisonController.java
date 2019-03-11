/**
 * 
 */
package one.bison.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ntulsi
 *
 */
@RestController
public class BisonController {
	
	@GetMapping
	public String test() {
		return "Service is Up";
	}

}
