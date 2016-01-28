package usmankenichiro.tightlycoupled;
import java.util.ArrayList;

public class Policeman {
	private String name;
	private ArrayList<EvidenceBox> evidenceBoxes;
	public Policeman (String n) {
		name = n;
		evidenceBoxes = new ArrayList<EvidenceBox>();
	}
	@Override
	public String toString() {
		return name;
	}
	public void addEvidenceBox(EvidenceBox evidenceBox){
		evidenceBoxes.add(evidenceBox);
	}
	public ArrayList<Evidence> possessedEvidences(int caseNumber, String type){
		ArrayList<Evidence> result = new ArrayList<>();
		for(EvidenceBox e1 : evidenceBoxes){
			if(e1.getCaseNumber()== caseNumber){
				ArrayList<Evidence> extract = e1.getEvidenceList();
				for(Evidence e2 : extract){
					if(e2.getType().equals(type)){
						result.add(e2);
					}	
				}	
			}
		}		
		return result;
	}


}



