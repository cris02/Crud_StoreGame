/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian.cursoSprint.controllers;

import com.cristian.cursoSprint.domain.Videojuego;
import com.cristian.cursoSprint.service.VideojuegoServide;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Aguilar
 */

@Controller
public class ListadoController {
    
    //inyectar el servicio
    private final VideojuegoServide videojuegoServide;

    public ListadoController(VideojuegoServide videojuegoServide) {
        this.videojuegoServide = videojuegoServide;
    }
    
    
    // end point de la ruta principal
    @RequestMapping("/")
    public String listarVideoJuegos(Model model){
        //enviar una lista de los videojuegos destacados
        List<Videojuego> juegoList = videojuegoServide.buscarDestacados();
        model.addAttribute("juegos", juegoList);
        //retorna la vista de todos los videojugos
        return "listado";
    }
    
    @RequestMapping("/videojuegosPorDistribuidor")
    public String listarVideojuegosPorDistribuidor(int distribuidorId, Model model){
        List<Videojuego> listJuegosDis = videojuegoServide.buscarPorDistribuidor(distribuidorId);
         model.addAttribute("juegos", listJuegosDis);
       return "listado";
    }
    
    //metodo para buscar juegos
    @RequestMapping("/buscar")
    public String buscar(@RequestParam("q") String consulta, Model model){
        List<Videojuego> listJuegos = videojuegoServide.buscarJuego(consulta);
        model.addAttribute("juegos", listJuegos);
        return "listado";
    }
}
