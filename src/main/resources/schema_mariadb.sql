
drop table if exists videojuego;

create table videojuego (
    id int primary key auto_increment,
    nombre varchar(150) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
); 

insert into videojuego (nombre, descripcion, imagen_url)
values
('Bordelans 3', 'Borderlands 3​ es un videojuego de disparos en primera persona con elementos de rol, se trata de la secuela del 
videojuego de 2012, Borderlands 2.', 'https://i2.wp.com/www.gameoverla.com/wp-content/uploads/2020/04/Borderlands-3-cover-art-1280x720.jpg?fit=1280%2C720&ssl=1'),
('Control', 'Control es un videojuego de acción-aventura y disparos en tercera persona desarrollado por Remedy Entertainment y distribuido por 505 Games.', 
'https://image.api.playstation.com/vulcan/img/cfn/113078vQ_SpN-Wt1Ejgw5dPLXKnMvMfvZuekrerzhAOXaNrwZuCL6R6YEP4lUSGhMDthl6iyr4LbA_w565pBSa1xbUcHXtH8.png'),
('Subnautica', 'Subnautica es un juego de aventuras y supervivencia desarrollado y publicado por Unknown Worlds Entertainment.', 
'https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_Subnautica.jpg'),
('Firewatch', 'Firewatch es un videojuego de aventura y misterio en primera persona desarrollado por Campo Santo y producido por Campo Santo y Panic.', 
'https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2016/02/563168-firewatch-analisis-ps4-pc.jpg?itok=k5yrM3cm'),
('Bordelans 3', 'Borderlands 3​ es un videojuego de disparos en primera persona con elementos de rol, se trata de la secuela del 
videojuego de 2012, Borderlands 2.', 'https://i2.wp.com/www.gameoverla.com/wp-content/uploads/2020/04/Borderlands-3-cover-art-1280x720.jpg?fit=1280%2C720&ssl=1'),
('Control', 'Control es un videojuego de acción-aventura y disparos en tercera persona desarrollado por Remedy Entertainment y distribuido por 505 Games.', 
'https://image.api.playstation.com/vulcan/img/cfn/113078vQ_SpN-Wt1Ejgw5dPLXKnMvMfvZuekrerzhAOXaNrwZuCL6R6YEP4lUSGhMDthl6iyr4LbA_w565pBSa1xbUcHXtH8.png'),
('Subnautica', 'Subnautica es un juego de aventuras y supervivencia desarrollado y publicado por Unknown Worlds Entertainment.', 
'https://cdn02.nintendo-europe.com/media/images/10_share_images/games_15/nintendo_switch_4/H2x1_NSwitch_Subnautica.jpg'),
('Firewatch', 'Firewatch es un videojuego de aventura y misterio en primera persona desarrollado por Campo Santo y producido por Campo Santo y Panic.', 
'https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2016/02/563168-firewatch-analisis-ps4-pc.jpg?itok=k5yrM3cm');
