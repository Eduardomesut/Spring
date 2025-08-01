package org.example.filminapi.modelo.persistencia;

import org.example.filminapi.modelo.entidad.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepositorio extends JpaRepository<Actor, Long> {


}
