/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cristian.cursoSprint.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Aguilar
 */

@Controller
public class VideojuegoAbmController {
    @RequestMapping("/videojuegos/crear")
    public String mostrarFormAlta(){
        return "formVideojuego";
    }
}
