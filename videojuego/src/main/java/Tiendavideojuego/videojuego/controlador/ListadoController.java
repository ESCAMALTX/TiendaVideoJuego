package Tiendavideojuego.videojuego.controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Tiendavideojuego.videojuego.modelo.Videojuego;
import Tiendavideojuego.videojuego.servicio.VideojuegoServicio;

@Controller
public class ListadoController {

    private final VideojuegoServicio servicio;

    public ListadoController(VideojuegoServicio servicio) {
        this.servicio = servicio;
    }

    /**
     * Pagina principal. Los videojuegos salen de MySQL.
     * El buscador manda el texto en la URL: /?q=nar
     */
    @GetMapping("/")
    public String listarVideojuegos(@RequestParam(name = "q", required = false) String q,
            Model modelo) {

        List<Videojuego> videojuegos = servicio.listar(q);

        modelo.addAttribute("videojuegos", videojuegos);
        modelo.addAttribute("q", q == null ? "" : q);
        modelo.addAttribute("total", videojuegos.size());

        return "listado";
    }

    /** Ficha ampliada de un videojuego. */
    @GetMapping("/detalle")
    public String verDetalle() {
        return "detalle";
    }
}
