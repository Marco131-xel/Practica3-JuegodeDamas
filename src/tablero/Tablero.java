package src.tablero;
public class Tablero{

	private Cuadros [][] tablero;
    private final int x,y;

    private boolean jugarBlancas;

    public Tablero(int x, int y, boolean jugarBlancas){
    	this.jugarBlancas = jugarBlancas;
    	this.x = x;
    	this.y = y;
    	tablero = new Cuadros[x][y];
    	iniciarTablero();
    	iniciarfichas(0, 3, true, "VV");
    	iniciarfichas(5, 8, false, "RR");

    }

    private void iniciarfichas(int ini, int cant, boolean esBlanca, String id){
    	for (int i = ini; i< cant; i++) {
    		for (int j =0; j<x; j++) {
    			if (tablero[j][i].getColor()== !jugarBlancas) {
    				tablero[j][i].setFicha(new Ficha(!esBlanca,id ));
    			}
    			
    		}
    		
    	}
    }

    public boolean moverFicha(int posXIni, int posYIni, int posXFin, int posYFin){
    	boolean resultado = false;
    	if (tablero[posXFin][posYFin].ocupadaPorFicha()) {
    		if (!tablero[posXFin][posYFin].ocupadaPorFicha()){
    		    tablero[posXFin][posYFin].setFicha(tablero[posXIni][posYIni].getFicha());	
    		    resultado = true;	
    		}
    		
    	}
    	return resultado;
    }

    private void iniciarTablero(){

        boolean esColorInicio = false;
        boolean esColorIteracion = false;
        for ( int i = 0; i < y; i++) {
            esColorIteracion = !esColorInicio;
            for (int j = 0; j < x; j++) {
                tablero[j][i] = new Cuadros(esColorIteracion);
                esColorIteracion = !esColorIteracion;
                
            }
            esColorInicio = !esColorInicio;
        }
    }

    public void pintarTablero(){

        for ( int i = 0; i < y; i++) {            
            
            for (int k = 0; k < 3; k++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(tablero[j][i].pintarCuadros(k));
                }
                System.out.println("");
            }

            
        }
        System.out.println("\n\n");
    }

}