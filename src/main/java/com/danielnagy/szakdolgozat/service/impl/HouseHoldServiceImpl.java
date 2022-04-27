package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.HouseHold;
import com.danielnagy.szakdolgozat.repository.HouseHoldRepository;
import com.danielnagy.szakdolgozat.service.HouseHoldService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseHoldServiceImpl implements HouseHoldService {

    private final HouseHoldRepository houseHoldRepository;

    public HouseHoldServiceImpl(HouseHoldRepository houseHoldRepository) {
        this.houseHoldRepository = houseHoldRepository;
    }

    @Override
    public HouseHold saveHouseHoldItem(HouseHold houseHoldItem) {
        return houseHoldRepository.save(houseHoldItem);
    }

    @Override
    public void deleteHouseHoldItem(Long id) {
        houseHoldRepository.deleteById(id);
    }

    @Override
    public List<HouseHold> findAllHouseHoldItems() {
        return houseHoldRepository.findAll();
    }
}
