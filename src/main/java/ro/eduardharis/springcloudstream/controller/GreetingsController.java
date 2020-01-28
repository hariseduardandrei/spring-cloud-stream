package ro.eduardharis.springcloudstream.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.eduardharis.springcloudstream.message.Greetings;
import ro.eduardharis.springcloudstream.service.GreetingsService;

@RestController
@AllArgsConstructor
public class GreetingsController {

    private final GreetingsService greetingsService;

    @GetMapping("/greeting")
    public void greetings(@RequestParam("message") String message) {
        Greetings greetings = Greetings.builder().message(message).timestamp(System.currentTimeMillis()).build();
        greetingsService.sendGreeting(greetings);
    }
}
