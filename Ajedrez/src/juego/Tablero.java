package juego;

import juego.Piezas.Caballo.CaballoBlanco;
import juego.Piezas.Caballo.CaballoNegro;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Tablero {

    private Celda[][] celdas;

    public Tablero(){
        celdas= new Celda[8][8];
        for(int i = 0; i < celdas.length;i++)
            for(int j= 0; j< celdas[0].length;j++)
                celdas[i][j]= new Celda(this,new Cordenada((char)('A'+j),i+1));

            colocarPiezas();
        }

        public void colocarPiezas(){
        Celda celda;
            celda=getCeldaAt(new Cordenada('D',5));
            new CaballoBlanco(celda);
            celda=getCeldaAt(new Cordenada('B',6));
            new CaballoNegro(celda);

        }

        public boolean contiene(Cordenada cordenada){
            return cordenada.getLetra()>='A'&& cordenada.getLetra()<='H' && cordenada.getNum()>=1&& cordenada.getNum()<=8;
        }

        public Celda getCeldaAt(Cordenada cordenada){
            if(!contiene(cordenada))
                return null;
            return celdas[cordenada.getNum()-1][cordenada.getLetra()-'A'];
        }


        public void resaltarCelda(Cordenada[] cordenadas){
        for(Cordenada cordenada : cordenadas){
            getCeldaAt(cordenada).resaltarCelda();
        }
        }

    public String toString() {
        String salida = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                salida += celdas[i][j];

            salida += "\n";
        }
        return salida;
    }
}
