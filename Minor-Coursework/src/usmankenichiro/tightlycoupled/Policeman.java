package usmankenichiro.tightlycoupled;
import java.util.ArrayList;

public class Policeman {
	private String name;
	private ArrayList<EvidenceBox> evidenceBox;
	public Policeman (String n) {name = n;}
	@Override
	public String toString() {
		return name;
	}
	
	public ArrayList<Evidence> possessedEvidences(int caseNumber, String type){
		ArrayList<Evidence> result = new ArrayList<>();
		for (EvidenceBox e : evidenceBox){
			
			
		}
		
	}
	

}

