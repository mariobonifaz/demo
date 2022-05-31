package com.example.demo.services.impl;

import com.example.demo.dto.response.ModResponse;
import com.example.demo.entities.Mod;
import com.example.demo.repositories.ModRespository;
import com.example.demo.services.interfaces.IModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModServiceImpl implements IModService {

    @Autowired
    private ModRespository respository;

    @Override
    public Iterable<Mod> findAll() {
        return respository.findAll();
    }

    @Override
    public ModResponse getModById(Long id) {
        return from(respository.findById(id)
                .orElseThrow(() -> new RuntimeException("Hola perrin")));
    }

    private ModResponse from(Mod mod){
        ModResponse response = new ModResponse();
        response.setId(mod.getId());
        response.setNamew(mod.getNamew());
        response.setWeapon(mod.getWeapon());
        response.setMission(mod.getMission());
        return response;
    }

    @Override
    public void deleteMod(Long id){
        respository.deleteById(id);
    }

    @Override
    public Mod registerMod(Mod mod){
        return respository.save(mod);
    }

    public void saveOrUpdate(Mod mod){
        respository.save(mod);
    }
}
