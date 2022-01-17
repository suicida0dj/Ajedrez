package juego.Piezas.Caballo;

import juego.*;
import juego.Piezas.Caballo.Caballo;

public class CaballoBlanco extends Caballo {


    public CaballoBlanco(Celda celda) {
        super(celda, PiezasTipo.Blanco_Caballo);
        ponerPieza();
    }

}
