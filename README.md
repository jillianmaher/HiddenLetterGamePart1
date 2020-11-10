# Hidden Word Starter Lab
In this lab, we will start to explore a Word Guessing Game. 

In the early 2000s game show [Lingo](https://en.wikipedia.org/wiki/Lingo_(American_game_show)), contestants would try to guess a Hidden Word. Their guesses would be in the form of a word. If a letter in their guess was in the correct position, the letter would be locked. If a letter from their guess exists anywhere in the hidden word, but not at that location, it would be circled. See the sample game board image below: 
![Sample Lingo Game Board](https://upload.wikimedia.org/wikipedia/commons/thumb/7/76/Lingopuzzle.svg/220px-Lingopuzzle.svg.png)



## The `HiddenWord` class
View the file `HiddenWord.java` to see the `HiddenWord` class. How many instance variables are in the class? How many constructors are there? What is the default value of the instance variable?

In this practice, you will be editing the `checkLetter` method. Review the return type and the parameters for this method to understand the inputs and outputs. 

## First Practice
In this lab, we will just mimic one letter guessing at a time. 

A user will provide a letter and a position they think the letter is located. 

The method `checkLetter` will then output one of the following: 
- Return the letter provided when the letter is found in the correct position
- Return `"*"` if the letter exists anywhere in the hidden word
- Return `"-"` if the letter is an incorrect guess completely

