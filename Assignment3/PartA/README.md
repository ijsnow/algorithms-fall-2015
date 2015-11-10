***This was copied from the assignment description and slightly modified for github***


Method: ```int numPaint(String input)```

- String input represents several tiles. Each tile’s color is either black (B) or white (W). For example:

        Input = “BW”; //means 1st tile is black, 2nd tile is white.

- You can choose any of the tiles and paint it over with either black or white. Our main goal is to paint so that every black tile is to the left of the white tiles. Return minimum number of paints needed. Please note that all white or all black after painting still satisfy our goal (example 3 below).

Constraints: String input length is between 1 and 50 characters
 
Example:

      input = “BBWWW”;
      // => 0 No need to paint anything
      
      input = "BWBWB";
      // => 2 We can paint 2nd and 5th position of input: BWBWB -> BBBWW
      
      input = “WWWWBBB”;
      // => 3 WWWWBBB -> WWWWWWW
