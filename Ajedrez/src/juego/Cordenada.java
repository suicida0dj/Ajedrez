package juego;

public class Cordenada {
    private char letra;
    private int num;

    public Cordenada(char letra, int num){
        this.letra= String.valueOf(letra).toUpperCase().charAt(0);
        this.num=num;
    }

    public char getLetra() {
        return letra;
    }

    public int getNum() {
        return num;
    }

    public Cordenada up(){
        return new Cordenada(letra,num-1);
    }
    public Cordenada down(){
        return new Cordenada(letra,num+1);
    }
    public Cordenada left(){
        return new Cordenada((char)(letra-1),num);
    }
    public Cordenada right(){
        return new Cordenada((char)(letra+1),num);
    }
    public Cordenada diagonalUpLeft(){
        return up().left();
    }
    public Cordenada diagonalUpRight(){
        return up().right();
    }
    public Cordenada diagonalDownLeft(){
        return down().left();
    }
    public Cordenada diagonalDownRight(){
        return down().right();
    }
    public String toString(){
        return "("+letra+","+num+")";
    }

}
