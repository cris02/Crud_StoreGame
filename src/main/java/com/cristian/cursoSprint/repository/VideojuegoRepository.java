/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian.cursoSprint.repository;

import com.cristian.cursoSprint.domain.Videojuego;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Aguilar
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
    //metodo que retorna todos los videojuegos de manera ordenada
    @Query("select v from Videojuego v order by v.nombre")
    List<Videojuego> buscarTodos();
    
    //metodo para filtrar lo juegos por distribuidor
    @Query("from Videojuego v where v.distribuidor.id = ?1 order by v.nombre")
    List<Videojuego> buscarPorDistribuidor(int distribuidorId);
    
    //metodo para buscar un juego en especifico
    //@Query("from Videojuego v where v.nombre like %?1%")
    List<Videojuego> findByNombreContaining(String consulta); // aplicando query method
    
}
