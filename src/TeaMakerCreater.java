
public class TeaMakerCreater {
public static void main(String[] args) {
	
	TeaBag tea = new TeaBag("Passion Fruit");
	Kettle oof = new Kettle();
	Cup cup = new Cup();
	
	
	oof.boil();
	
 cup.makeTea(tea,oof.getWater());
	
	
	
	
	
	
	
	
	
	
	
}
}
