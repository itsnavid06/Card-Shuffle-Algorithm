
package A3;

import java.util.LinkedList;

public class CardShuffleTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		list.add(1); //adding data into linkedList
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		CardShuffle<Integer> r = new CardShuffle<>();
		r.DoCardShuffle(list); //call card shuffle
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < list.size(); i++) { // prints out result
			System.out.print(list.get(i));
			
			if(i < list.size() - 1) {
				System.out.print(", ");
				//No comma after last linkedList
			}
		} 
		

	}

}



