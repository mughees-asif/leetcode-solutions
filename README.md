<p align="center">
  <a href="https://www.linkedin.com/in/mugheesasif/">
    <img height=200 src="https://miro.medium.com/max/1200/1*Lur9rrJITsFRnuIYURYkSg.jpeg">
  </a>
</p>

--------------------------------------------------------------------------------------------

### 1. Getting Started

- Review <a href="https://github.com/mughees-asif/java-algorithms-datastructures">implementations</a> of algorithms and data structures in Java

--------------------------------------------------------------------------------------------

### 2. Running the code 

Simply copy, paste and run the code if running on HackerRank.

If running locally, then: 

* clone the repo ```git clone https://github.com/mughees-asif/leetcode-solutions.git```

* change directory ```cd leetcode-solutions``` 

* run ```Main.java``` with your Java compiler or run the ```main``` method in ```Main.java``` if using an IDE.

--------------------------------------------------------------------------------------------

### 3. Contributing

Everyone is more than welcome to contribute to the solutions.

#### 3.1. Set-up for [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows):

1. From the main menu, choose <kbd>VCS | Get from Version Control</kbd> > <kbd>Git</kbd> > <kbd>Clone</kbd> > ```https://github.com/mughees-asif/hackerrank-solutions.git```(click Test to make sure that connection to the remote can be established).

2. If no project is currently opened, click <kbd>Get from Version Control</kbd> on the Welcome screen. In the Get from Version Control dialog, specify the URL of the repository ```https://github.com/mughees-asif/hackerrank-solutions.git``` (click Test to make sure that connection to the remote can be established), or select one of the VCS hosting services on the left. If you are already logged in to the selected hosting service, completion will suggest the list of available repositories that you can clone.

3. Git root mapping will be automatically set to the project root directory.

4. Optimise or add a different approach to the same solution.

5. Initiate a [pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests).

6. I will review it and, if applicable, merge the pull request. 

----------------------------------------------------------------------------------------------

## 4. Key

* hit the :memo: icon to navigate to the required section.

| Topic  | Location | Difficulty level |
| ------------- | ------------- | ------------- |
| Arrays | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: |
| Strings | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: | 
| Sorting and Searching | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: |
| Dynamic Programming | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: |
| Math | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: |
| Trees | [:memo:](https://github.com/mughees-asif/leetcode-solutions#5-easy-collection-green_book) | :green_book: |

| Topic  | Location | Difficulty level |
| ------------- | ------------- | ------------- |
| Arrays | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: |
| Strings | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: | 
| Sorting and Searching | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: |
| Dynamic Programming | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: |
| Math | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: |
| Trees | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-medium-collection-orange_book) | :orange_book: |

----------------------------------------------------------------------------------------------

# 5. Easy Collection :green_book:

