package juego.Piezas.Caballo;

import juego.Celda;
import juego.Piezas.Caballo.Caballo;
import juego.PiezasTipo;

public class CaballoNegro extends Caballo {

    public CaballoNegro(Celda celda) {
        super(celda, PiezasTipo.Negra_Caballo);
        ponerPieza();
    }
}
