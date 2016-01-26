package usmankenichiro.tightlycoupled;


public class Evidence {
	
	private final String type;
	public Evidence(String type){
		this.type = type;
	}
	@Override
	public String toString(){
		return type;
	}
	public String getType() {
		return type;
	}
	
}
