package com.example.demo.service;


import com.example.demo.domain.TestTable;
import com.example.demo.repository.TestTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TestTableService {
    @Autowired
    TestTableRepository testTableRepository;

    public Optional<TestTable> getTestTable(Long id){
        return testTableRepository.findById(id);
    }

    public List<TestTable> findAllTestTable() {
        return testTableRepository.findAll();
    }
}
