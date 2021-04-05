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

    //metodo para buscar todos los videojuegos
    public List<Videojuego> buscarDestacados() {
        //retorna los videojuegos disponibles
        return videojuegoRepository.buscarTodos();

    }
    
    //metodo para filtrar los juegos por distribuidor
    public List<Videojuego> buscarPorDistribuidor(int distribuidorId){
        return videojuegoRepository.buscarPorDistribuidor(distribuidorId);
    }
}
