package com.example.tpdevops;


import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/")
public class Controller {

        @GetMapping
        public User getUser() {
            return new User("adam", "midani", "cybersecurity");
        }




}
