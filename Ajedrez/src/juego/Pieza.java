package juego;

import com.diogonunes.jcolor.Attribute;
import static com.diogonunes.jcolor.Ansi.colorize;

public abstract class Pieza {
    private Celda celda;
    private PiezasTipo piezasTipo;

    public Pieza(Celda celda,PiezasTipo piezasTipo){
        this.celda=celda;
        this.piezasTipo=piezasTipo;
    }

    public abstract Cordenada[] getNextMove();

    public void ponerPieza() {
        celda.setPieza(this);
    }

    public Celda getCelda() {
        return celda;
    }

    public PiezasColor getColor(){
        return piezasTipo.getColor();
    }

    public PiezasTipo getPiezasTipo() {
        return piezasTipo;
    }

    @Override
    public String toString(){
        Attribute background = celda.getBackground();
        Attribute textColor = piezasTipo.getPiezaColor();
        Attribute[]  MyFormat = new Attribute[]{background,textColor};
        return colorize(" "+ piezasTipo.getTipo() + " ",MyFormat);
    }
}
