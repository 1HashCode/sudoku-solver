# Sudoku Solver

![image](https://github.com/1HashCode/sudoku-solver/assets/154821339/e2775a19-55c9-4915-9ecf-3ea1412d57c5)

This is a simple Java implementation of a Sudoku solver using a backtracking algorithm.
Given a partially filled Sudoku grid, the program attempts to fill in all the empty cells such that every row, column, 
and 3x3 subgrid contains all the digits from 1 to 9 without repetition.

## Table of Contents
Usage
Algorithm
Contributing
License

## Usage
To use this Sudoku solver, follow these steps:

1) Clone this repository to your local machine.
2) Compile the sudoku.java file using any Java compiler.
3) Run the compiled file using the command java sudoku.
4) Ensure you have Java installed on your system to run the solver.

## Algorithm
### The Sudoku solver implemented in this codebase uses a recursive backtracking algorithm. Here's a brief overview of the algorithm:

1) Start from the top-left corner of the Sudoku grid.
2) If the current cell is empty, try filling it with a digit from 1 to 9.
3) Check if the digit placement is valid according to Sudoku rules (no repetition in rows, columns, and 3x3 subgrids).
4) If the digit placement is valid, move to the next cell and repeat steps 2-3 recursively.
5) If a solution is found, the algorithm stops.
6) If no valid digit can be placed, backtrack to the previous cell and try a different digit.
7) Repeat the process until a solution is found or all possibilities are exhausted.

## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

