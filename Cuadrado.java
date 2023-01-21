package actividad_cuadro_circulo;

public class Cuadrado {
	
	public double lado;
	public  double diag;
	public double peri;
	public double a;
	public double x;
	//ID == 175513, lado = ID, diag = (math.sqrt(math.pow(175513) + math.pow(175513))), peri = (lado*4), a = lado*lado;
	
	public void cambio_lado(double x) {
		lado = x;
			
		}
	
	public Cuadrado() {
			
		if(x==0) {
			this.lado = 175513;
		}	else { 
			this.lado = x;
					}
			this.diag = diag;
			this.peri = peri;
			this.a = a;
			this.diag = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
			this.peri = lado*4;
			this.a = Math.pow(lado, 2);
		
	}


}		
