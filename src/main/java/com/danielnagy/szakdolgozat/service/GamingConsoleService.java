package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.GamingConsole;

import java.util.List;

public interface GamingConsoleService {

    GamingConsole saveGamingConsole(GamingConsole gamingConsole);

    void deleteGamingConsole(Long id);

    List<GamingConsole> findAllGamingConsoles();
}
