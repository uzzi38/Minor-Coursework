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
		System.out.println(tireMarks);			//Created evidence and printed them out
		EvidenceBox box = new EvidenceBox(2005000381 , "S.Avery"); //Evidence box created
		box.add(powderResidue);
		box.add(tireMarks);			//Evidence added to box
		System.out.println(box);	//Box(inside of the box) printed to console
		Policeman man1 = new Policeman("J. Lenk");
		Policeman man2 = new Policeman("A. Colborn");		//Both policemen added
		man1.addEvidenceBox(box); 							//J.Lenk gets the evidence box
		ArrayList<Evidence> list = man1.possessedEvidences(2005000381, "DNA"); //Stores the list of evidence of type DNA that J.Lenk holds
		System.out.println("Pieces of DNA Evidence in Evidence Box number 2005000381 found by J. Lenk:");
		System.out.println(list); //Prints out the list of evidence
	}

}
