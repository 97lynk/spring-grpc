package io.a97lynk.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {

    private final GreetingService foobarService;

    public GreetingController(GreetingService foobarService) {
        this.foobarService = foobarService;
    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(value = "firstName", defaultValue = "Tuan") String firstName,
            @RequestParam(value = "lastName", defaultValue = "Nguyen") String lastName) {
        return foobarService.sayHello(firstName, lastName);
    }


}
