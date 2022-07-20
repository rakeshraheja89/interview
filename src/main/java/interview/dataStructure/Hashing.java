package dataStructure;

/*
Space : O(n)
Search    : O(1) [Average]    O(n) [Worst case]
Insertion : O(1) [Average]    O(n) [Worst Case]
Deletion  : O(1) [Average]    O(n) [Worst Case]

 */
/*
HashingHash Function: A function that converts a given big input key to a small practical integer value. The mapped integer value is used as an index in the hash table. A good hash function should have the following properties
1) Efficiently computable.
2) Should uniformly distribute the keys (Each table position equally likely for each key)

Hash Table: An array that stores pointers to records corresponding to a given phone number.
An entry in a hash table is NIL if no existing phone number has a hash function value equal to the index for the entry.

Collision Handling: Since a hash function gets us a small number for a key which is a big integer or string,
there is the possibility that two keys result in the same value. The situation where a newly inserted key
maps to an already occupied slot in the hash table is called collision and must be handled using some
collision handling technique. Following are the ways to handle collisions:

Chaining: The idea is to make each cell of the hash table point to a linked list of records that have
the same hash function value. Chaining is simple but requires additional memory outside the table.
 */

/*
Hashing seems better than BST for all the operations. But in hashing, elements are unordered
 and in BST elements are stored in an ordered manner. Also, BST is easy to implement but hash
 functions can sometimes be very complex to generate. In BST, we can also efficiently find floor and ceil of values.
 */
public class Hashing {
}
