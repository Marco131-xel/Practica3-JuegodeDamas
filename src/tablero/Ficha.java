package src.tablero;
public class Ficha{

	private boolean esNegra;

	private char cuadron = 'O';
	private char cuadroc = '0';

	public static final String RED = "\033[41;31m";
    public static final String YELLOW = "\033[43;33m";
    public static final String GREEN = "\033[42;32m";
    public static final String RESET = "\033[0m";

	private String id;

	public String getCaracter(){
		String res =(esNegra)?""+RED+cuadron+RESET:""+GREEN+cuadron+RESET;
		return res;
	}

	public Ficha(boolean esNegra, String id){
		this.esNegra = esNegra;
		this.id = id;
	}

	public String getId(){
		return id;
	}

}