import processing.core.PApplet;
import processing.core.PImage;

public class Logica {
	PApplet app;
	int pantalla;
	PImage pUno, pDos, pTres, pCuatro, pCinco, pSeis, pSiete, pOcho, pNueve, pDiez;
	
	public Logica(PApplet app){
		this.app = app;
		pantalla = 1;
		pUno = app.loadImage("../data/1.jpg");
		pDos = app.loadImage("../data/2.jpg");
		pTres = app.loadImage("../data/3.jpg");
		pCuatro = app.loadImage("../data/4.jpg");
		pCinco = app.loadImage("../data/5.jpg");
		pSeis = app.loadImage("../data/6.jpg");
		pSiete = app.loadImage("../data/7.jpg");
		pOcho = app.loadImage("../data/8.jpg");
		pNueve = app.loadImage("../data/9.jpg");
		pDiez = app.loadImage("../data/10.jpg");
	}
	
	public void pintar(PApplet app) {
		switch (pantalla) {
		case 1:
			app.image(pUno, 0, 0, app.width, app.height);
			break;
		case 2:
			app.image(pDos, 0, 0, app.width, app.height);
			break;
		case 3:
			app.image(pTres, 0, 0, app.width, app.height);
			break;
		case 4:
			app.image(pCuatro, 0, 0, app.width, app.height);
			break;
		case 5:
			app.image(pCinco, 0, 0, app.width, app.height);
			break;
		case 6:
			app.image(pSeis, 0, 0, app.width, app.height);
			break;
		case 7:
			app.image(pSiete, 0, 0, app.width, app.height);
			break;
		case 8:
			app.image(pOcho, 0, 0, app.width, app.height);
			break;
		case 9:
			app.image(pNueve, 0, 0, app.width, app.height);
			break;
		case 10:
			app.image(pDiez, 0, 0, app.width, app.height);
			break;
		}
	}
	
	public void mousePressed(PApplet app) {
		switch (pantalla) {
			case 1:
				if (app.mouseX >= 410 && app.mouseX <= 790 && app.mouseY >= 294 && app.mouseY <= 349) {
					pantalla = 2;
				}
				if (app.mouseX >= 353 && app.mouseX <= 834 && app.mouseY >= 556 && app.mouseY <= 624) {
					pantalla = 3;
				}
				break;
			case 2:
				if (app.mouseX >= 835 && app.mouseX <= 1141 && app.mouseY >= 586 && app.mouseY <= 635) {
					pantalla = 3;
				}
				break;
			case 3:
				// Presiona SI
				if (app.mouseX >= 631 && app.mouseX <= 729 && app.mouseY >= 541 && app.mouseY <= 635) {
					pantalla = 4;
				}
				// Presiona NO
				if (app.mouseX >= 819 && app.mouseX <= 917 && app.mouseY >= 539 && app.mouseY <= 638) {
					pantalla = 5;
				}
				break;
			case 4:
				// Presiona Acaros
				if (app.mouseX >= 130 && app.mouseX <= 280 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				// Presiona Pelo Animal
				if (app.mouseX >= 297 && app.mouseX <= 445 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				// Presiona Picaduras
				if (app.mouseX >= 459 && app.mouseX <= 609 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				// Presiona Moho
				if (app.mouseX >= 622 && app.mouseX <= 774 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				// Presiona Alimentos
				if (app.mouseX >= 790 && app.mouseX <= 941 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				// Presiona Fragancias
				if (app.mouseX >= 960 && app.mouseX <= 1113 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 5;
				}
				break;
			case 5:
				// Presiona SI
				if (app.mouseX >= 631 && app.mouseX <= 729 && app.mouseY >= 541 && app.mouseY <= 635) {
					pantalla = 6;
				}
				// Presiona NO
				if (app.mouseX >= 819 && app.mouseX <= 917 && app.mouseY >= 539 && app.mouseY <= 638) {
					pantalla = 7;
				}
				break;
			case 6:
				// Presiona Colesterol
				if (app.mouseX >= 130 && app.mouseX <= 280 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				// Presiona Triglic�ridos
				if (app.mouseX >= 297 && app.mouseX <= 445 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				// Presiona Hipertension
				if (app.mouseX >= 459 && app.mouseX <= 609 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				// Presiona Diabetes tipo 1
				if (app.mouseX >= 622 && app.mouseX <= 774 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				// Presiona Diabetes tipo 2
				if (app.mouseX >= 790 && app.mouseX <= 941 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				// Presiona Cancer
				if (app.mouseX >= 960 && app.mouseX <= 1113 && app.mouseY >= 516 && app.mouseY <= 668) {
					pantalla = 7;
				}
				break;
			case 7:
				// Presiona Control
				if (app.mouseX >= 273 && app.mouseX <= 521 && app.mouseY >= 550 && app.mouseY <= 630) {
					pantalla = 7;
				}
				// Presiona Dolor Fuerte
				if (app.mouseX >= 730 && app.mouseX <= 1006 && app.mouseY >= 550 && app.mouseY <= 630) {
					pantalla = 8;
				}
				break;
			case 8:
				// Presiona esta semana
				if (app.mouseX >= 203 && app.mouseX <= 386 && app.mouseY >= 549 && app.mouseY <= 625) {
					pantalla = 9;
				}
				// Presiona Hace un mes
				if (app.mouseX >= 554 && app.mouseX <= 746 && app.mouseY >= 549 && app.mouseY <= 625) {
					pantalla = 9;
				}
				// Presiona Menos de un mes
				if (app.mouseX >= 918 && app.mouseX <= 1129 && app.mouseY >= 549 && app.mouseY <= 625) {
					pantalla = 9;
				}
				break;
			case 9:
				if (app.mouseX >= 695 && app.mouseX <= 845 && app.mouseY >= 223 && app.mouseY <= 596) {
					 
				}
				break;
			case 10:
				
				break;
		}
	}
}
