package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.GamingConsole;
import com.danielnagy.szakdolgozat.service.GamingConsoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/consoles")
public class GamingConsoleController {

    private final GamingConsoleService gamingConsoleService;

    public GamingConsoleController(GamingConsoleService gamingConsoleService) {
        this.gamingConsoleService = gamingConsoleService;
    }

    @PostMapping
    public ResponseEntity<?> saveConsole(@RequestBody GamingConsole console) {
        return new ResponseEntity<>(gamingConsoleService.saveGamingConsole(console), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteConsole(@PathVariable Long id) {
        gamingConsoleService.deleteGamingConsole(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> findConsoles() {
        return new ResponseEntity<>(gamingConsoleService.findAllGamingConsoles(), HttpStatus.OK);
    }
}
