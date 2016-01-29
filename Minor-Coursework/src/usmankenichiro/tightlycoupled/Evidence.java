package usmankenichiro.tightlycoupled;


public class Evidence {
	
	private final String type;
	public Evidence(String type){
		this.type = type;
	}							//Evidence Constructor
	@Override
	public String toString(){
		return type;
	}							//Personalised toString which returns the type of evidence
	public String getType() {
		return type;
	}							
	
}
