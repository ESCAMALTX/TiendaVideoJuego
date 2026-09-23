package Tiendavideojuego.videojuego.config;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Tiendavideojuego.videojuego.modelo.Videojuego;
import Tiendavideojuego.videojuego.repositorio.VideojuegoRepositorio;

/**
 * Rellena la tabla "videojuegos" la primera vez que arranca la aplicacion.
 * Si la tabla ya tiene datos, no hace nada (no se duplican).
 */
@Component
public class DatosIniciales implements CommandLineRunner {

    private final VideojuegoRepositorio repositorio;

    public DatosIniciales(VideojuegoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void run(String... args) {
        if (repositorio.count() > 0) {
            return;
        }

        repositorio.saveAll(List.of(
                new Videojuego("Naruto",
                        "Lucha 3D de tres contra tres que adapta el final del manga. Mas de 80 personajes, transformaciones y escenarios destruibles.",
                        "naruto", "/img/naruto.jpg", "Lucha", "PC, PS4, Xbox One, Switch",
                        new BigDecimal("39.99"), 14),

                new Videojuego("Street Fighter",
                        "Capcom anade el sistema Drive para parar golpes y atacar mas fuerte, el Modo Mundo Abierto y el Battle Hub en linea.",
                        "street-fighter", "/img/street-fighter.jpg", "Lucha", "PC, PS4, PS5, Xbox Series X/S",
                        new BigDecimal("59.99"), 9),

                new Videojuego("Mortal Kombat",
                        "Las versiones pasadas y presentes de los luchadores se enfrentan a Kronika, la titan del tiempo. Estrena los Fatal Blows.",
                        "mortal-kombat", "/img/mortal-kombat.jpg", "Lucha", "PC, PS4, PS5, Xbox One, Series X/S, Switch",
                        new BigDecimal("49.99"), 11),

                new Videojuego("One Piece",
                        "Los Sombrero de Paja arrasan oleadas enteras de enemigos. Arcos de Dressrosa, Whole Cake y Wano con 40 personajes.",
                        "one-piece", "/img/one-piece.jpg", "Accion", "PC, PS4, Xbox One, Switch",
                        new BigDecimal("44.99"), 16),

                new Videojuego("Tekken",
                        "El final de la saga Mishima enfrenta a Heihachi y Kazuya. Sistema Rage Art y mas de 50 luchadores.",
                        "tekken", "/img/tekken.jpg", "Lucha", "PC, PS4, Xbox One",
                        new BigDecimal("39.99"), 13),

                new Videojuego("Dragon Ball",
                        "Combates 2D de tres contra tres dibujados a mano, tan fluidos como el anime. Modo Dramatic incluido.",
                        "dragon-ball", "/img/dragon-ball.jpg", "Lucha", "PC, PS4, Xbox One, Switch",
                        new BigDecimal("54.99"), 7)));
    }
}
