
public class Minion {
private String name = ""; 
private int eyes = 0; 
private String color = ""; 
private String master = "";
	
	
	
	public String getName() {
		System.out.println(name);
		return this.name;
	}
	
	public int getEyes() {
		System.out.println("I have " + eyes + " eyes");
		return this.eyes;
	}
	
	public String getColor() {
		System.out.println("I'm " + color);
		return this.color;
	}
	
	public String getMaster() {
		System.out.println(master + " is my master");
		return this.master;
	}
	
	public void setMaster(String master) {
		 this.master = master;
		System.out.println(name + "'s new master is " + master);
	}
	
	
	
	
	
	
	
	
	
	
	public Minion (String name, int eyes, String color, String master) {
	this.name = name;
	this.eyes = eyes;
	this.color = color;
	this.master = master;
	}
	
	
	
}