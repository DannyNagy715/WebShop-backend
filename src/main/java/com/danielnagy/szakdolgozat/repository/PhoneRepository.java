package com.danielnagy.szakdolgozat.repository;

import com.danielnagy.szakdolgozat.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

    Optional<Phone> findPhoneBySerialNumber(String serial);

    Optional<Phone>findPhoneByMake(String make);
}
