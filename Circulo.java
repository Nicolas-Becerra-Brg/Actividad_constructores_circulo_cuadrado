package actividad_cuadro_circulo;

public class Circulo {

	public double radio;
	public  double a;
	public double circ;
	public double x;
	public double cambio_radio;
	
	//ID == 175513, lado = ID, diag = (math.sqrt(math.pow(175513) + math.pow(175513))), peri = (lado*4), a = lado*lado;
	
	public void cambio_radio(double x) {
		radio = x;
	}
	
		public Circulo() {
			
			if(x==0) {
				this.radio = 175513;
			}	else { 
				this.radio = x;
						}
			
			this.radio = radio;
			this.a = a;
			this.circ = circ;
			this.cambio_radio = cambio_radio; 
			this.a = Math.pow(3.1416*radio, 2);
			this.circ = 2*3.14146*radio;
			
		
	}

	
}
