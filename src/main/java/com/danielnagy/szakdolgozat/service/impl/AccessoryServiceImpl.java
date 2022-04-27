package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Accessory;
import com.danielnagy.szakdolgozat.repository.AccessoryRepository;
import com.danielnagy.szakdolgozat.service.AccessoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryServiceImpl implements AccessoryService {

    private final AccessoryRepository accessoryRepository;

    public AccessoryServiceImpl(AccessoryRepository accessoryRepository) {
        this.accessoryRepository = accessoryRepository;
    }

    @Override
    public Accessory saveAccessory(Accessory accessory) {
        return accessoryRepository.save(accessory);
    }

    @Override
    public void deleteAccessory(Long id) {
        accessoryRepository.deleteById(id);
    }

    @Override
    public List<Accessory> findAllAccessories() {
        return accessoryRepository.findAll();
    }
}
