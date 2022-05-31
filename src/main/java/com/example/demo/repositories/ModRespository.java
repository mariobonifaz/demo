package com.example.demo.repositories;

import com.example.demo.entities.Mod;
import org.springframework.data.repository.CrudRepository;

public interface ModRespository extends CrudRepository<Mod, Long> {
}
