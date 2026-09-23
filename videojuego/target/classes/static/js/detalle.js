/* ============================================================
   FICHA DE CADA VIDEOJUEGO
   Se abre al pulsar "Ver detalles" en una pestana nueva.
   El listado manda el juego en la URL: /detalle?juego=naruto
   ============================================================ */

const CATALOGO = {
    naruto: {
        nombre: 'Naruto Shippuden: Ultimate Ninja Storm 4',
        genero: 'Lucha',
        plataforma: 'PC, PS4, Xbox One, Switch',
        anio: 2016,
        desarrollador: 'CyberConnect2',
        precio: '39.99',
        puntuacion: '8.5',
        stock: 14,
        imagen: '/img/naruto.jpg',
        descripcion: 'El cierre de la saga Ultimate Ninja Storm recrea el final del manga de Naruto con combates 3D de tres contra tres. Mas de 80 personajes jugables, transformaciones en plena pelea y escenarios destruibles. Incluye el modo historia que cubre desde la batalla contra Pain hasta el enfrentamiento final con Kaguya, ademas de un modo torneo y combates en linea.'
    },
    'street-fighter': {
        nombre: 'Street Fighter 6',
        genero: 'Lucha',
        plataforma: 'PC, PS4, PS5, Xbox Series X/S',
        anio: 2023,
        desarrollador: 'Capcom',
        precio: '59.99',
        puntuacion: '9.2',
        stock: 9,
        imagen: '/img/street-fighter.jpg',
        descripcion: 'La sexta entrega numerada de la saga de Capcom introduce el sistema Drive, que permite parar golpes, acelerar el avance y desatar ataques potenciados gastando una barra unica. Anade el Modo Mundo Abierto, donde tu propio personaje recorre las calles aprendiendo tecnicas de los maestros, y el modo Battle Hub para enfrentarte a jugadores de todo el mundo.'
    },
    'mortal-kombat': {
        nombre: 'Mortal Kombat 11',
        genero: 'Lucha',
        plataforma: 'PC, PS4, PS5, Xbox One, Series X/S, Switch',
        anio: 2019,
        desarrollador: 'NetherRealm Studios',
        precio: '49.99',
        puntuacion: '9.0',
        stock: 11,
        imagen: '/img/mortal-kombat.jpg',
        descripcion: 'El torneo definitivo enfrenta a las versiones pasadas y presentes de los luchadores del reino de la Tierra contra Kronika, la titan que controla el tiempo. Estrena los Fatal Blows, golpes devastadores que aparecen cuando estas a punto de perder, y el sistema de variaciones que cambia el moveset de cada personaje. Su modo Torre del Tiempo y la personalizacion de equipo son enormes.'
    },
    'one-piece': {
        nombre: 'One Piece: Pirate Warriors 4',
        genero: 'Accion',
        plataforma: 'PC, PS4, Xbox One, Switch',
        anio: 2020,
        desarrollador: 'Omega Force',
        precio: '44.99',
        puntuacion: '8.0',
        stock: 16,
        imagen: '/img/one-piece.jpg',
        descripcion: 'Los Sombrero de Paja arrasan oleadas enteras de enemigos en este musou basado en el anime de Eiichiro Oda. Recorre arcos como Dressrosa, Whole Cake Island y Wano con mas de 40 personajes, cada uno con su estilo de lucha y transformaciones como el Gear Fourth. Los mapas son destruibles y los ataques en equipo cambian el resultado de la batalla.'
    },
    tekken: {
        nombre: 'Tekken 7',
        genero: 'Lucha',
        plataforma: 'PC, PS4, Xbox One',
        anio: 2017,
        desarrollador: 'Bandai Namco Studios',
        precio: '39.99',
        puntuacion: '8.8',
        stock: 13,
        imagen: '/img/tekken.jpg',
        descripcion: 'El rey del puno de hierro llega al final de la saga Mishima, con Heihachi y Kazuya cara a cara en un combate definitivo. Estrena el sistema Rage Art, un ataque critico que aparece en los ultimos segundos de vida, y el modo Torneo que simula los combates de una sala recreativa. Mas de 50 luchadores, torneos online y un modo practica muy completo.'
    },
    'dragon-ball': {
        nombre: 'Dragon Ball FighterZ',
        genero: 'Lucha',
        plataforma: 'PC, PS4, Xbox One, Switch',
        anio: 2018,
        desarrollador: 'Arc System Works',
        precio: '54.99',
        puntuacion: '9.1',
        stock: 7,
        imagen: '/img/dragon-ball.jpg',
        descripcion: 'Arc System Works plasma el anime de Dragon Ball con combates 2D de tres contra tres, dibujados a mano y con una fluidez identica a la serie. Encadena asistencias, cambios de personaje en pleno combo y ataques especiales como el Kamehameha en pantalla completa. Su modo historia y el modo Dramatic recrean momentos clasicos del manga con dialogos originales.'
    }
};

/* Toma el parametro "juego" de la URL */
const parametros = new URLSearchParams(window.location.search);
const clave = (parametros.get('juego') || '').toLowerCase();

/* Si la clave no existe en el catalogo, se muestra Naruto */
const juego = CATALOGO[clave] || CATALOGO['naruto'];

/** Escribe el texto de un elemento si existe en la pagina. */
function poner(id, valor) {
    const el = document.getElementById(id);
    if (el) el.textContent = valor;
}

/* Titulo de la pestana del navegador */
document.title = `TIENDA VIDEOJUEGOS - ${juego.nombre}`;

/* Columna izquierda */
const imagen = document.getElementById('imagen');
imagen.src = juego.imagen;
imagen.alt = juego.nombre;

poner('precio', juego.precio);
poner('stock', juego.stock);

/* Columna derecha: encabezado */
poner('genero', juego.genero);
poner('nombre', juego.nombre);
poner('plataforma', juego.plataforma);
poner('anio', juego.anio);

/* Columna derecha: descripcion */
poner('descripcion', juego.descripcion);

/* Columna derecha: ficha tecnica */
poner('desarrollador', juego.desarrollador);
poner('generoTexto', juego.genero);
poner('plataformaTexto', juego.plataforma);
poner('anioTexto', juego.anio);
poner('puntuacion', juego.puntuacion);

/* Boton de compra */
document.getElementById('botonComprar').addEventListener('click', () => {
    alert(`Anadido al carrito: ${juego.nombre}\nPrecio: $${juego.precio}`);
});
