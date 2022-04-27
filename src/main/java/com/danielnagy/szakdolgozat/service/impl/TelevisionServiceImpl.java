package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Television;
import com.danielnagy.szakdolgozat.repository.TelevisionRepository;
import com.danielnagy.szakdolgozat.service.TelevisionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelevisionServiceImpl implements TelevisionService {

    private final TelevisionRepository televisionRepository;

    public TelevisionServiceImpl(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    @Override
    public Television saveTelevision(Television television) {
        return televisionRepository.save(television);
    }

    @Override
    public void deleteTelevision(Long id) {
        televisionRepository.deleteById(id);
    }

    @Override
    public Optional<Television> findTelevisionBySerialNumber(String serial) {
        return televisionRepository.findTelevisionBySerialNumber(serial);
    }

    @Override
    public List<Television> findAllTelevisions() {
        return televisionRepository.findAll();
    }
}
