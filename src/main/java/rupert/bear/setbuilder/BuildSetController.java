package rupert.bear.setbuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildSetController {

    @GetMapping("hi")
    public ResponseEntity<String> buildSetNotation() {
        return ResponseEntity.ok("Hello world");
    }

}
