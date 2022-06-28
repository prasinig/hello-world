package test.cicd.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cicd.helloworld.entity.Health;

@RestController
public class RouteController {

    @GetMapping("/")
    public String index() {
        return "Hello World (V2)";
    }

    @GetMapping("health")
    public Health health() {
        return  new Health("OK", "This is a fake Health end point");
    }
}
