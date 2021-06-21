package src.jugador;

public class Jugadores{
    private int id;
	private int numero;
	private String nombre;
	private String nickname;

	public Jugadores(int id,int numero, String nombre, String nickname){
        this.id = id;
		this.numero = numero;
		this.nombre = nombre;
		this.nickname = nickname;
	}

	//get y set
    public int getId(){
        return id;
    }
	public int getNumero(){
        return numero;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNickname(String nickname){
    	this.nickname = nickname;
    }

    public String getContar(){
        String prueba = id+")" +" || Nombre: "+nombre+" || Nickname: "+nickname+" // Puntos: 0";
        return prueba;
    }

    //AGREGAR JUGADORES AL JUEGO
    public String getJugador(){
        String mirar = id+")"+" || Nombre: "+nombre+" || Nickname: "+nickname;
        return mirar;
    }
}