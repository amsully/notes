# Competitive Programming in Java - Good Coding Practices

Gaurav Sen

https://www.youtube.com/watch?v=fWRzpBDxXtk&list=PLMCXHnjXnTnsWU7jYp9XCKPW8ayl6D8fb

https://www.youtube.com/watch?v=q4TO2ZfRnfk&index=2&list=PLMCXHnjXnTnsWU7jYp9XCKPW8ayl6D8fb


Efficient, Debuggable, Correct.

## Use test cases.

### Operation time (assumptions)

Inputs - 
10^8 = 1 second, n = 10^7 -- O(n)
10^6, O(n log(n) ) will survive
10^4, O(n^2) will survive

### Premature Optimization (general guidelines)

- There is no reason to make all our functions public, private, etc... Just make it public.
- See which variables DONT NEED TO CHANGE (ie StringBuilder, sums) - it is a good practice
- Fast IO (discussed in later lecture)
- Avoid Object Creation - they shouldn't be of order of n^2, n etc.
	- Object are expensive and usually you can substitute with long/int etc
- Avoid initializing array multiple times
	- ie, number of test cases given to us .. we need to print something in each test case
	- simpler to initialize constraints 

ie: 
```
final int tt[] = new int[1000000];
```

### Debuggable

- Good variable naming.
- Simplify functions.

more ways...

- Dont use global variables.
- Using as many library functions as possible.

ie
```
Arrays.binarySearch(...)
Arrays.parallelSort(...)
...

```

Some weird cases ... like strings.indexOf("")... this is an O(n^2) operation.














