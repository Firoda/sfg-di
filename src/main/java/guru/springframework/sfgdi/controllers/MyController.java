package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Component;

@Component
public class MyController {

    public String sayHello(){
        System.out.println("Hisdfgsg");

        return "Hi Folks";
    }
}
