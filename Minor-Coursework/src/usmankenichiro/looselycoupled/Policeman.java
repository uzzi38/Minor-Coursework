package usmankenichiro.looselycoupled;
import java.util.ArrayList;
	/**
	 * 
	 * class of an policeman for looselycouple.
	 *
	 */
public class Policeman {
	private String name;
	private ArrayList<EvidenceBox> evidenceBoxes; //A store of all evidence boxes the policeman holds
	/**
	 * Policeman constructor. Takes the name of the policeman as an input and stored it.
	 * @param n - name of the policeman.
	 */
	public Policeman (String n) {
		name = n;
		evidenceBoxes = new ArrayList<EvidenceBox>();
	} //Policeman constructor
	
	/**
	 * Returns a customised string representation of the policeman in the form of their name.
	 * @return Name of the Policeman.
	 */
	@Override
	public String toString() {
		return name;
	} //Personalised toString which prints out the name of the policeman
	/**
	 * Gives an EvidenceBox to the Policeman
	 * @param evidenceBox an evidence box.
	 */
	public void addEvidenceBox(EvidenceBox evidenceBox){
		evidenceBoxes.add(evidenceBox);
	} //Adds an evidence box to the Policeman's list
	/**
	 * Returns all of the evidence the policeman has of a certain
	 * type and for a certain case.
	 * @param caseNumber the case number which specifies an evidence box.
	 * @param type the kinds of evidences.
	 * @return Evidence pertaining to a certain type and case.
	 */
	public ArrayList<Evidence> possessedEvidences(int caseNumber, String type){			
		for(EvidenceBox e1 : evidenceBoxes){							//Loops through the evidenceBoxes in the list above
			if(e1.getCaseNumber()== caseNumber){						//Checks if the evidence box is the correct one (using the caseNumber) 
				return e1.getEvidenceByType(type);
			}
		}		
		return null; //Returns null when there is no evidence which you are looking for in the evidence.
	}
}



