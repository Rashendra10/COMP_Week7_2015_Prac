# Week 7 Java Practical Exercises

## Overview

This repository contains solutions for Week 7 of the COMP2015 & COMP2016 Programming Techniques course. The exercises focus on reading numeric and mixed data from text files and handling exceptions during file input operations.

### Exercise 1: Reading Data from Files

In this set of exercises, the goal is to read different types of numeric data from text files. Each program reads data from a file, displays the content to the screen, and handles various file reading scenarios such as files that don't exist, files with no data, or files with multiple lines of input.

1. **Exercise 1a - ReadNumberFile1.java**:
   - Reads whole numbers, one number per line from the file `numbers.txt`.
   - Handles files of varying lengths and files that do not exist using appropriate try-catch blocks.

2. **Exercise 1b - ReadNumberFile2.java**:
   - Reads two whole numbers per line, separated by spaces, from the file `numbers3.txt`.
   - Displays both numbers and handles files with different structures or no data.

3. **Exercise 1c - ReadNumberFile3.java**:
   - Reads three values per line (whole number, floating-point number, whole number) from `numbers5.txt`.
   - Displays the values and handles different data file structures.

4. **Exercise 1d - ReadNumberFile4.java**:
   - Reads three values per line (whole number, string, whole number) from `numbers6.txt`.
   - Displays the values and catches input mismatch exceptions.

### Exercise 2: Climate Change Data Analysis

This exercise focuses on reading temperature change data for different countries over multiple decades and calculating the average temperature change per country.

1. **Exercise 2a - ClimateAnalysis.java**:
   - Reads data from `TempChange_1970-1979.txt`.
   - Calculates and displays the average temperature change for each country in a formatted output.
   - Uses try-catch blocks to handle missing files and input mismatch exceptions.

2. **Exercise 2b - ClimateAnalysisB.java**:
   - Extends the functionality of Exercise 2a to process temperature change data from `TempChange_1961-2022.txt`.
   - Handles missing data in the file and calculates the average temperature change based on the available years.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/<your-username>/<your-repo>.git
[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/5NeYx2JV)
# week7prac
The validate.py file is to be used in your solutions for the week 7 prac exercises. You may initially need to copy the code into your python script to get it to work but I want you to be able to *import* the code before the end of the prac to improve code reusability.

BookShop.txt contains pseudocode for the exercise.