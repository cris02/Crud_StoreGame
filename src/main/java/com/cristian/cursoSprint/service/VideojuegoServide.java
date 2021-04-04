package com.cristian.cursoSprint.service;

import com.cristian.cursoSprint.domain.Videojuego;
import com.cristian.cursoSprint.repository.VideojuegoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoServide {
    
    //inyectar el repositorio
    private final VideojuegoRepository videojuegoRepository;
    
    //definir el constructor para realizar la inyeccion

    public VideojuegoServide(VideojuegoRepository videojuegoRepository) {
        this.videojuegoRepository = videojuegoRepository;
    }

    public List<Videojuego> buscarDestacados() {
        //retorna los videojuegos disponibles
        return videojuegoRepository.findAll();

    }
}
