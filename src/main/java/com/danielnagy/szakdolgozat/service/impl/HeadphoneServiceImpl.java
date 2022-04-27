package com.danielnagy.szakdolgozat.service.impl;

import com.danielnagy.szakdolgozat.model.Headphone;
import com.danielnagy.szakdolgozat.repository.HeadphoneRepository;
import com.danielnagy.szakdolgozat.service.HeadphoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadphoneServiceImpl implements HeadphoneService {

    private final HeadphoneRepository headphoneRepository;

    public HeadphoneServiceImpl(HeadphoneRepository headphoneRepository) {
        this.headphoneRepository = headphoneRepository;
    }

    @Override
    public Headphone saveHeadphone(Headphone headphone) {
        return headphoneRepository.save(headphone);
    }

    @Override
    public void deleteHeadphone(Long id) {
        headphoneRepository.deleteById(id);
    }

    @Override
    public List<Headphone> findAllHeadphones() {
        return headphoneRepository.findAll();
    }
}
