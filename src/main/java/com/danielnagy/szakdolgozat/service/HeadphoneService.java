package com.danielnagy.szakdolgozat.service;

import com.danielnagy.szakdolgozat.model.Headphone;

import java.util.List;

public interface HeadphoneService {

    Headphone saveHeadphone(Headphone headphone);

    void deleteHeadphone(Long id);

    List<Headphone> findAllHeadphones();
}
