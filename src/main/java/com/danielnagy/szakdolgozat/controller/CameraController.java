package com.danielnagy.szakdolgozat.controller;

import com.danielnagy.szakdolgozat.model.Camera;
import com.danielnagy.szakdolgozat.service.CameraService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/cameras")
public class CameraController {

    private final CameraService cameraService;

    public CameraController(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    @PostMapping
    public ResponseEntity<?> saveCamera(@RequestBody Camera camera) {
        return new ResponseEntity<>(cameraService.saveCamera(camera), HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteCamera(@PathVariable Long id) {
        cameraService.deleteCamera(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> listCameras() {
        return new ResponseEntity<>(cameraService.findAllCameras(), HttpStatus.OK);
    }
}
