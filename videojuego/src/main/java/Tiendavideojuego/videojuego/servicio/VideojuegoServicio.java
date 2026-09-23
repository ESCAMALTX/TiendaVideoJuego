package Tiendavideojuego.videojuego.servicio;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Tiendavideojuego.videojuego.modelo.Videojuego;
import Tiendavideojuego.videojuego.repositorio.VideojuegoRepositorio;

@Service
public class VideojuegoServicio {

    private final VideojuegoRepositorio repositorio;

    public VideojuegoServicio(VideojuegoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    /**
     * Lista los videojuegos. Si viene texto, filtra en MySQL;
     * si va vacio, devuelve todos.
     */
    @Transactional(readOnly = true)
    public List<Videojuego> listar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return repositorio.findAllByOrderByNombreAsc();
        }
        return repositorio.buscar(texto.trim());
    }
}
