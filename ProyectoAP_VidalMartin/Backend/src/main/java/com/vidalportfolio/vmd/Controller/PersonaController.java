/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidalportfolio.vmd.Controller;

import com.vidalportfolio.vmd.Entity.Persona;
import com.vidalportfolio.vmd.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class PersonaController {

    @Autowired
    IPersonaService ipersonaService;

    @GetMapping("/personas/get")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }

    @PostMapping("/personas/make")
    public String createPersona(@RequestBody Persona persona) {
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente.";

    }

    @DeleteMapping("/personas/delete/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente.";
    }

    @PutMapping("/personas/edit/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido, @RequestParam("img") String nuevaImg) {
        Persona persona = ipersonaService.findPersona(id);
        persona.setApellido(nuevoApellido);
        persona.setNombre(nuevoNombre);
        persona.setImg(nuevaImg);
        ipersonaService.savePersona(persona);
        return persona;

    }
    
    @GetMapping("/personas/get/profile")
    public Persona findPersona(Long id){
        return ipersonaService.findPersona((long)1);
    }

}