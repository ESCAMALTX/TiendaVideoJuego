-- ============================================================
--  DATOS DE EJEMPLO
--  Se ejecutan solos al arrancar la aplicacion.
--  Solo insertan si la tabla esta vacia, asi no se duplican.
-- ============================================================

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'Naruto' AS nombre,
           'Lucha 3D de tres contra tres que adapta el final del manga. Mas de 80 personajes, transformaciones y escenarios destruibles.' AS descripcion,
           'naruto' AS clave,
           '/img/naruto.jpg' AS imagen,
           'Lucha' AS genero,
           'PC, PS4, Xbox One, Switch' AS plataforma,
           39.99 AS precio
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'naruto');

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'Street Fighter', 'Capcom anade el sistema Drive para parar golpes y atacar mas fuerte, el Modo Mundo Abierto y el Battle Hub en linea.',
           'street-fighter', '/img/street-fighter.jpg', 'Lucha', 'PC, PS4, PS5, Xbox Series X/S', 59.99
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'street-fighter');

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'Mortal Kombat', 'Las versiones pasadas y presentes de los luchadores se enfrentan a Kronika, la titan del tiempo. Estrena los Fatal Blows.',
           'mortal-kombat', '/img/mortal-kombat.jpg', 'Lucha', 'PC, PS4, PS5, Xbox One, Series X/S, Switch', 49.99
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'mortal-kombat');

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'One Piece', 'Los Sombrero de Paja arrasan oleadas enteras de enemigos. Arcos de Dressrosa, Whole Cake y Wano con 40 personajes.',
           'one-piece', '/img/one-piece.jpg', 'Accion', 'PC, PS4, Xbox One, Switch', 44.99
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'one-piece');

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'Tekken', 'El final de la saga Mishima enfrenta a Heihachi y Kazuya. Sistema Rage Art y mas de 50 luchadores.',
           'tekken', '/img/tekken.jpg', 'Lucha', 'PC, PS4, Xbox One', 39.99
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'tekken');

INSERT INTO videojuegos (nombre, descripcion, clave, imagen, genero, plataforma, precio)
SELECT * FROM (
    SELECT 'Dragon Ball', 'Combates 2D de tres contra tres dibujados a mano, tan fluidos como el anime. Modo Dramatic incluido.',
           'dragon-ball', '/img/dragon-ball.jpg', 'Lucha', 'PC, PS4, Xbox One, Switch', 54.99
) AS nuevo
WHERE NOT EXISTS (SELECT 1 FROM videojuegos WHERE clave = 'dragon-ball');
