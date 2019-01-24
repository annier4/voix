
import processing.core.PApplet;

public class MainApp extends PApplet {
	
	private Logica app;
	
	public static void main(String[] args){
		PApplet.main("MainApp");
	}
	
	@Override
	public void settings(){
		size(500,500);
	}
	
	@Override
	public void setup(){
		app = new Logica();
	}
}
