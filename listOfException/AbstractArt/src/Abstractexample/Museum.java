package Abstractexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Museum {

	public static void main(String[] args) {
//		Create 3 instances of Painting
		Painting pain1 = new Painting("Oil");
		Painting pain2 = new Painting("Watercolor");
		Painting pain3 = new Painting("Watercolor");
//		Create 2 instances of Scupture
		Sculpture scu1 = new Sculpture("Marble");
		Sculpture scu2 = new Sculpture("Bronze");
		
//		Ninja Bonus: store the paintings and sculptures inside of an ArrayList called museum
		ArrayList<AbstractArt> museum = new ArrayList<AbstractArt>();
		museum.add(pain1);
		museum.add(pain2);
		museum.add(pain3);
		museum.add(scu1);
		museum.add(scu2);

//Ninja Bonus: use the viewArt() method of all of the artworks in the museum in a random order::
//		System.out.println(museum);
		Collections.shuffle(museum);
//		System.out.println(museum);
		
		for(int i=0;i<museum.size();i++) {
			museum.get(i).viewArt();
		}
		
		

	}

}
