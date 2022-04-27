package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Camera;

import java.util.List;

public interface CameraService {

    Camera saveCamera(Camera camera);

    void deleteCamera(Long id);

    List<Camera> findAllCameras();
}
