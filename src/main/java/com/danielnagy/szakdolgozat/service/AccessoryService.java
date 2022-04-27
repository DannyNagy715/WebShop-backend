package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Accessory;

import java.util.List;

public interface AccessoryService {

    Accessory saveAccessory(Accessory accessory);

    void deleteAccessory(Long id);

    List<Accessory> findAllAccessories();
}
