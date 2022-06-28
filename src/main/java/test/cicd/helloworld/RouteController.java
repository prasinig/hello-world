package test.cicd.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {

    @GetMapping("/")
    public String index() {
        return "Hello World (V2)";
    }
}
