package com.vidalmartindeveloper.vmd.Interface;

import com.vidalmartindeveloper.vmd.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Listar
    public List<Persona> getPersona();
    //Guardar
    public void savePersona(Persona persona);
    //Eliminar
    public void deletePersona(Long id);
    //Buscar
    public Persona findPersona(Long id);
}
