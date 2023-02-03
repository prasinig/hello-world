package test.cicd.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class RouteController {

    @GetMapping("/")
    public String index() {
        return """
                <div style='text-align: center;'>
                	<h1 >Hello World (V3)</h1>
                	<img  src="https://miro.medium.com/max/1224/1*t6AoYmibARPlaJejcrrZEg.png"  >
                	<p>Welcome to the world of automation</p>
                </div>
                """;
    }


    @GetMapping("health")
    public ResponseEntity<Void> redirect(){
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("/actuator?redirect=true")).build();
    }
}
