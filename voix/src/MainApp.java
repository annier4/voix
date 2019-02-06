
import processing.core.PApplet;
import processing.video.*;

public class MainApp extends PApplet {
	
	private Logica log;
	static PApplet app;
	
	public static void main(String[] args){
		PApplet.main("MainApp");
	}
	
	@Override
	public void settings(){
		size(1200,700);
		//fullScreen();
	}
	
	@Override
	public void setup(){
		app = this;
		log = new Logica(app);
	}
	
	public void draw() {
		background(255);
		log.pintar(app);
	}
	
	public void mousePressed() {
		System.out.println(mouseX + " " + mouseY);
		log.mousePressed(app);
	}
}


