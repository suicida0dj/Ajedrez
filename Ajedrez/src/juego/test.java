package juego;

public class test {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Cordenada[] cordenadas = tablero.getCeldaAt(new Cordenada('D',5)).getPieza().getNextMove();
        tablero.resaltarCelda(cordenadas);
        System.out.println(tablero);
    }

}
