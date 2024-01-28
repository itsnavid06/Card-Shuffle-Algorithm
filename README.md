# Card-Shuffle-Algorithm
This algorithm performs a card shuffle on a list of 2n elements. The list is split into two 
halves, L1 and L2. The shuffle is performed by interweaving elements from the two lists such that we 
would start with the first element from L1, followed by the first element of from L2, then the second 
element from L1, the second element from L2, and so on. Ultimately this process combines the two lists 
and performs the shuffle. The time complexity of this algorithm is O(n) and no additional lists of any kind 
are used more than O(1) cells.


![image](https://github.com/itsnavid06/Card-Shuffle-Algorithm/assets/92177592/5e4a9d63-2240-4150-a84e-68b479f50a23)



Using the two pointer techniques P1 will point to the head of the LinkedList and P2 will point to the middle of 
the LinkedList. If the length of the LinkedList is an odd number, then P2 rounds up. There are two cases where the shuffling of the list has completed. In case of an even number, once the
pointers are next to each other that we have traversed through the LinkedList, and the list has been fully 
shuffled. In the case of an odd length for the list then the pointers would land on the last node indicating 
the end of the shuffle.

The output of the algorithm: 


![image](https://github.com/itsnavid06/Card-Shuffle-Algorithm/assets/92177592/af6351ad-e12d-41e4-a634-6359aa811c37)
