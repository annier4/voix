
import processing.core.PApplet;

public class MainApp extends PApplet {
	
	private Logica log;
	static PApplet app;
	
	public static void main(String[] args){
		PApplet.main("MainApp");
	}
	
	@Override
	public void settings(){
		size(1200,700);
		fullScreen();
	}
	
	@Override
	public void setup(){
		app = this;
		log = new Logica(app);
	}
}
