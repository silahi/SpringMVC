package com.alhous.dev.spring.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author silahi
 */
@Controller
public class Sample {

    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }

}
