package test.cicd.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.cicd.helloworld.entity.Health;

@RestController
public class RouteController {

    @GetMapping("/")
    public String index() {
        return """
                <div style='text-align: center;'>
                	<h1 >Hello World (V3)</h1>
                	<p>Welcome to the world of automation</p>
                </div>
                """;
    }

    @GetMapping("health")
    public Health health() {
        return new Health("OK", "This is a fake Health end point");
    }
}
