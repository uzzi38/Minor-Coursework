package usmankenichiro.looselycoupled;
import java.util.ArrayList;

public class Policeman {
	private String name;
	private ArrayList<EvidenceBox> evidenceBoxes; //A store of all evidence boxes the policeman holds
	public Policeman (String n) {
		name = n;
		evidenceBoxes = new ArrayList<EvidenceBox>();
	} //Policeman constructor
	@Override
	public String toString() {
		return name;
	} //Personalised toString which prints out the name of the policeman
	public void addEvidenceBox(EvidenceBox evidenceBox){
		evidenceBoxes.add(evidenceBox);
	} //Adds an evidence box to the Policeman's list
	public ArrayList<Evidence> possessedEvidences(int caseNumber, String type){
		ArrayList<Evidence> result = new ArrayList<>();					
		for(EvidenceBox e1 : evidenceBoxes){							//Loops through the evidenceBoxes in the list above
			if(e1.getCaseNumber()== caseNumber){						//Checks if the evidence box is the correct one (using the caseNumber) 
				ArrayList<Evidence> extract = e1.getEvidenceList();		//Stores the reference to the array list of evidence inside the box
				for(Evidence e2 : extract){								//Loops through the arrayList of evidence 
					if(e2.getType().equals(type)){						//If the type of evidence is the one we need, adds it to the list "result"
						result.add(e2);
					}	
				}	
			}
		}		
		return result; //Returns the list of evidence of the correct type
	}


}



