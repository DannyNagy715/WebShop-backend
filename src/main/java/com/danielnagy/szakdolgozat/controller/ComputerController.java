package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.Computer;
import com.danielnagy.szakdolgozat.service.ComputerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/computers")
public class ComputerController {

    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @PostMapping
    public ResponseEntity<?> saveComputer(@RequestBody Computer computer) {
        return new ResponseEntity<>(computerService.saveComputer(computer), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteComputer(@PathVariable Long id) {
        computerService.deleteComputer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findComputers() {
        return new ResponseEntity<>(computerService.findAllComputers(), HttpStatus.OK);
    }
}
