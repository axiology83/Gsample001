package kr.co.tj;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping({"/", "/check"})
	public ResponseEntity<?> test(){
		
		
		return ResponseEntity.ok().body("check_test");
		
	}
	
	
	
	
	
}
