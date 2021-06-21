package src.jugador;
import java.util.*;
public class Mainppt {

    public void ppt() {
        Juegoppt operation = new Juegoppt();
        Scanner read = new Scanner(System.in);
 
        do {
            System.out.println("");
            System.out.println("*****Juego de Piedra, Papel y Tijera*****\n");
            System.out.print("1)Piedra; 2)Papel; 3)Tijera;\n");
            System.out.print("");
            System.out.println("Jugador 1:\nIngresa tu jugada:");
            int j1 = read.nextInt();
 
            System.out.println("\n");
            System.out.print("1)Piedra; 2)Papel; 3)Tijera;\n");
            System.out.print("");
            System.out.println("Jugador 2:\nIngresa tu jugada:");
            int j2 = read.nextInt();
 
            operation.play(j1, j2);
 
        } while (!operation.gameOver());

        //System.out.println("\n\nEl vencedor es: " + operation.winner() + " con " + operation.numberOfEmpates() + " empates");
        System.out.println("\n\nEl ganador juega en rojas: " + operation.winner());
    }
}