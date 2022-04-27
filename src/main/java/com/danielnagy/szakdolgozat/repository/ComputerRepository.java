package com.danielnagy.szakdolgozat.repository;

import com.danielnagy.szakdolgozat.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
