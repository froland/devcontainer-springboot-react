package be.eafcuccle.server;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
  @GetMapping("/hello")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("Hello World!");
  }
}
