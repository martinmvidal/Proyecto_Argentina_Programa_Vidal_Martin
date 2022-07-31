/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidalportfolio.vmd.Interface;

import com.vidalportfolio.vmd.Entity.Persona;
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
