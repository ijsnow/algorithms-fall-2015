***This was copied from the assigment description and modified slightly for github***

Method: ```int numStep(int[] sequence)```
 
A sequence is defined as palindrome if the reverse of the sequence is the same as the original.

For example: below sequences are all palindromes.

    {1, 3, 1}
    {9, 25, 25, 9}
    {100}

You are given an input sequence[ ]. You can replace any two adjacent numbers with their sum. Each replacement is counted as a step.
 
Returns minimum number of steps to make the sequence a palindrome.
 
Constraints:
- sequence has 1 to 50 elements.
- Each element in sequence is between 1 and 10000.
 
Example:

    {9, 25, 25, 9}
    //=> 0 Already palindrome
    
    {1,1,1,3}
    //=> 2
    // We can replace:
    // {1,1,1,3} -> {2,1,3}
    // {2,1,3} -> {3,3}
