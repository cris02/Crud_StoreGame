package com.cristian.cursoSprint.service;

import com.cristian.cursoSprint.domain.VideoJuego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VideojuegoServide {

    public List<VideoJuego> buscarDestacados() {
        List<VideoJuego> destacados = new ArrayList<>();

        //crear los video juegos y agregarlos en la lista
        VideoJuego juego = new VideoJuego();

        //crear el primier juego
        juego.setNombre("Bordelans 3");
        juego.setDescripcion("Borderlands 3​ es un videojuego de disparos en primera persona con elementos de rol, se trata de la secuela del videojuego de 2012, Borderlands 2.");
        juego.setImgenUrl("https://i2.wp.com/www.gameoverla.com/wp-content/uploads/2020/04/Borderlands-3-cover-art-1280x720.jpg?fit=1280%2C720&ssl=1");
        destacados.add(juego);

        juego = new VideoJuego();
        juego.setNombre("Control");
        juego.setDescripcion("Control es un videojuego de acción-aventura y disparos en tercera persona desarrollado por Remedy Entertainment y distribuido por 505 Games.");
        juego.setImgenUrl("https://image.api.playstation.com/vulcan/img/cfn/113078vQ_SpN-Wt1Ejgw5dPLXKnMvMfvZuekrerzhAOXaNrwZuCL6R6YEP4lUSGhMDthl6iyr4LbA_w565pBSa1xbUcHXtH8.png");
        destacados.add(juego);
        
        juego = new VideoJuego();
        juego.setNombre("Subnautica");
        juego.setDescripcion("Subnautica es un juego de aventuras y supervivencia desarrollado y publicado por Unknown Worlds Entertainment.");
        juego.setImgenUrl("https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_Subnautica.jpg");
        destacados.add(juego);
        
        juego = new VideoJuego();
        juego.setNombre("Firewatch");
        juego.setDescripcion("Firewatch es un videojuego de aventura y misterio en primera persona desarrollado por Campo Santo y producido por Campo Santo y Panic.");
        juego.setImgenUrl("https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2016/02/563168-firewatch-analisis-ps4-pc.jpg?itok=k5yrM3cm");
        destacados.add(juego);
        
        // retorna la lista de juegos existentes
        return destacados;

    }
}
