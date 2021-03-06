# java-lambda-practice
A group of Java lambda exercices in order to practice the usage of it.

With Java 8, when we are talking about lambda expressions, there are two important packages that
were added:

- java.util.function
- java.util.stream

In order to start talking about lambda, we need to know the concept of *funcional interfaces*:

A functional interface is an interface that contains at most one abstract function or method.

It represents abstract concepts such as functions, actions or predicates.

Most common functional interfaces:

- Predicates - takes one argument, returns a boolean
- Consumer - accepts single argument with no return value
- Function - accepts one argument and produces a result
- Supplier - represents a supplier of results
- UnaryOperator - accepts a single argument with a return value
- BinaryOperator - accepts two arguments and returns one

With lambda, it's easier to represent a single abstract method from an interface with less
code than we are used to.

### **Collections API** (Often used with lambdas)

The collections API was introduced with Java 7.

A collection is a group of elements and it can store, retrieve, manipulate, and
communicate aggregate data.

Provides the following interfaces:

- Set - a collection that doesn't contain duplicates
- List - an ordered collection
- Map - an object that maps keys to value

The collection interface contains methods that perform basic operations, such as:

- int size() - gets the size of the collection
- boolean isEmpty() - returns true if the collection is empty or false if it's not.
- boolean contains(Object o) - checks if an element is inside the collection returning true if
it is or false if not.
- boolean add(Object o) - returns true if it was able to add the element or false if was an error.
- boolean remove(Object o) - tries to remove an element returning true if was successfully removed 
and false if not.
- Iterator<E> iterator() - it returns an iterator over the elemenets in this collection.

### **Stream API** ###

It's a package that contains interfaces for using streams.

- A stream represents a sequence of elements.
- This package was added in order to traverse collections.
- Most stream operations take a lambda expression.

Stream operations are categorized as:

- Intermediate operations returns the stream itself.
- Terminal operations are either void or return a type.
- Common operations include:
  - map (intermediate): it allows us to map one value to another.
  - filter (intermediate): it allows us to filter results using a Predicate.
  - forEach (terminal): iterate over a Collection or Stream.
  - sorted (intermediate): returns a sorted view of the stream.
  - collect (terminal): it's used to transform a stream into a different kind of result(List, Set, Map, etc.).

Elements in a stream can't be changed, but you can save them to a new collection, if you want to.