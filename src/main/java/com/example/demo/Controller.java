package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ilyas Ziyaoglu
 * @date 2020-06-11
 */

@RestController
public class Controller {
	@GetMapping("/merhaba")
	public String hello() {
		return "Merhaba";
	}
}
