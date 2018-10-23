package typyiScaner;

import java.util.Scanner;

public class TotalNotesClasess {

	@SuppressWarnings("resource")
	public static void main(String[] args ) {
		//program, który policzy średnią z kilku przedmiotów.
		//Możemy założyć, że uczeń w szkole ma 3 przedmioty
		//i z każdego z nich dostał po 4 oceny.
		
		int numberOfClasses = 3;
		int numberOfNotes = 4;
		for (int classIndex = 0; classIndex < numberOfClasses; classIndex++) {
		    for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++) {
		        
		    }// end classIndex for lop
		}// end noteIndex for lop
		
		        double[] notes = new double[4];
		        Scanner inputScanner = new Scanner(System.in);
		 
		        for(int i = 0; i < notes.length; i++) {
		            System.out.println(" Wprowadź 4 oceny od ( 1 do 6 ) i każdą zatwierdz enterem " + i);
		            notes[i] = inputScanner.nextDouble();
		        }// end i for lop
		 
		        double summarizedNote = 0;
		        for (double note : notes) {
		            summarizedNote += note;
		        }// end summerizedNote for lop
		 
		        System.out.println("Średnia ocen wynosi " + (summarizedNote / notes.length));
		    }// end main

}// end class


