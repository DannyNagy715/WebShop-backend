package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Television;

import java.util.List;
import java.util.Optional;

public interface TelevisionService {

    Television saveTelevision(Television television);

    void deleteTelevision(Long id);

    Optional<Television> findTelevisionBySerialNumber(String serial);

    List<Television> findAllTelevisions();
}
