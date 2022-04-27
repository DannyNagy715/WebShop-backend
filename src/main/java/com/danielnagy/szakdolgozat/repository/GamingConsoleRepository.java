package com.danielnagy.szakdolgozat.repository;

import com.danielnagy.szakdolgozat.model.GamingConsole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamingConsoleRepository extends JpaRepository<GamingConsole, Long> {
}
