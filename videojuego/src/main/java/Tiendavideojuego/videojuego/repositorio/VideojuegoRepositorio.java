package Tiendavideojuego.videojuego.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Tiendavideojuego.videojuego.modelo.Videojuego;

public interface VideojuegoRepositorio extends JpaRepository<Videojuego, Long> {

    /**
     * Busqueda del buscador: filtra en MySQL por nombre o genero.
     * Genera algo como:
     *   SELECT * FROM videojuegos WHERE LOWER(nombre) LIKE '%texto%' ...
     * El buscador llama a esto con cada letra que se escribe.
     */
    @Query("""
            SELECT v FROM Videojuego v
            WHERE LOWER(v.nombre) LIKE LOWER(CONCAT('%', :texto, '%'))
               OR LOWER(v.genero) LIKE LOWER(CONCAT('%', :texto, '%'))
            ORDER BY v.nombre ASC
            """)
    List<Videojuego> buscar(@Param("texto") String texto);

    /** Todos los videojuegos ordenados por nombre. */
    List<Videojuego> findAllByOrderByNombreAsc();
}
