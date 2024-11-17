# Implementing and Utilizing Stacks and Queues in Java

## Project Overview
This repository contains Java implementations of stacks and queues using both array-based and linked list-based approaches. The project includes various applications such as reversing strings and simulating a print queue.

## Contents
- **src/**
  - `ArrayStack.java`: Class for array-based stack operations.
  - `LinkedListStack.java`: Class for linked list-based stack operations.
  - `ArrayQueue.java`: Class for array-based queue operations.
  - `LinkedListQueue.java`: Class for linked list-based queue operations.
  - `StringReversal.java`: Function to reverse a string using a stack.
  - `PrintQueue.java`: Class to simulate a print queue.
- **tests/**
  - `TestArrayStack.java`: Test cases for array-based stack.
  - `TestLinkedListStack.java`: Test cases for linked list-based stack.
  - `TestArrayQueue.java`: Test cases for array-based queue.
  - `TestLinkedListQueue.java`: Test cases for linked list-based queue.
  - `TestPrintQueue.java`: Test cases for print queue simulation.
- `report.pdf`: Analysis of time and space complexity of data structures.

## How to Run the Tests
1. Compile the Java files using `javac`:
```bash
javac src/*.java tests/*.java
java tests.TestArrayStack
java tests.TestLinkedListStack
java tests.TestArrayQueue
java tests.TestLinkedListQueue
java tests.TestPrintQueue
