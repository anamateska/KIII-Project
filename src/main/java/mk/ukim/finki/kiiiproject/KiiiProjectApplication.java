package mk.ukim.finki.kiiiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KiiiProjectApplication {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello!";
    }

    public static void main(String[] args) {
        SpringApplication.run(KiiiProjectApplication.class, args);
    }

}
