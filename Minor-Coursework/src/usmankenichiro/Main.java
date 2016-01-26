package usmankenichiro;

import usmankenichiro.tightlycoupled.Evidence;
import usmankenichiro.tightlycoupled.EvidenceBox;

public class Main {

	public static void main(String[] args) {
		Evidence powderResidue = new Evidence("powder residue");
		System.out.println(powderResidue);	
		Evidence tireMarks = new Evidence("tire marks");
		System.out.println(tireMarks);
		EvidenceBox box = new EvidenceBox(2005000381 , "S.Avery");
		box.add(powderResidue);
		box.add(tireMarks);
		System.out.println(box);
	}

}
