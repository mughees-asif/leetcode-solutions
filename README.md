<p align="center">
  <a href="https://www.linkedin.com/in/mugheesasif/">
    <img height=200 src="https://miro.medium.com/max/1200/1*Lur9rrJITsFRnuIYURYkSg.jpeg">
  </a>
</p>

------------------------------------------------------------------------------------------

### 1. Getting Started

- Review <a href="https://github.com/mughees-asif/java-algorithms-datastructures">implementations</a> of algorithms and data structures in Java

------------------------------------------------------------------------------------------

### 2. Running the code 

Simply copy, paste and run the code if running on HackerRank.

If running locally, then: 

* clone the repo ```git clone https://github.com/mughees-asif/leetcode-solutions.git```

* change directory ```cd leetcode-solutions``` 

* run ```Main.java``` with your Java compiler/terminal or run the ```main``` method in ```Main.java``` if using an IDE.

------------------------------------------------------------------------------------------

### 3. Contributing

Everyone is more than welcome to contribute to the solutions.

#### 3.1. Set-up for [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows):

1. From the main menu, choose <kbd>VCS | Get from Version Control</kbd> > <kbd>Git</kbd> > <kbd>Clone</kbd> > ```https://github.com/mughees-asif/hackerrank-solutions.git```(click Test to make sure that connection to the remote can be established).

2. If no project is currently opened, click <kbd>Get from Version Control</kbd> on the Welcome screen. In the Get from Version Control dialog, specify the URL of the repository ```https://github.com/mughees-asif/hackerrank-solutions.git``` (click Test to make sure that connection to the remote can be established), or select one of the VCS hosting services on the left. If you are already logged in to the selected hosting service, completion will suggest the list of available repositories that you can clone.

3. Git root mapping will be automatically set to the project root directory.

4. Optimise or add a different approach to the same solution.

5. Initiate a [pull request](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests).

6. I will review it and, if applicable, merge the pull request.
--------------------------------------------------------------------------------------------

### 4. Key

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

