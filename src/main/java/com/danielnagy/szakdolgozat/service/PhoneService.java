package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Phone;

import java.util.List;
import java.util.Optional;

public interface PhoneService {

    Phone savePhone(Phone phone);

    void deletePhone(Long id);

    Optional<Phone> findPhoneBySerialNumber(String serial);

    Optional<Phone> findPhoneByMake(String make);

    List<Phone> findAllPhones();
}
