
package A3;

import java.util.LinkedList;

public class CardShuffle<T> {

	public void DoCardShuffle(LinkedList<T> list) {
		int p1 = 0;
		int p2 = (int) Math.ceil((float) list.size() / 2); // P2 points to the middle element, if odd rounds up
	
		while (p2 - p1 > 1) { // while there is still room to shuffle. 
			T tmp = list.get(p2);
			// the for loop shuffle every element down the linkedList
			for (int i = p2; i > p1 + 1; i--) {
				list.set(i, list.get(i - 1)); // shuffle down one element to the right
				
			}
			// insert the element from p2 array into p1.
			list.set(p1 + 1, tmp);  

			p1 += 2;
			p2 += 1;
		}

	}

}
