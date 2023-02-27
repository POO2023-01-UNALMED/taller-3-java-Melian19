package taller3.televisores;

public class Control {
	private TV tv;
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV television) {
		tv = television;
	}
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int number) {
		tv.setCanal(number);
	}
	
	public void enlazar(TV television) {
		tv = television;
		tv.setControl(this);
	}

}
