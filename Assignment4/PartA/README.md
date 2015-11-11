I decided to implement this recursevely and iteratively for fun to see if there was a big time difference. All test cases were the same except the first one which was rougly ```0.0s``` for the iterative algorithm and ```0.076s``` for the recursive algorithm.

# The recursive algorithm does not work. I have not updated it to work in the dynamic way like the iterative function.

***This was copied from the assignment description and modified slighlty for github***

Method: ```int minPrice(String[] tiles)```

- Suppose we have several uncolored tiles that need to be painted.
- The input tiles[i] represents the price to paint ith tile in Black, Gray, and White. For instance:
{"2 90 90", "90 2 90"} means the prices to paint Black, Gray, White for 1st tile are 2, 90, 90 respectively. Similarly for 2nd tile prices are 90, 2, 90.
- Our goal is to NOT paint the same color for two adjacent tiles.
- Return the total minimum price to paint.

Constraint:
- Tiles contain between 1 and 20 elements.
- The price is from 1 to 1000.

Examples:

    {"2 90 90", "90 2 90", "90 90 2"}
    //=> 6 = 2 + 2 + 2

    {"5 100 100", "100 100 100", "5 100 100"}
    //=> 110 = 5 + 100 + 5

    {"30 44 87", "53 64 61", "17 93 103"}
    //=> 108 = 30 + 61 + 17
