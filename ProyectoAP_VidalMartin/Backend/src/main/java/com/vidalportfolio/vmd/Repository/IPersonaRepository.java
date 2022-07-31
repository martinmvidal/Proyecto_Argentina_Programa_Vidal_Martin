
package com.vidalportfolio.vmd.Repository;

import com.vidalportfolio.vmd.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
