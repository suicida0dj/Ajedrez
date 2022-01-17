package juego;

import com.diogonunes.jcolor.Attribute;

import java.util.concurrent.atomic.AtomicReference;

import static com.diogonunes.jcolor.Ansi.colorize;


public class Celda {

    private ColorCelda color;
    private ColorCelda originalColor;
    private Pieza pieza;
    private Cordenada cordenada;
    private Tablero tablero;

    public Celda(Tablero tablero, Cordenada cordenada){

        this.tablero=tablero;
        this.cordenada=cordenada;

        if (('A'-cordenada.getLetra()+cordenada.getNum())%2==0)
            originalColor = ColorCelda.Negro;
        else
            originalColor = ColorCelda.Blanco;

        color = originalColor;

    }

    public void resaltarCelda() {
        if(estaVacio()){
            color = (originalColor == ColorCelda.Blanco) ? ColorCelda.VerdeClaro : ColorCelda.VerdeOscuro;
        } else{
            color = (originalColor == ColorCelda.Blanco) ? ColorCelda.RojoClaro : ColorCelda.RojoOscuro;

        }
    }

    private enum ColorCelda{
        Blanco(Attribute.BACK_COLOR(180, 180, 180)),
        Negro(Attribute.BACK_COLOR(71, 64, 64)),
        VerdeClaro(Attribute.BACK_COLOR(123, 211, 123)),
        VerdeOscuro(Attribute.BACK_COLOR(169, 213, 168)),
        RojoClaro(Attribute.BACK_COLOR(180, 39, 39)),
        RojoOscuro(Attribute.BACK_COLOR(180, 39, 39));

        private Attribute color;

        ColorCelda(Attribute color){
            this.color=color;
        }

        public Attribute getColor() {
            return color;
        }
    }

    public boolean estaVacio(){
        return pieza==null;
    }

    public String toString(){
        Attribute[] MyFormat = new Attribute[]{color.getColor()};

        if(pieza!=null){
            return pieza.toString();
        }else
            return colorize("   ",MyFormat);
    }



    public Attribute getBackground(){
        return color.getColor();
    }

    public void setPieza(Pieza pieza) {
        this.pieza = pieza;
    }

    public ColorCelda getColor() {
        return color;
    }

    public ColorCelda getOriginalColor() {
        return originalColor;
    }

    public Pieza getPieza() {
        return pieza;
    }

    public Cordenada getCordenada() {
        return cordenada;
    }

    public Tablero getTablero() {
        return tablero;
    }



    public static void main(String[] args) {

        Attribute fgWhite = Attribute.TEXT_COLOR(255, 255, 255);
        Attribute fgBlack = Attribute.TEXT_COLOR(0, 0, 0);
    }
}