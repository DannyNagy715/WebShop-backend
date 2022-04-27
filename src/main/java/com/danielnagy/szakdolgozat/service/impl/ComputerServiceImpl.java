package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Computer;
import com.danielnagy.szakdolgozat.repository.ComputerRepository;
import com.danielnagy.szakdolgozat.service.ComputerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;

    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    @Override
    public void deleteComputer(Long id) {
        computerRepository.deleteById(id);
    }

    @Override
    public List<Computer> findAllComputers() {
        return computerRepository.findAll();
    }
}
