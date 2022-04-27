package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Camera;
import com.danielnagy.szakdolgozat.repository.CameraRepository;
import com.danielnagy.szakdolgozat.service.CameraService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CameraServiceImpl implements CameraService {

    private final CameraRepository cameraRepository;

    public CameraServiceImpl(CameraRepository cameraRepository) {
        this.cameraRepository = cameraRepository;
    }

    @Override
    public Camera saveCamera(Camera camera) {
        return cameraRepository.save(camera);
    }

    @Override
    public void deleteCamera(Long id) {
        cameraRepository.deleteById(id);
    }

    @Override
    public List<Camera> findAllCameras() {
        return cameraRepository.findAll();
    }
}
