# Leetcode Solutions

### 1. Getting Started

* Review <a href="https://github.com/mughees-asif/java-algorithms-datastructures">implementations</a> of algorithms and data structures in Java

### 2. Running the code 

Simply copy, paste and run the code if running on HackerRank.

If running locally, then: 

* clone the repo ```git clone https://github.com/mughees-asif/leetcode-solutions.git```

* change directory ```cd leetcode-solutions``` 

* run ```Main.java``` with your Java compiler or run the ```main``` method in ```Main.java``` if using an IDE.

----------------------------------------------------------------------------------------------

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

* hit <kbd>Ctrl</kbd>+<kbd>F</kbd> on Windows & search by **name**.

| Symbol  | Difficulty Level |  
| ------------- | ------------- |
| :green_book: | Easy |
| :orange_book: | Medium |
| :closed_book: | Hard |

----------------------------------------------------------------------------------------------

# 5. Interview preparation

## Arrays :green_book:

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Remove Duplicates from Sorted Array](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/) | push array elements to `HashSet` -> duplicates automatically removed -> return `HashSet.size()` | [length of array w\out duplicates](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/Duplicates/src/com/mughees/Main.java) | `O(n)` |
|  [Rotate Array](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/) | use an extra array in which we place every element of the array at its correct position | [array elements shifted according to given int parameter](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/RotateArray/src/com/mughees/Main.java) | `O(n)` |
|  [Single Number](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/) | use the multiplicative properties of the `XOR (^)` operator | [single number that occurs only once in the given array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/SingleNumber/src/com/mughees/Main.java) | `O(n)` |
|  [Two Sum](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/) | use a `HashMap` to reduce look-up to `O(1)` -> initialise a *variable* to find `target - array[i]` value -> if `HashMap` contains the *variable*, return the index of `array[i]` & the *variable* | [two numbers that add up to the required sum](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/TwoSum/src/com/mughees/Main.java) | `O(n)` |
|  [Two Sum](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/) | use a reverse `for` loop to *start* at the end of the given integer array -> if `digits[i] != 9`, increment, else `digits[i] = 0` | [integer + 1 => new array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/TwoSum/src/com/mughees/Main.java) | `O(n)` |
|  [Move Zeros](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/) | if `nums[i] != 0`, increment the index and equal to `lastIndex != 0` -> replace all shifted elements with `0` | [all `0's` moved to the end on the array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/MoveZero/src/com/mughees/Main.java) | `O(n)` |

## Strings :green_book:

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Reverse String](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/) | reverses a given char array by using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) | [reversed char array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseString/src/com/mughees/Main.java) | `O(n)` |
|  [Reverse Integer](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/) | parse `Integer` as a `String` -> reverse the string using the [two-pointer method](https://leetcode.com/articles/two-pointer-technique/) -> parse reversed `String` as an `Integer` -> Note: *handles overflow by using try/catch statement* | [reversed Integer](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseInteger/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Anagram](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/) | push both `String` objects to `char[]` -> sort -> check if both equal eachother | [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidAnagram/src/com/mughees/Main.java) | `O(n)` |
|  [Valid Palindrome](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/) | remove all non-alphabetical characters using regex (`\\W`) -> push `String` object onto `Stack` -> use loop to concatenate empty `String` object with characters from stack `stack.pop()` -> check if both equal eachother| [boolean](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ValidPalindrome/src/com/mughees/Main.java) | `O(n)` |

## Dynamic Programming :green_book:

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Climbing The Stairs](https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/) | 1. *simple recursion* , 2. to reach the i<sup>th</sup> step -> `(i - 1) + (i - 2)` -> initialise array with `n` capacity -> use loop to determine i<sup>th</sup> element present in `arr[n]` | [integer showing the number of step combinations available](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/DynamicProgramming/ClimbingTheStairs/src/com/mughees/Main.java) | O(2<sup>n</sup>) / `O(n)` |

## Math :green_book:

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  [Fizz Buzz](https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/743/) | simple boolean logic | [String list of numbers replaced with FizzBuzz](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Math/FizzBuzz/src/com/mughees/Main.java) | `O(n)` |





