package Tiendavideojuego.videojuego.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Un videojuego de la tienda.
 * Cada fila de la tabla "videojuegos" se muestra como una card.
 */
@Entity
@Table(name = "videojuegos")
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Nombre corto que sale en la card. */
    @Column(nullable = false, length = 120)
    private String nombre;

    /** Texto que sale en el <p class="card-text">. */
    @Column(nullable = false, length = 300)
    private String descripcion;

    /** Clave para buscar la ficha: /detalle?juego=naruto */
    @Column(nullable = false, length = 60)
    private String clave;

    @Column(nullable = false, length = 500)
    private String imagen;

    @Column(length = 60)
    private String genero;

    @Column(length = 60)
    private String plataforma;

    @Column(precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false)
    private Integer stock = 0;

    public Videojuego() {
    }

    public Videojuego(String nombre, String descripcion, String clave, String imagen,
            String genero, String plataforma, BigDecimal precio, Integer stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clave = clave;
        this.imagen = imagen;
        this.genero = genero;
        this.plataforma = plataforma;
        this.precio = precio;
        this.stock = stock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
