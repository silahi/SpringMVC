package com.alhous.dev.spring.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author silahi
 */
@Controller
public class Client {

    @GetMapping("/client/nouveau")
    public String newClient() {
        
        return "client/nouveau";
    }
}
