package com.example.segurity;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1")
//trae al constructor de la entidad
@RequiredArgsConstructor
public class ApiController {


    @PostMapping("path")
    public String welcome(){
        return "welcome to the segurity endpoint";
    }
}