## Arrays - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Remove Duplicates from Sorted Array](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/) | push array elements to `HashSet` -> duplicates automatically removed -> return `HashSet.size()` | [length of array w\out duplicates](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/Duplicates/src/com/mughees/Main.java) | `O(n)` |
|  [Rotate Array](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/) | use an extra array in which we place every element of the array at its correct position | [array elements shifted according to given int parameter](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/RotateArray/src/com/mughees/Main.java) | `O(n)` |
|  [Single Number](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/) | use the multiplicative properties of the `XOR (^)` operator | [single number that occurs only once in the given array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/SingleNumber/src/com/mughees/Main.java) | `O(n)` |
|  [Two Sum](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/) | use a `HashMap` to reduce look-up to `O(1)` -> initialise a *variable* to find `target - array[i]` value -> if `HashMap` contains the *variable*, return the index of `array[i]` & the *variable* | [two numbers that add up to the required sum](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/TwoSum/src/com/mughees/Main.java) | `O(n)` |
|  [Move Zeros](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/) | if `nums[i] != 0`, increment the index and equal to `lastIndex != 0` -> replace all shifted elements with `0` | [all `0's` moved to the end on the array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/MoveZero/src/com/mughees/Main.java) | `O(n)` |
|  [Missing Number](https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/722/) | initialise new `tempArr` with length `originalArr + 1` -> populate `tempArr` from `originalArr[0]` to `i + 1` -> return `Arrays.mismatch.()` | [missing number](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/MissingNumber/src/com/mughees/Main.java) | `O(n)` |
|  [Rotate Matrix](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/) | [tranpose](https://en.wikipedia.org/wiki/Transpose) -> reverse each `matrix[i]`  | [transposed matrix](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/RotateMatrix/src/com/mughees/Main.java) | *O(n<sup>2</sup>)* |
|  [Intersection of Arrays II](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/) | Sort both arrays -> initiliase two pointers `i, j` (one for each array) -> logic check `if (arr1[i] > arr[j]) OR (arr1[i] < arr2[j])` -> if both logic checks are false, we have an intersection (common element) | [array of common elements b/w both input arrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/IntersectionArray/src/com/mughees/Main.java) | `O(N+N+N)` |

## Strings - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Reverse String](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/) | reverses a given char array by using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) | [reversed char array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseString/src/com/mughees/Main.java) | `O(n)` |
|  [Reverse Integer](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/) | parse `Integer` as a `String` -> reverse the string using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) -> parse reversed `String` as an `Integer` -> Note: *handles overflow by using try/catch statement* | [reversed Integer](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseInteger/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Anagram](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/) | push both `String` objects to `char[]` -> sort -> check if both equal eachother | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidAnagram/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Palindrome](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/) | remove all non-alphabetical characters using regex (`\\W`) -> push `String` object onto `Stack` -> use loop to concatenate empty `String` object with characters from stack `stack.pop()` -> check if both equal eachother | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidPalindrome/src/com/mughees/Main.java) | `O(n)` |
|  [First Unique Character in a String](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/) | push `string.toCharArray()` -> loop and check `if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i]))` -> return `i` if unique, else `-1` | [index of the first unique character](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/UniqueCharacter/src/com/mughees/Main.java) | `O(n)` |
|  [Count and Say](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/) | use `StringBuilder` object to append to previous `Integer` as per the given input `int` | [integer as string at specified place](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/CountAndSay/src/com/mughees/Main.java) | `O(n)` |
|  [Longest Common Prefix](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/) | *SOLUTION 1* - rather elegant Binary Search solution [here](https://www.geeksforgeeks.org/longest-common-prefix-using-binary-search/); *SOLUTION 2* - `minimumLengthOfPrefix` by finding `String` with the least number of `chars` -> while loop through until `firstElement.charAt(i) != lastElement.charAt(i)`  | [common chars in all strings](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/LongestPrefix/src/com/mughees/Main.java) | `O(nm log n)` [n = number of strings; m = max. number of chars in any string] |

## Sorting and Searching - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Merge Sorted Array](https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/587/) | initiliase an array ` new int[nums1.length]` -> `Array.copyOfRange()` x 2 -> `Arrays.sort()` | [merged array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/MergeArray/src/com/mughees/Main.java) | `O(1)` |

## Dynamic Programming - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Climbing The Stairs](https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/) | 1. *simple recursion* , 2. to reach the i<sup>th</sup> step -> `(i - 1) + (i - 2)` -> initialise array with `n` capacity -> use loop to determine i<sup>th</sup> element present in `arr[n]` | [integer showing the number of step combinations available](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/ClimbingTheStairs/src/com/mughees/Main.java) | *O(2<sup>n</sup>)* / `O(n)` |
|  [Maximum Subarray](https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/566/) | use [Kadane's](https://www.baeldung.com/java-maximum-subarray#1-kadanes-algorithm) Algorithm  | [integer representing the largest sum of a contiguous subarray](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/MaximumSubarray/src/com/mughees/Main.java) | `O(n)` |
|  [House Robber](https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/576/) | loop through array with every iteration at `i += 2` | [maximum integer of loot collected](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/HouseRobber/src/com/mughees/Main.java) | `O(n)` |

## Math - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Fizz Buzz](https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/) | simple boolean logic | [String list of numbers replaced with FizzBuzz](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/FizzBuzz/src/com/mughees/Main.java) | `O(n)` |
|  [Prime Numbers](https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/744/) | use the [Sieve of Eratosthenes](https://www.baeldung.com/java-generate-prime-numbers#5-working-example-of-sieve-of-eratosthenes) algorithm | [integer showing total no. of prime numbers `<` method parameter](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/PrimeNumbers/src/com/mughees/Main.java) | `O(n log n)` |
|  [Pascal's Triangle](https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/601/) | generate the overall triangle list, which will store each row as a sublist -> check for the special case of `0` -> If `numRows > 0`, initialize triangle with `[1][1]` as its first row, and proceed to fill the rows  | [Pascal's Triangle](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/PascalTriangle/src/com/mughees/Main.java) | *O(numRows<sup>2</sup>)* |
|  [Reverse Bits](https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/648/) | simple [bitwise operator](https://www.tutorialspoint.com/Java-Bitwise-Operators) usage  | [Reversed Bit](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/ReverseBits/src/Main.java) | `O(n)` |
|  [Hamming Distance](https://leetcode.com/explore/interview/card/top-interview-questions-easy/99/others/762/) | use the [^ operator](https://stackoverflow.com/questions/1991380/what-does-the-operator-do-in-java) | [distance b/w two points](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/HammingDistance/src/Main.java) | `O(n)` |

## Trees - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Maximum Depth of Tree](https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/) | see code for a detailed explanation | [integer showing the max. depth of given tree](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Trees/MaxDepth/src/Solution.java) | *O(2<sup>n</sup>)* / `O(n)` |

----------------------------------------------------------------------------------------------

# 6. Medium Collection :orange_book:

## Arrays - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [3Sum](https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/) | sort the array -> iterate through the list -> use another two pointers to approach the target | [list with arrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/3Sum/src/com/mughees/Main.java) | *O(n<sup>2</sup>)* |
|  [Spiral Matrix](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/395/) | make the spiral algorithm and implement it -> to reduce to time complexity from *O(n<sup>2</sup>) to `O(n)`, use a boolean array to check if the position is going out of bounds or into a cell -> great explanation [here](https://www.youtube.com/watch?v=siKFOI8PNKM) | [spiral elements of given matrix](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/SpiralMatrix/src/com/mughees/Main.java) | `O(n)` |
|  [Subarray Sum Equals K](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/2924/) |  | [number of subarrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/HouseRobber/src/com/mughees/Main.java) | `O(n)` |

## Strings - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Longest Substring without repeating characters](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/2920/) | use the [sliding window](https://levelup.gitconnected.com/an-introduction-to-sliding-window-algorithms-5533c4fe1cc7) approach | [longest substring](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/LongestSubstring/src/com/mughees/Main.java) | `O(n)` |
|  [String Compression](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/402/) | push `input[]` to `LinkedHashMap` to preserve order -> map keys and values -> print | [compressed string](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/HouseRobber/src/com/mughees/Main.java) | `O(n)` |

## Sorting and Searching - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |


## Dynamic Programming - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |


## Math - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |


## Trees - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |

