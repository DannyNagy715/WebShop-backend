package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.HouseHold;

import java.util.List;

public interface HouseHoldService {

    HouseHold saveHouseHoldItem (HouseHold houseHoldItem);

    void deleteHouseHoldItem (Long id);

    List<HouseHold> findAllHouseHoldItems();
}
