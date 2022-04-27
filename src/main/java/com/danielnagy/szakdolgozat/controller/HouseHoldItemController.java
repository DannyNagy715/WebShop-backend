package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.HouseHold;
import com.danielnagy.szakdolgozat.service.HouseHoldService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/household")
public class HouseHoldItemController {

    private final HouseHoldService houseHoldService;

    public HouseHoldItemController(HouseHoldService houseHoldService) {
        this.houseHoldService = houseHoldService;
    }

    @PostMapping
    public ResponseEntity<?> saveHouseholdItem(@RequestBody HouseHold item) {
        return new ResponseEntity<>(houseHoldService.saveHouseHoldItem(item), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteHouseholdItem(@PathVariable Long id) {
        houseHoldService.deleteHouseHoldItem(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findHouseholdItems() {
        return new ResponseEntity<>(houseHoldService.findAllHouseHoldItems(), HttpStatus.OK);
    }
}
