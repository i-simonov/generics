# Java Generic Classes Project

This project consists of several Java classes that demonstrate the use of generics and basic data structures.

## Classes

### ArraySearcher
A class that searches for a specific value in an array. Throws a `NoSuchElementException` if the value is not found.

### ArraySearcherManager
Responsible for taking user input to create an array and then search for a specific value in that array using the `ArraySearcher` class.

### NumberGeneric
Contains a method `pow` that calculates the power of a number.

### NumberGenericManager
Takes user input for the base and exponent and then calculates the power using the `NumberGeneric` class.

### CustomStack
An implementation of a stack with `add`, `del`, `size`, and `find` methods.

### CustomStackManager
Responsible for taking user input to create a stack and then perform operations like adding, deleting, and finding elements.

### AnyTypeWrapper
A generic wrapper for any type of object. It has methods for getting, setting, and checking if the value is null.

### AnyTypeWrapperManager
Demonstrates the usage of `AnyTypeWrapper` by wrapping various types of objects and checking for null.

## Usage

To run the application, compile and run the `Main` class. This will prompt the user to select a task from a menu. The user can then follow the prompts to complete the selected task.

## License

This project is licensed under the MIT License.
