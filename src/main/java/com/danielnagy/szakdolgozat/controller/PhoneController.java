package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.Phone;
import com.danielnagy.szakdolgozat.service.PhoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/phones")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @PostMapping
    public ResponseEntity<?> savePhone(@RequestBody Phone phone) {
        return new ResponseEntity<>(phoneService.savePhone(phone), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deletePhone(@PathVariable Long id) {
        phoneService.deletePhone(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{make}")
    public ResponseEntity<?> findPhoneByMake(@PathVariable String make) {
        return new ResponseEntity<>(phoneService.findPhoneByMake(make), HttpStatus.OK);
    }

    @GetMapping("{serial}")
    public ResponseEntity<?> findPhoneBySerial(@PathVariable String serial) {
        return new ResponseEntity<>(phoneService.findPhoneBySerialNumber(serial), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findPhone() {
        return new ResponseEntity<>(phoneService.findAllPhones(), HttpStatus.OK);
    }

}
