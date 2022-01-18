package juego.Piezas.Caballo;

import juego.*;
import juego.Tools.CordenadasArray;

public class Caballo extends Pieza {


    public Caballo(Celda celda, PiezasTipo piezasTipo) {
        super(celda, piezasTipo);
    }

    @Override
    public Cordenada[] getNextMove() {
        Cordenada[] cordenadas = new Cordenada[0];
        Tablero tablero = getCelda().getTablero();

        Cordenada origen = getCelda().getCordenada();

        //arriba derecha
        Cordenada cordenada = origen.up().diagonalUpRight();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //arriba izquierda
        cordenada = origen.up().diagonalUpLeft();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //abajo derecha
        cordenada = origen.down().diagonalDownRight();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //abajo derecha
        cordenada = origen.down().diagonalDownLeft();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //derecha arriba
        cordenada = origen.right().diagonalUpRight();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //derecha abajo
        cordenada = origen.right().diagonalDownRight();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //izquierda arriba
        cordenada = origen.left().diagonalUpLeft();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);

        //izquierda abajo
        cordenada = origen.left().diagonalDownLeft();
        if(puedoMovermeA(cordenada))
            cordenadas = CordenadasArray.add(cordenadas,cordenada);



        return cordenadas;
    }

    public boolean puedoMovermeA(Cordenada cordenada){
        Tablero tablero = getCelda().getTablero();

        return tablero.contiene(cordenada)&& tablero.getCeldaAt(cordenada).estaVacio() || tablero.contiene(cordenada) && !tablero.getCeldaAt(cordenada).estaVacio() && tablero.getCeldaAt(cordenada).getPieza().getColor()!=getColor();
    }
}
