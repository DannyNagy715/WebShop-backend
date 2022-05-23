package com.danielnagy.szakdolgozat.controller;


import com.danielnagy.szakdolgozat.model.Television;
import com.danielnagy.szakdolgozat.service.TelevisionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/televisions")
public class TelevisionController {

    private final TelevisionService televisionService;

    public TelevisionController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    @PostMapping
    public ResponseEntity<?> saveTelevision(@RequestBody Television tv) {
        return new ResponseEntity<>(televisionService.saveTelevision(tv), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteTelevision(@PathVariable Long id) {
        televisionService.deleteTelevision(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{serial}")
    public ResponseEntity<?> findTelevisionBySerial(@PathVariable String serial) {
        return new ResponseEntity<>(televisionService.findTelevisionBySerialNumber(serial), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findTelevisions() {
        return new ResponseEntity<>(televisionService.findAllTelevisions(), HttpStatus.OK);
    }
}
