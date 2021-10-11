public class Factory {	
	public Animal get(String type){
		if(type == null){
			return null;
		}
		else if(type.equalsIgnoreCase("Kangaroo")){
			return new Kangaroo();        
		}
		else if(type.equalsIgnoreCase("Cheetah")){
			return new Cheetah();     
		}
		else if(type.equalsIgnoreCase("Lion")){
			return new Lion();
		}
		else{
			return null;
		}
	}
}