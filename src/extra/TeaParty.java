package extra;

public class TeaParty {
	
	public String welcome(String name, boolean isWoman, boolean isKnighted){
if(isWoman == true){
	if (isKnighted == true) {
		return "Hello Lady " + name;
	}
	
	else {
		return "Hello Ms. " + name;
	}
}
     

if(isWoman == false){
	if (isKnighted == true) {
		return "Hello Sir " + name;
	}
	
	else {
		return "Hello Mr. " + name;
	}
}
return null;
	
	
	
	
	
	
	}

	 
	 
	 
}

