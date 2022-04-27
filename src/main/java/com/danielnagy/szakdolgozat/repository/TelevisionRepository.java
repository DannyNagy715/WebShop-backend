package com.danielnagy.szakdolgozat.repository;

import com.danielnagy.szakdolgozat.model.Television;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TelevisionRepository extends JpaRepository<Television, Long> {
    Optional<Television> findTelevisionBySerialNumber(String serial);
}
