package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.GamingConsole;
import com.danielnagy.szakdolgozat.repository.GamingConsoleRepository;
import com.danielnagy.szakdolgozat.service.GamingConsoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamingConsoleServiceImpl implements GamingConsoleService {

    private final GamingConsoleRepository gamingConsoleRepository;

    public GamingConsoleServiceImpl(GamingConsoleRepository gamingConsoleRepository) {
        this.gamingConsoleRepository = gamingConsoleRepository;
    }

    @Override
    public GamingConsole saveGamingConsole(GamingConsole gamingConsole) {
        return gamingConsoleRepository.save(gamingConsole);
    }

    @Override
    public void deleteGamingConsole(Long id) {
        gamingConsoleRepository.deleteById(id);
    }

    @Override
    public List<GamingConsole> findAllGamingConsoles() {
        return gamingConsoleRepository.findAll();
    }
}
