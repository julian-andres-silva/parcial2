package com.gestion.de.clases.parcial2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
        @Repository
public interface Estudiantesrepositorio extends JpaRepository<Estudiantes,Long> {
}
