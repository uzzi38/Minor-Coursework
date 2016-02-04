package usmankenichiro.looselycoupled;
import java.util.ArrayList;

public class EvidenceBox {
	private final int caseNumber;
	private final String caseName;
	
	private ArrayList<Evidence> evidenceList;					//Stores the evidence inside the box in a list
	
	public EvidenceBox(int caseNumber, String caseName){
		this.caseNumber = caseNumber;
		this.caseName = caseName;
		evidenceList = new ArrayList<>();
	}															//Evidence Constructor
	
	public int getCaseNumber() {
		return caseNumber;
	}															//Returns the case number

	public String getCaseName() {
		return caseName;
	}															//Returns the case name

	public void add(Evidence evidence){
		evidenceList.add(evidence);
	}															//Adds evidence to the list

	public ArrayList<Evidence> getEvidenceList() {
		return evidenceList;
	}															//Returns the list of evidence

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
