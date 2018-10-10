package extra;

public class PixelRunner {
public static void main(String[] args) {
	
	
	PixelParty dots = new PixelParty();
	dots.setColor(0, 0, 255);
	dots.drawRectangle(100, 100, 100, 100);
	dots.drawCircle(50, 50, 50);
	dots.drawTriangle(100, 0, 100, 100, 300, 100);
	dots.drawLine(500, 200, 200, 10);
	dots.setColor(255, 0, 0);
	dots.drawRectangle(300, 300, 200, 200);
	
	
	
	
	
	
	
	
	
	
	dots.saveImage();
	dots.displayImage();
	
}
}