| Topic  | Location | Difficulty level |
| ------------- | ------------- | ------------- |
| Sorting and Searching | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-hard-collection-closed_book) | :closed_book: |
| Strings | [:memo:](https://github.com/mughees-asif/leetcode-solutions#6-hard-collection-closed_book) | :closed_book: | 

------------------------------------------------------------------------------------------

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
|  [Intersection of Arrays II](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/) | Sort both arrays -> initiliase two pointers `i, j` (one for each array) -> logic check `if (arr1[i] > arr[j]) OR (arr1[i] < arr2[j])` -> if both logic checks are false, we have an intersection (common element) | [array of common elements b/w both input arrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/IntersectionArray/src/com/mughees/Main.java) | `O(n)` |

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

------------------------------------------------------------------------------------------

# 6. Medium Collection :orange_book:

## Arrays - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [3Sum](https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/) | sort the array -> iterate through the list -> use another two pointers to approach the target | [list with arrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/3Sum/src/com/mughees/Main.java) | *O(n<sup>2</sup>)* |
|  [Spiral Matrix](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/395/) | make the spiral algorithm and implement it -> to reduce time complexity from *O(n<sup>2</sup>)* to `O(n)`, use a boolean array to check if the position is going out of bounds or into a cell -> great explanation [here](https://www.youtube.com/watch?v=siKFOI8PNKM) | [spiral elements of given matrix](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/SpiralMatrix/src/com/mughees) | `O(n)` |
|  [Subarray Sum Equals K](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/2924/) | use `HashMap` -> add `nums[i]` to `total_sum` -> `if total_sum - target = nums[i]`, increment `counter` | [number of subarrays](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/SubarraySumK/src/com/mughees/Main.java) | `O(n)` |
|  [Meeting Rooms II](https://leetcode.com/explore/interview/card/bloomberg/508/heap-queue-stack/2935/) | check the comments on the code | [integer representing the no. of rooms needed](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/MeetingRoomsII/src/com/mughees/Main.java) | `O(n log n)` |
|  [Kth Largest Element in Array](https://leetcode.com/explore/interview/card/google/59/array-and-strings/361/) | *SOLUTION 1*: Sort the array and return `length - k`. *SOLUTION 2*: Use a PriorityQueue (min heap in Java implementation) -> iterate through and `.poll()` till `heap.size() == k` | [kth largest element from an array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/KthLargestElement/src/com/mughees/Main.java) | 1. `O(n log n)` / 2. `O(n)` |
|  [Container With Most Water](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3048/) | use the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) | [max area of water in the container](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/ContainerWithMostWater/src/com/mughees/Main.java) | `O(n)` |
|  [Trapping Rain Water](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3048/) | use the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/), check out the comments on the code | [int representing the amount of trapped water](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/TrappingRainWater/src/com/mughees/Main.java) | `O(n)` |
|  [Permutations](https://leetcode.com/problems/permutations/) | [Heap's algorithm](https://stackoverflow.com/questions/24889201/heaps-algorithm) | [all possible permutations](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/Permutations/src/com/mughees/Main.java) | `O(n)` |
|  [Next Permutation](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3050/) | [tricky](https://assets.leetcode.com/static_assets/media/original_images/31_Next_Permutation.gif) | [lexographically greater arrangement](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/NextPermutation/src/com/mughees/Main.java) | `O(n)` |
|  [Product of array except self](https://leetcode.com/explore/interview/card/apple/344/array-and-strings/3113/) | initialise two arrays -> `firstArray[i] = products of A[0]..A[i-1]`, and `secondArray[i] = products of A[i+1]..A[LENGTH-1]` -> the result is simply `firstArray[i] * secondArray[i]` | [product of all elements except input[i]](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/ProductOfArrayExceptSelf/src/com/mughees/Main.java) | `O(n)` |


## Strings - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Longest Substring without repeating characters](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/2920/) | use the [sliding window](https://levelup.gitconnected.com/an-introduction-to-sliding-window-algorithms-5533c4fe1cc7) approach | [longest substring](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/LongestSubstring/src/com/mughees/Main.java) | `O(n)` |
|  [String Compression](https://leetcode.com/explore/interview/card/bloomberg/68/array-and-strings/402/) | push `input[]` to `LinkedHashMap` to preserve order -> map keys and values -> print | [compressed string](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/StringCompression/src/com/mughees/Main.java) | `O(n)` |
|  [Sort Characters By Frequency](https://leetcode.com/explore/interview/card/bloomberg/72/sorting-and-searching/432/) | use a `HashMap` to count occurrences of the `char` -> compare and print using `StringBuilder` (avoid string concatenation) | [descending order of character frequency](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/CharFreq/src/com/mughees/Main.java) | `O(n log n)` |
|  [Longest Palindromic Substring](https://leetcode.com/explore/interview/card/bloomberg/73/dynamic-programming/2940/) | there are alot of ways to do this problem, most common solutions use dynamic programming -> this solution uses an `expandFromTheMiddle` helper method -> Leetcode explains it very well: "We observe that a palindrome mirrors around its center. Therefore, a palindrome can be expanded from its center, and there are only `2n − 1` such centers. You might be asking why there are `2n − 1` but not `n` centers? The reason is the center of a palindrome can be in between two letters. Such palindromes have even number of letters (such as "abba") and its center are between the two 'b's." | [longest palindromic substring](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/LongestPalindromicSubstring/src/com/mughees/Main.java) | *O(n<sup>2</sup>)* |
|  [Find And Replace in String](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3057/) | an important detail in the question is that there is no overlapping region | [string](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/FindAndReplace/src/com/mughees/Main.java) | `O(n * r)`, n = length of string, r = replacement operations |
|  [Word Search II](https://leetcode.com/explore/interview/card/google/62/recursion-4/462/) | [TRIE](https://www.youtube.com/watch?v=zIjfhVPRZCg) it | [available words in the 2D grid](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/WordSearchII/src/com/mughees/Main.java) | `O(n)` |
|  [Multiply Strings](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3051/) | solution based on elementary math multiplication, check the code for comments | [product of the two input strings](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/MultiplyStrings/src/com/mughees/Main.java) | *O(n<sup>2</sup>)* |
|  [Decode String](https://leetcode.com/explore/interview/card/google/61/trees-and-graphs/3073/) | account for the 4 types of characters that are encountered using two Stacks | [decoded string](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/DecodeString/src/com/mughees/Main.java) | `O(n * m)` n = length of input string, m = max. value of digit for decoding |
|  [Backspace String Comparison](https://leetcode.com/explore/interview/card/google/59/array-and-strings/3060/) | use a `Stack` | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/BackspaceStringComparison/src/com/mughees/Main.java) | `O(m + n)`, n & m = length of input strings |

## Sorting and Searching - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Merge Intervals](https://leetcode.com/explore/interview/card/bloomberg/72/sorting-and-searching/2938/) | notice for merging, the `lastIndex` of `firstArray >= firstIndex` of `secondArray` -> if you use this logic, it cuts the need to check each interval | [merged interval array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/MergeIntervals/src/com/mughees/Main.java) | `O(n log n)` |
|  [Top K Frequent Words](https://leetcode.com/explore/interview/card/bloomberg/72/sorting-and-searching/2938/) | count occurrences -> check for alphabetical order using custom `Comparator` in a `PriorityQueue` -> remove all the elements that are more than `K` frequency -> reverse `result` list | [top K frequent words](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/TopKWords/src/com/mughees/Main.java) | `O(n log K)` |
|  [Merge Two Sorted Lists](https://leetcode.com/explore/interview/card/facebook/6/linked-list/301/) | recursion 101 | [merged lists](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/MergeKSortedLists/src/com/mughees/Main.java) | `O(m * n)`, n & m = length of both lists |
|  [Reorder Lists](https://leetcode.com/problems/reorder-list/) | find the middle of the list, reverse second part, merge the lists | [reordered lists](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/ReorderLists/src/com/mughees/Main.java) | `O(n)` |
|  [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | search, sorted array? -> binary search | [int array with first and last location](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/FirstAndLastNumberLocation/src/com/mughees/Main.java) | `O(log n)` |

## Dynamic Programming - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Coin Change](https://leetcode.com/explore/interview/card/google/64/dynamic-programming-4/3088/) | dynamic programming 101 | [integer showing the minimum combinations needed to make amount](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/CoinChange/src/com/mughees/Main.java) | `O(n * m)`, n = size of coins array, m = amount |

## Math - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Add Two Lists](https://leetcode.com/explore/interview/card/apple/345/linked-list/2021/) | elementary addition | [integer addition](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/AddTwoLists/src/com/mughees/Main.java) | `O(n)` |

------------------------------------------------------------------------------------------

# 6. Hard Collection :closed_book:

## Strings - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
| Number To Words | tl;dr -> check the [code](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/NumbersToWords/src/com/mughees/Main.java) | - | - | 


## Sorting and Searching - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | use a `PriorityQueue` (min heap) to keep track of the smallest element in each list | [K merged lists](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/SortingAndSearching/MergeKSortedLists2/src/com/mughees/Main.java) | `O(n log k)`, n = no. of nodes, k = no. of lists |
