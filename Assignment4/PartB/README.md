
***This was copied from the assignment description and slightly modified for github***

Method: ```int minTime (String[] map)```

- String[] map represents rectangular parking lot. Each square of the parking lot is represented by a character:
‘B’ is bike
‘S’ is parking space
‘F’ is fence
‘.‘ is empty square.
- Each parking space can park only 1 bike. After a bike is parked, it can’t leave. Each bike can move in 4 directions (left, right, up, down). Each move takes 1 second, only one bike can move at a time. A bike can pass through an empty square; it can also pass through a square that has bike on it. However, the bike cannot pass through the fence.
- Return -1 if at least one bike cannot park. Otherwise, return the minimum time to park all the bikes.

Constraint:
- map contains between 1 and 50 elements.
- All elements of map have same length. Length of the element is between 1 and 50 characters.
- map contains 1 to 10 bikes. The number of bikes and parking spaces are the same.

Example:

      {
        "B..FS",
        "...FF",
        "....."
      }
      //=> -1 Bike cannot park because of the surrounding fences



      {
        "B",
        "S"
      }
      //=> 1 Move down 1 time to park

 

      {
        "B..S..S",
        ".B...BB",
        ".S..S.."
      }
      //=> 7
      // The bike at 1st row move three squares right.
      // On the 2nd row, the 1st bike moves one square down,
      // 2nd bike moves one square left and one square down,
      // and 3rd bike moves one square up.
