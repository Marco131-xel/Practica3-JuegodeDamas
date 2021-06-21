package src.base;
import java.util.*;
import src.tablero.*;
import src.jugador.*;

public class Principal{
	public static void main(String[] args) {
		Principal p = new Principal();
	}
	Scanner entrada = new Scanner(System.in);

	private Controljugador play = new Controljugador();
	private Tablero t = new Tablero(8,8,false);
	private Mainppt m = new Mainppt();

	public Principal(){
		menu();
	}

	public  void menu(){
            int opcion;
        do {
            
             System.out.println("\n\t\t******* BIENVENIDO A JUEGO DE DAMAS ********");
             System.out.println ("Ingrese una Opcion");
             System.out.println ("1). Ingresar Jugadores");
             System.out.println ("2). Mostrar Jugadores");
             System.out.println ("3). Jugar");
             System.out.println ("4). Reportes del Juego");
             System.out.println ("5). Salir");

             System.out.println("\nIngrese la opcion que desee: ");
             opcion = entrada.nextInt();
             
                switch ( opcion){

                    case 1 :
                        play.agregarJugador();
                        break;
                    
                    case 2 :
                        play.mostrarjugadores();
                        break;

                    case 3 :
                        play.elegirJugador();
                        m.ppt();
                        System.out.print("\n\n");
                        t.pintarTablero();
                        break;
                          
                    case 4 :
                        //play.mostrarjugadores();
                        System.out.println("   0     1     2     3     4     5     6     7     ");
                    	t.pintarTablero();
		                //System.out.print(t.moverFicha(2,2, 3, 3));
                        //System.out.print("\n\n");
		                //t.pintarTablero();
		                //System.out.print(t.moverFicha(5, 5, 1, 1));
		                //t.pintarTablero();
                        break;
                     
                      
                    case 5 :

                        break;
          
                }
             
          }while( opcion !=5 );
   
   }

}