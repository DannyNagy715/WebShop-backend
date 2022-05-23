package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.Headphone;
import com.danielnagy.szakdolgozat.service.HeadphoneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/headphones")
public class HeadphoneController {

    private final HeadphoneService headphoneService;

    public HeadphoneController(HeadphoneService headphoneService) {
        this.headphoneService = headphoneService;
    }

    @PostMapping
    public ResponseEntity<?> saveHeadphone(@RequestBody Headphone headphone) {
        return new ResponseEntity<>(headphoneService.saveHeadphone(headphone), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteHeadphone(@PathVariable Long id) {
        headphoneService.deleteHeadphone(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findHeadphones() {
        return new ResponseEntity<>(headphoneService.findAllHeadphones(), HttpStatus.OK);
    }
}
