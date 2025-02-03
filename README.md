# Hands-on_Lecture_2
# Pascal's Triangle & Spiral Matrix Problems

## Overview
This repository contains Java implementations of **Pascal's Triangle** and **Spiral Matrix** problems, along with a test file (Test_Cases.jav) that verifies their accuracy with different inputs.
This also took very long to make so neat and cool
---

## Pascal's Triangle
### **Description**
Pascal's Triangle is a triangular array where each row represents the Integer coefficients. Each element is the sum of the two elements directly above it.

### **Implementation**
The Pascal_Triangle class constructs Pascal’s Triangle for a number of rows and prints it.

### **Sample Test Cases**
| Input  | Sample Output |
|--------|----------------|
| 3 rows | [1], [1, 1], [1, 2, 1] |
| 4 rows | [1], [1, 1], [1, 2, 1], [1, 3, 3, 1] |
| 0 rows | "Number of rows must be greater than 0." |

---

## Spiral Matrix
### **Description**
Given a 2D matrix, the Spiral Matrix problem requires traversing the matrix in a clockwise spiral order.

### **Java Implementation**
The Spiral_Matrix class takes a 2D matrix as input and returns a list of integers in spiral order.

### **Sample Test Cases**
| Matrix  | Expected Output |
|---------|----------------|
| 3x3   | [1, 2, 3, 6, 9, 8, 7, 4, 5] |
| 4x4   | [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10] |
| 2x2   | [1, 2, 4, 3] |
| 1x1   | [1] |
| Empty   | [] |

---

## Test Cases
### **File: Test_Cases.java**
This file contains test cases for both Pascal's Triangle and Spiral Matrix implementations.
This file also contains sample test cases and calls printing or testing methods from each respective file to test accuracy

### **Problem Overview**
1. **Tests Pascal's Triangle** by creating versions of different and increasing row sizes while printing the results. Additionally, remembering that some elements are the sum of the two elements directly above it.
2. **Tests Spiral Matrix** by passing different matrix sizes in the parameter and comparing the output with expected results.

---

## Expected Output Upon Running 

Sample Test for 3 rows expected return:
    [1]
   [1, 1]
 [1, 2, 1]

Return for 3 rows:
    [1]
  [1, 1]
[1, 2, 1]

Sample Test for 4 rows expected return:
    [1]
   [1, 1]
 [1, 2, 1]
[1, 3, 3, 1]

Return for 4 rows:
      [1]
    [1, 1]
  [1, 2, 1]
[1, 3, 3, 1]

Expected Output of a triangle with Negative Rows: Number of rows must be greater than 0.

All Matrix are made with ascending order from left to right then top to bottom

Expected output of a 3x3 is: [1, 2, 3, 6, 9, 8, 7, 4, 5]
Spiral Order: [1, 2, 3, 6, 9, 8, 7, 4, 5]

Expected output of a 4x4 is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]
Spiral Order: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

Expected output of a 2x2 is: [1, 2, 4, 3]
Spiral Order: [1, 2, 4, 3]

Expected output of a 1x1 is: [1]
Spiral Order: [1]

Expected output of an empty matrix is: []
Spiral Order: []







