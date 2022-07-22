package com.vidalmartindeveloper.vmd.Security.Repository;

import com.vidalmartindeveloper.vmd.Security.Entity.Rol;
import com.vidalmartindeveloper.vmd.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
