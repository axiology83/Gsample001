package kr.co.tj;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping({"/", "/check"})
	public ResponseEntity<?> test(){
		
		Map<String, String> map = new HashMap<>();
		map.put("hello", "world");
		return ResponseEntity.ok().body(map);
		
	}
	
	
	
	
	
}
