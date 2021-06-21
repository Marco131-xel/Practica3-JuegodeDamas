package src.tablero;
public class Cuadros{

	private boolean color;
	private Ficha ficha;

	private char cuadron = '0';
	private char cuadroc = '0';

	public static final String FW = "\033[47;37m";
    public static final String FN = "\033[40;30m";
    public static final String RESET = "\033[0m";


	public void setFicha(Ficha f){
		this.ficha = f;
	}

	public boolean getColor(){
		return this.color;
	}

	public Ficha getFicha(){
		Ficha tmp = this.ficha;
		this.ficha = null;
		return tmp;
	}

	public boolean ocupadaPorFicha(){
		return (ficha!=null);
	}

	public Cuadros(boolean color){
		this.color = color;
		this.ficha = null;
	}

	public String pintarCuadros(int linea){
		String res = "";
		if(color){
			res = llenar(FW,linea);
		}
		else{
			res = llenar(FN,linea);
		}

		return res;
	}

	private String llenar(String color, int linea){
		String res = "";
		if(ficha!=null){
			if ((linea == 0)||(linea == 2)) {
				res=""+ color+cuadroc+cuadroc+   ficha.getCaracter()+ficha.getCaracter()+   color+cuadroc+cuadroc+RESET;	
			}
			if (linea == 1){
				res=""+ color+cuadroc+  ficha.getCaracter()+    ficha.getId()      +ficha.getCaracter()       +color+ cuadroc+RESET;
			}
		}
		else{
			res =""+ color+cuadroc+cuadroc+cuadroc+cuadroc+cuadroc+cuadroc+RESET;
		}

		return res;
	}


}