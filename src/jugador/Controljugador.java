package src.jugador;

import src.base.*;

public class Controljugador{
	private Jugadores[] player = new Jugadores[10];
	private int nextplayer;

	public Controljugador(){
		nextplayer = 1;

	}

	// agregar jugadores
	public void agregarJugador(int numero, String nombre, String nickname){
		if(nextplayer > 10){
			System.out.println("Limite de jugadores");
		}
		else{
			player[(nextplayer-1)] = new Jugadores(nextplayer, numero, nombre, nickname);
		}
		nextplayer++;

	}

	public void agregarJugador(){
		System.out.println("\n\n *****Ingresar 10 jugadores******");
		System.out.println("");
		int numero = IngresoDatos.getEntero("Numero de Jugador:",false);
		String nombre = IngresoDatos.getTexto("Ingrese su Nombre: ");
		String nickname = IngresoDatos.getTexto("Ingrese su Nickname: ");
		System.out.println("");
		agregarJugador(numero, nombre, nickname);
        
	}

    //Mostrar los jugadores
	public void mostrarjugadores(){
		System.out.println("\n\n ***Jugadores***");
		System.out.println("");
		for (int i = 0; i <(nextplayer-1); i++){
			System.out.println(player[i].getContar());

		}

		System.out.println("\n\n");
	}

	// Jugadores que van a jugar
	public void elegirJugador(){
		System.out.println("\n\n ***Elegi tus Jugadores***");
		System.out.println("");
		for (int i = 0; i <(nextplayer-1); i++){
			System.out.println(player[i].getJugador());

		}

		System.out.println("\n\n");
	}

	//fin 
}