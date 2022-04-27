package com.danielnagy.szakdolgozat.repository;

import com.danielnagy.szakdolgozat.model.Camera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CameraRepository extends JpaRepository<Camera, Long> {
}
