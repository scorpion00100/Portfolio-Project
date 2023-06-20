# MathWiz Project

Welcome to MathWiz, an innovative math calculation application that helps you evaluate complex mathematical formulas with ease.

## Features

- Evaluate complex mathematical formulas effortlessly
- Support for basic mathematical operators such as addition, subtraction, multiplication, and division
- Extensive library of mathematical functions including sine, cosine, exponential, logarithm, and more
- Seamless integration of essential mathematical constants like π (pi) and e
- User-friendly graphical interface for generating mathematical function curves and derivative functions.

## Project Structure

The project is structured as follows:

- The `src/main/java` directory contains the source code files, including classes for mathematical formulas and user interfaces.
- The `src/test/java` directory includes test classes for mathematical formulas.
- The `build` directory contains generated files during the project compilation and execution.
- The `build.gradle` file is the project's build configuration file.
- The `README.md` file you are currently reading provides information about the project.

## Project Setup

The project utilizes Gradle as the build system. You can run the project using the following Gradle commands:

- `gradle build`: Compiles the project and generates output files in the `build` directory.
- `gradle run`: Executes the application.

## Dependencies

The project has the following dependencies:

- JavaFX: A powerful Java library for creating captivating graphical user interfaces.
- JUnit: A widely-used Java unit testing framework.

## The project consists of several Java files, each serving a specific purpose. Here's a brief description of each file:

-  `Addition`: This file implements the Addition class, which represents the addition operator. It extends the BinaryOperator class and provides methods to compute the addition of two formula members, compute the derivative of the formula, and generate the textual representation of the addition operation.

- `BinaryOperator`: This file defines the abstract class BinaryOperator, which serves as a base class for binary operators. It encapsulates two formula members and an operator symbol. It provides methods to evaluate the formula, compute the textual representation, and compute the derivative of the formula. The compute method must be implemented by the subclasses to perform the specific computation for each binary operator.

- `Constant`: This file implements the Constant class, which represents a constant value in a formula. It takes a double value as input and returns the same value when evaluated. It provides methods to evaluate the formula, compute the derivative (which is always 0 for a constant), and generate the textual representation of the constant.

- `Cosine`: This file implements the Cosine class, which represents the cosine function. It extends the UnaryOperator class and provides methods to compute the cosine of a formula member, compute the derivative of the formula, and generate the textual representation of the cosine operation.

- `Division`: This file implements the Division class, which represents the division operator. It extends the BinaryOperator class and provides methods to compute the division of two formula members, compute the derivative of the formula, and generate the textual representation of the division operation.

- `Exponential`: This file implements the Exponential class, which represents the exponential function. It extends the UnaryOperator class and provides methods to compute the exponential of a formula member, compute the derivative of the formula, and generate the textual representation of the exponential operation.

- `Formula`: This file defines the Formula interface, which declares methods for evaluating the formula, computing its derivative, and generating its textual representation. All formula classes in this project implement this interface.

- `Logarithm`: This file implements the Logarithm class, which represents the natural logarithm function. It extends the UnaryOperator class and provides methods to compute the logarithm of a formula member, compute the derivative of the formula, and generate the textual representation of the logarithm operation.

- `Multiplication`: This file implements the Multiplication class, which represents the multiplication operator. It extends the BinaryOperator class and provides methods to compute the multiplication of two formula members, compute the derivative of the formula, and generate the textual representation of the multiplication operation.

- `Opposite`: This file implements the Opposite class, which represents the negation (opposite) operator. It extends the UnaryOperator class and provides methods to compute the negation of a formula member, compute the derivative of the formula, and generate the textual representation of the negation operation.

- `Sine`: This file implements the Sine class, which represents the sine function. It extends the UnaryOperator class and provides methods to compute the sine of a formula member, compute the derivative of the formula, and generate the textual representation of the sine operation.
- `UnaryOperator.java`: This file implements the abstract class `UnaryOperator`, which serves as a base class for unary operators. It encapsulates a formula member and an operator symbol. It provides methods to evaluate the formula, compute the textual representation, and compute the derivative of the formula. The `compute` method must be implemented by the subclasses to perform the specific computation for each unary operator.

- `Subtraction`: This file implements the `Subtraction` class, which represents the subtraction binary operator. It takes two formula members as input and computes their difference. It also provides methods for evaluating the formula, computing the derivative, and generating the textual representation.

- `VariableX`: This file implements the `VariableX` class, which represents the variable x in a formula. It takes a value for x as input and returns the same value when evaluated. It provides methods for evaluating the formula, computing the derivative (which is always 1 for x), and generating the textual representation of the variable.

- `SquareRoot`: The SquareRoot file implements the SquareRoot class, which represents the square root function. It takes a formula member as input and calculates the square root of its value. It provides methods to evaluate the formula,
 compute the derivative (using the chain rule), and generate the textual representation of the square root operation.
 
- `Power`:The Power file implements the Power class, which represents the power operation. It takes two formula members as input and calculates the value of the first member raised to the power of the second member. It provides methods to evaluate the formula, compute the derivative (using the chain rule), and generate th textual representation of the power operation.

/******************************************************************************
 * Package: viewer
 ******************************************************************************/

/**
 * MainAppController:
 * The MainAppController file implements the MainAppController class, which
 * serves as the main controller of the application. It handles the initialization
 * of the user interface, creation of function charts, and associated buttons.
 */

/**
 * MainAppLauncher:
 * The MainAppLauncher file implements the MainAppLauncher class, which launches
 * the JavaFX application. It loads the user interface FXML file and displays
 * the main window of the application.
 */

/**
 * FunctionChart:
 * The FunctionChart class provides the functionality to create and display a
 * chart representing mathematical functions. It uses the JavaFX charting library
 * to render the chart on the user interface. The FunctionChart class allows adding
 * and removing series representing different functions to be plotted on the chart.
 * It also provides methods to customize the appearance of the chart, such as setting
 * axis labels, chart title, and style options.
 */

/**
 * FunctionList:
 * The FunctionList class manages a list of functions that can be plotted in the
 * application. It allows adding, removing, and toggling the visibility of functions
 * in the list. The FunctionList class is responsible for maintaining the state of
 * plotted functions and updating the FunctionChart accordingly. It provides methods
 * to clear the list of functions and retrieve the currently plotted functions.
 */

/**
 * PlottableFunction:
 * The PlottableFunction class represents a function that can be plotted on the
 * FunctionChart. It encapsulates a mathematical formula and provides methods to
 * evaluate the function at a given x value and generate the series data to be
 * plotted on the chart. The PlottableFunction class also supports computing the
 * derivative of the function. It keeps track of whether the function is currently
 * plotted or not.
 */

/**
 * These three classes, FunctionChart, FunctionList, and PlottableFunction, work
 * together to enable visualization and interaction with mathematical functions
 * in the application. The FunctionList class manages the list of functions, the
 * FunctionChart displays the charts, and the PlottableFunction represents the
 * individual functions that can be plotted.
 */

## Author

This project was created by [IRYIVUZE DAN BETHEL].

For more information, please refer to the project documentation.


