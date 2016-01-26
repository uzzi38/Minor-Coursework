package usmankenichiro.tightlycoupled;
import java.util.ArrayList;

public class EvidenceBox {
	private final int caseNumber;
	private final String caseName;
	
	private ArrayList<Evidence> evidenceList;
	
	public EvidenceBox(int caseNumber, String caseName){
		this.caseNumber = caseNumber;
		this.caseName = caseName;
		evidenceList = new ArrayList<>();
	}
	
	public int getCaseNumber() {
		return caseNumber;
	}

	public String getCaseName() {
		return caseName;
	}

	public void add(Evidence evidence){
		evidenceList.add(evidence);
	}

	public ArrayList<Evidence> getEvidenceList() {
		return evidenceList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<String> typeList = new ArrayList<>();
		for(Evidence we : evidenceList){
			if(!typeList.contains(we.getType())){
				typeList.add(we.getType());
			}
		}
		for(String type : typeList){
			int size = 0;
			for(Evidence evidence : evidenceList){
				if(evidence.getType().equals(type)){
					size++;
				}				
			}

			builder.append(size +"x " + type + System.lineSeparator());			
		}
		return builder.toString();
	}	
}
