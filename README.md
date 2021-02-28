# Reverse without using Mutable Variable in Scala

## What is Scala?

Scala is a general-purpose programming language providing support for both object-oriented programming and functional programming. The language has a strong static type system. Designed to be concise, many of Scala's design decisions are aimed to address criticisms of Java.

## Description
I have created a reverseList() method which can be used to reverse any kind of list. This method does not use any kind of mutation variable. The method is implemented by using tail recursion which is an optimised version of recursion in which no stack call is made which does not lead to stack overflow error even in case of a very large list.

## Commands
* sbt compile - To compile the code
* sbt test - To execute unit test cases
* sbt scalastyleGenerateConfig - To generate scalastyle config file
* sbt scalastyle - To execute scalastyle plugin for API
* sbt test:scalastyle - To execute scalastyle plugin for test cases