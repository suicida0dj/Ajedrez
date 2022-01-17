package juego.Tools;

import juego.Cordenada;

public class CordenadasArray {
    public static Cordenada[] add(Cordenada[] cordenada,Cordenada cordenadas){
        Cordenada[] aux = new Cordenada[cordenada.length+1];
        for(int i=0;i< cordenada.length;i++){
            aux[i] = cordenada[i];
        }
        aux[aux.length-1]=cordenadas;
        return aux;
    }
}
