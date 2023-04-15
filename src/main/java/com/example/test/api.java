package com.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "http://localhost:4200")
public class api {
    @GetMapping("/testmodel")
    public List<TestModel> getApi(){
        List<TestModel> results = new ArrayList<>();
        results.add(new TestModel(15,"thanh"));
        results.add(new TestModel(11,"thanh4"));
        results.add(new TestModel(12,"thanh6"));
        return results;
    }
}
