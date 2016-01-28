package usmankenichiro;

import java.util.ArrayList;

import usmankenichiro.tightlycoupled.Evidence;
import usmankenichiro.tightlycoupled.EvidenceBox;
import usmankenichiro.tightlycoupled.Policeman;

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
		Policeman man1 = new Policeman("J. Lenk");
		Policeman man2 = new Policeman("A. Colborn");
		man1.addEvidenceBox(box);
		ArrayList<Evidence> list = man1.possessedEvidences(2005000381, "DNA");
		System.out.println("Pieces of DNA Evidence in Evidence Box number 2005000381 found by J. Lenk:");
		System.out.println(list);
	}

}
