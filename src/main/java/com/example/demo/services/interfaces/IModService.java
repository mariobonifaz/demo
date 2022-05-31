package com.example.demo.services.interfaces;

import com.example.demo.dto.response.ModResponse;
import com.example.demo.entities.Mod;

public interface IModService {

    ModResponse getModById(Long id);
    Iterable<Mod> findAll();

    void deleteMod(Long id);

    Mod registerMod(Mod mod);

    void saveOrUpdate(Mod mod);
}
