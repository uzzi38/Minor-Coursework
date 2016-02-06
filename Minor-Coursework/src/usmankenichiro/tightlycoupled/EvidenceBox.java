package usmankenichiro.tightlycoupled;
import java.util.ArrayList;
	/**
	 * 
	 * class of an evidence box for tightlycoupled.
	 *
	 */

public class EvidenceBox {
	private final int caseNumber;
	private final String caseName;
	
	private ArrayList<Evidence> evidenceList;					//Stores the evidence inside the box in a list
	/**
	 * Constructor for the EvidenceBox. Takes the case number and name and stores them locally.
	 * @param caseNumber the case number which specifies an evidence box.
	 * @param caseName the case name is the name of an evidence box.
	 */
	public EvidenceBox(int caseNumber, String caseName){
		this.caseNumber = caseNumber;
		this.caseName = caseName;
		evidenceList = new ArrayList<>();
	}															//Evidence Constructor
	/**
	 * Returns the case number for use outside this class.
	 * @return Case number
	 */
	public int getCaseNumber() {
		return caseNumber;
	}															//Returns the case number
	/**
	 * Returns the case name for use outside this class.
	 * @return Case name
	 */
	public String getCaseName() {
		return caseName;
	}															//Returns the case name
	/**
	 * Adds a piece of evidence to the locally stored list in this EvidenceBox
	 * @param evidence an evidence. 
	 */
	public void add(Evidence evidence){
		evidenceList.add(evidence);
	}															//Adds evidence to the list
	/**
	 * Returns the list of Evidence for use in other classes
	 * @return evidenceList inside this box
	 */
	public ArrayList<Evidence> getEvidenceList() {
		return evidenceList;
	}															//Returns the list of evidence
	/**
	 * Returns a customised string representation of this object.
	 * Loops through the list of evidence above to create a new list 
	 * containing all of the different types of evidence.
	 * Then prints out the number of each different type of evidence in the box.
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<String> typeList = new ArrayList<>();	//Creates a new list used later
		for(Evidence e : evidenceList){ 				//Loops through the list of evidence
			if(!typeList.contains(e.getType())){		//Checks to see if the new list doesn't contain something in the list of evidence
				typeList.add(e.getType());				//Adds that type to the new list
			}											//Overall, this part of the method creates a record of all the different types of evidence in the list
		}
		for(String type : typeList){					//Loops through the new list
			int size = 0;								
			for(Evidence evidence : evidenceList){		//Then loops through the list of evidence
				if(evidence.getType().equals(type)){ 	//Checks to see if the list of evidence holds a specific type of evidence 
					size++;								//Each time it finds a corresponding evidence, it increments a counter
				}				
			}

			builder.append(size +"x " + type + System.lineSeparator());	//Stores a long string of all of the different types and the number of times they occur in the list		
		}
		return builder.toString();						//Returns the string
	}
}
