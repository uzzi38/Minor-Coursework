package usmankenichiro.looselycoupled;
import java.util.ArrayList;

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
	 * @param evidenceBox
	 */
	public void addEvidenceBox(EvidenceBox evidenceBox){
		evidenceBoxes.add(evidenceBox);
	} //Adds an evidence box to the Policeman's list
	/**
	 * Returns all of the evidence the policeman has of a certain
	 * type and for a certain case.
	 * @param caseNumber
	 * @param type
	 * @return Evidence pertaining to a certain type and case.
	 */
	public ArrayList<Evidence> possessedEvidences(int caseNumber, String type){
		ArrayList<Evidence> result = new ArrayList<>();					
		for(EvidenceBox e1 : evidenceBoxes){							//Loops through the evidenceBoxes in the list above
			if(e1.getCaseNumber()== caseNumber){						//Checks if the evidence box is the correct one (using the caseNumber) 
				e1.getEvidenceByType(type);
			}
		}		
		return result; //Returns the list of evidence of the correct type
	}
}



