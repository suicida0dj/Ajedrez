package juego;

import com.diogonunes.jcolor.Attribute;

public enum PiezasColor {
    BLANCO(Attribute.TEXT_COLOR(255,255,255)),
    NEGRO(Attribute.TEXT_COLOR(0,0,0));
    private Attribute color;

    PiezasColor(Attribute color){
        this.color = color;
    }

    public Attribute getColor() {
        return color;
    }
}
