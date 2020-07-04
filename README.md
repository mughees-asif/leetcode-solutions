# Leetcode Solutions

### 2. Getting Started

* Review <a href="https://github.com/mughees-asif/java-algorithms-datastructures">implementations</a> of algorithms and data structures in Java

### 2.2. Running the code 

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

* hit <kbd>Ctrl</kbd>+<kbd>F</kbd> on Windows & search by **name**/**topic-wise**.

| Symbol  | Difficulty Level |  
| ------------- | -------------
| :green_book: | Easy |
| :orange_book: | Medium |
| :closed_book: | Hard |

----------------------------------------------------------------------------------------------

# Interview preparation

## Arrays Challenges :green_book:

| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  Remove Duplicates from Sorted Array | push array elements to `HashSet` -> duplicates automatically removed -> return `HashSet.size()` | [length of duplicates removed array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/Duplicates/src/com/mughees/Main.java) | `O(n)` |
|  Rotate Array | use an extra array in which we place every element of the array at its correct position | [array elements shifted according to given int parameter](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/RotateArray/src/com/mughees/Main.java) | `O(n)` |
|  Single Number | use the `XOR (^)` operator as it is multiplicative  | [single number that occurs only once in the given array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Arrays/SingleNumber/src/com/mughees/Main.java) |


## Strings :green_book:


| Challenge  | Explanation  | Returns | Time complexity |
| ------------- | ------------- | ------------- |------------- |
|  ReverseString | reverse a given char array | [reversed char array](https://github.com/mughees-asif/leetcode-solutions/blob/master/Interviews/Strings/ReverseString/src/com/mughees/Main.java) |