package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Computer;

import java.util.List;

public interface ComputerService {

    Computer saveComputer(Computer computer);

    void deleteComputer(Long id);

    List<Computer> findAllComputers();
}
