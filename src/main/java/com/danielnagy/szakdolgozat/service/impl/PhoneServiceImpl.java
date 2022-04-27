package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Phone;
import com.danielnagy.szakdolgozat.repository.PhoneRepository;
import com.danielnagy.szakdolgozat.service.PhoneService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneServiceImpl implements PhoneService {

    private final PhoneRepository phoneRepository;

    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Phone savePhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public void deletePhone(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public Optional<Phone> findPhoneBySerialNumber(String serial) {
        return phoneRepository.findPhoneBySerialNumber(serial);
    }

    @Override
    public Optional<Phone> findPhoneByMake(String make) {
        return phoneRepository.findPhoneByMake(make);
    }

    @Override
    public List<Phone> findAllPhones() {
        return phoneRepository.findAll();
    }
}
