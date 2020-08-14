package com.example.demo.controller;


import com.example.demo.entity.TestTable;
import com.example.demo.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("test")
public class TestTableController {

    @Autowired
    TestTableService testTableService;

    @GetMapping("/{id}")
    public Optional<TestTable> getTestTable(
            @PathVariable Long id
    ){
        return testTableService.getTestTable(id);
    }

    @GetMapping
    public List<TestTable> findAllTestTable(){
        return testTableService.findAllTestTable();
    }
}
