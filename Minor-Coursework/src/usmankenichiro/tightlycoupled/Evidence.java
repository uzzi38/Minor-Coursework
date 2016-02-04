package usmankenichiro.tightlycoupled;


public class Evidence {
	private final String type;
	/**
	 * Constructor for evidence. Stores the type of evidence inputed.
	 * @param type of evidence.
	 */
	public Evidence(String type){
		this.type = type;
	}							//Evidence Constructor
	/**
	 * Customised toString method that returns the type of evidence.
	 * @return type of evidence
	 */
	@Override
	public String toString(){
		return type;
	}							//Personalised toString which returns the type of evidence
	/**
	 * Returns the type of Evidence for use in other classes.
	 * @return Type of evidence
	 */
	public String getType() {
		return type;
	}							
	
}
