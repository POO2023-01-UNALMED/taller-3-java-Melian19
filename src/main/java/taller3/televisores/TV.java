package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV = 0;
	
	public TV(Marca brand, boolean status) {
		marca = brand;
		estado = status;
		numTV++;
	}
	
	//get & set methods
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca newBrand) {
		marca = newBrand;
	}
	
	public Control getControl() {
		return control;
	}
	
	public void setControl(Control newControl) {
		control = newControl;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int newPrice) {
		precio = newPrice;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setVolumen(int newVolumen) {
		if (newVolumen >= 0 && newVolumen <= 7 && estado==true){
			volumen = newVolumen;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setCanal(int channel) {
		if (channel >= 1 && channel <= 120 && estado==true) {
			canal = channel;
		}
	}
	
 	public boolean getEstado() {
		return estado;
	}
	
	public void setEstado(boolean newStatus) {
		estado = newStatus;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int cantidad) {
		numTV = cantidad;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public void canalUp() {
		if (estado==true && canal<120) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (estado==true && canal>1) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if (estado==true && volumen<7) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (estado==true && volumen>0) {
			volumen --;
		}
	}
	

}
