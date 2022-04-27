package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.Accessory;
import com.danielnagy.szakdolgozat.service.AccessoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/accessories")
public class AccessoryController {

    private final AccessoryService accessoryService;

    public AccessoryController(AccessoryService accessoryService) {
        this.accessoryService = accessoryService;
    }

    @PostMapping
    public ResponseEntity<?> saveAccessory(@RequestBody Accessory accessory) {
        return new ResponseEntity<>(accessoryService.saveAccessory(accessory), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteAccessory(@PathVariable Long id) {
        accessoryService.deleteAccessory(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllAccessories() {
        return new ResponseEntity<>(accessoryService.findAllAccessories(), HttpStatus.OK);
    }


}
