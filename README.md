<p align="center">
  <a href="https://www.linkedin.com/in/mugheesasif/">
    <img height=200 src="https://miro.medium.com/max/1200/1*Lur9rrJITsFRnuIYURYkSg.jpeg">
  </a>
</p>

--------------------------------------------------------------------------------------------

### 1. Getting Started

* Review <a href="https://github.com/mughees-asif/java-algorithms-datastructures">implementations</a> of algorithms and data structures in Java

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
| Arrays | [:memo:](https://github.com/mughees-asif/leetcode-solutions#arrays---back-to-key) | :green_book: |
| Strings | [:memo:](https://github.com/mughees-asif/leetcode-solutions#strings---back-to-key) | :green_book: | 
| Sorting and Searching | [:memo:](https://github.com/mughees-asif/leetcode-solutions#sorting-and-searching---back-to-key) | :green_book: |
| Dynamic Programming | [:memo:](https://github.com/mughees-asif/leetcode-solutions#dynamic-programming---back-to-key) | :green_book: |
| Math | [:memo:](https://github.com/mughees-asif/leetcode-solutions#math---back-to-key) | :green_book: |
| Trees | [:memo:](https://github.com/mughees-asif/leetcode-solutions#trees---back-to-key) | :green_book: |

----------------------------------------------------------------------------------------------

# 5. Interview preparation

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

## Strings - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Reverse String](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/) | reverses a given char array by using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) | [reversed char array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseString/src/com/mughees/Main.java) | `O(n)` |
|  [Reverse Integer](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/) | parse `Integer` as a `String` -> reverse the string using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) -> parse reversed `String` as an `Integer` -> Note: *handles overflow by using try/catch statement* | [reversed Integer](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseInteger/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Anagram](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/) | push both `String` objects to `char[]` -> sort -> check if both equal eachother | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidAnagram/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Palindrome](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/) | remove all non-alphabetical characters using regex (`\\W`) -> push `String` object onto `Stack` -> use loop to concatenate empty `String` object with characters from stack `stack.pop()` -> check if both equal eachother | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidPalindrome/src/com/mughees/Main.java) | `O(n)` |
|  [First Unique Character in a String](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/) | push `string.toCharArray()` -> loop and check `if (s.indexOf(arr[i]) == s.lastIndexOf(arr[i]))` -> return `i` if unique, else `-1` | [index of the first unique character](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/UniqueCharacter/src/com/mughees/Main.java) | `O(n)` |
|  [Count and Say](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/886/) | use `StringBuilder` object to append to previous `Integer` as per the given input `int` | [integer as string at specified place](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/CountAndSay/src/com/mughees/Main.java) | `O(n)` |

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
s

## Trees - back to [key](https://github.com/mughees-asif/leetcode-solutions#4-key)
| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Maximum Depth of Tree](https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/555/) | see code for a detailed explanation | [integer showing the max. depth of given tree](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Trees/MaxDepth/src/Solution.java) | *O(2<sup>n</sup>)* / `O(n)` |