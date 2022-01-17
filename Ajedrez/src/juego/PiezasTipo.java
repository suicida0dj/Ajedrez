package juego;

import com.diogonunes.jcolor.Attribute;

public enum PiezasTipo {
    Negra_Alfil("♝",PiezasColor.NEGRO),
    Negra_Peon("♟",PiezasColor.NEGRO),
    Negra_Rey("♚",PiezasColor.NEGRO),
    Negra_Reina("♛",PiezasColor.NEGRO),
    Negra_Torre("♜",PiezasColor.NEGRO),
    Negra_Caballo("♞",PiezasColor.NEGRO),
    Blanco_Alfil("♝",PiezasColor.BLANCO),
    Blanco_Peon("♟",PiezasColor.BLANCO),
    Blanco_Rey("♚",PiezasColor.BLANCO),
    Blanco_Reina("♛",PiezasColor.BLANCO),
    Blanco_Torre("♜",PiezasColor.BLANCO),
    Blanco_Caballo("♞",PiezasColor.BLANCO);

    private String tipo;
    private PiezasColor color;

    PiezasTipo(String tipo, PiezasColor color){
        this.tipo=tipo;
        this.color=color;
    }

    public PiezasColor getColor() {
        return color;
    }
    public Attribute getPiezaColor(){
        return color.getColor();
    }

    public String getTipo() {
        return tipo;
    }
}
