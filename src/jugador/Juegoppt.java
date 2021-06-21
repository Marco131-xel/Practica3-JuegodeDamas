package src.jugador;
 public class Juegoppt {
    private int e;
    private int g2 = 0;
    private int g1 = 0;
 
    private String [] names = {"Piedra", "Papel", "Tijera"};
 
    public void play(int j1, int j2) {
        System.out.println("");
        System.out.println("Jugador 1: " + names[j1 -1] + "||  Jugador 2: " + names[j2 - 1]);
 
        if (j1 == j2) {
            e++;
            System.out.println("Empate");
 
        } else if ((j1 == 1 && j2 == 3)
                       || (j1 == 3 && j2 == 2)
                       || (j1 == 2 && j2 == 1)) {
            g1++;
            System.out.println("");
            System.out.println("**Gana el jugador 1**");
 
        } else {
            g2++;
            System.out.println("");
            System.out.println("**Gana el jugador 2**");
 
        }
    }
 
    public boolean gameOver() {
        return (g1 >= 1 || g2 >= 1);
    }
 
    public int numberOfEmpates() {
        return e;
    }
 
    public String winner() {
        String winner = "Jugador 1";
        if(g2>=1) {
            winner = "Jugador 2";
        }
        return winner;
    }
 
}