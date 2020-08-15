package com.example.demo.controller;


import com.example.demo.domain.TestTable;
import com.example.demo.service.TestTableService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("test")
@Slf4j
public class TestTableController {

    @Autowired
    TestTableService testTableService;

    @GetMapping("/{id}")
    public Map<String, Object> getTestTable(
            @PathVariable Long id
    ){
        Map<String, Object> response = new HashMap<>();


        Optional<TestTable> optionalTest =  testTableService.getTestTable(id);
        if(optionalTest.isPresent()) {
            response.put("result", "SUCCESS");
            response.put("testTable", optionalTest);
        } else {
            response.put("result", "FAIL");
            response.put("reason", "존재하지않아요");
        }

        return response;
    }

    @GetMapping
    public List<TestTable> findAllTestTable(){
        return testTableService.findAllTestTable();
    }
}
