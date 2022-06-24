package com.vidalmartindeveloper.vmd.Controller;

import com.vidalmartindeveloper.vmd.Entity.Persona;
import com.vidalmartindeveloper.vmd.Interface.IPersonaService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

}
