package juego.Piezas;

import juego.Celda;
import juego.PiezasTipo;

public class CaballoNegro extends Caballo{

    public CaballoNegro(Celda celda) {
        super(celda, PiezasTipo.Negra_Caballo);
        ponerPieza();
    }
}
