/* ============================================================
   BUSCADOR EN TIEMPO REAL (con MySQL)
   Mientras escribes, consulta al servidor (?q=texto) y el servidor
   filtra en MySQL. La pagina se redibuja con las cards que vuelven.
   ============================================================ */

const buscador = document.getElementById('buscador');
const formulario = document.getElementById('formBuscador');

let temporizador = null;

/** Pide la pagina con el texto buscado. */
function buscarAhora() {
    formulario.submit();
}

// Cada letra dispara la busqueda, con una pequena espera para no
// saturar el servidor mientras se teclea rapido.
buscador.addEventListener('input', () => {
    clearTimeout(temporizador);
    temporizador = setTimeout(buscarAhora, 350);
});

// Enter busca de inmediato, sin esperar
buscador.addEventListener('keydown', (evento) => {
    if (evento.key === 'Enter') {
        clearTimeout(temporizador);
        formulario.submit();
    }
});
