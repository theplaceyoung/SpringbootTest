package com.springboot.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/delete-api")
public class DeleteController {

    // http://localhost:8090/api/v1/delete-api/{String 값}
    @DeleteMapping(value = "/{variable}")
    public String DeleteVariable(@PathVariable String variable){ // URI에 포함된 값을 받아 로직을 처리할 수 있음
        return variable;
    }

    // http://localhost:8090/api/v1/delete-api/request?email=value 
    @DeleteMapping(value= "/request1")
    public String getRequestParam1(@RequestParam String email){ // @RequestParam - 쿼리스트링 받을 수 있음
        return "email : " + email;
    }
}
