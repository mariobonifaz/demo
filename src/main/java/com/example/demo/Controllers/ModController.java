package com.example.demo.Controllers;

import com.example.demo.dto.response.ModResponse;
import com.example.demo.entities.Mod;
import com.example.demo.services.interfaces.IModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class ModController {

    @RestController
    @RequestMapping( value="moder" )
    public static class CommentController{

        @Autowired
        private IModService service;

        @GetMapping("{id}")
        public ModResponse getModById(@PathVariable Long id){
            return service.getModById(id);
        }

        @GetMapping("list")
        Iterable<Mod> getModList(){
            return service.findAll();
        }

        @DeleteMapping("delete/{id}")
        public void deleteMod(@PathVariable Long id){
            service.deleteMod(id);
        }

        @PostMapping("register")
        public Mod registerMod(@RequestBody Mod mod){
            return service.registerMod(mod);
        }

        @PutMapping("/update")
        public Mod updateMod(@RequestBody Mod mod){
            service.saveOrUpdate(mod);
            return mod;
        }
    }
}
