/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian.cursoSprint.repository;

import com.cristian.cursoSprint.domain.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Aguilar
 */
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer>{
    
}
