https://github.com/amsully/notes/tree/master/CS240/resources
![alt tab]()
# Joint probability Mass Functions

If X and Y are discrete random variables associated with the **same experiment**, then their joint PMF is P(X,Y)
P(X = x, Y = y) is the probability of event

{X = x} and {Y = y}

Recall that {X = x} means {o | X(o) =x } and 

Recall that {Y = y} means {o | Y(o) ==y } and 

Recall that {X = x}and{ Y = y} means {o | X(o) =x Y(o)=y} 

Useful for describing multiple properties

##  Example: Tabular Representation of Joint PMFs

- Consider the simple experiment wher we randomly select a student on campus and ask for their GPA and program year.

What are the random variables? What are their Ranges?

[Figure] 

Year -> 1 ,2, 3, 4
GPA 2  .04 ...  .09
GPA 3  .08 ...  .16
GPA 4  .10 ...  .04

What is {GPA=3, Year=4}?
- Represents the set of seniors who have a GPA of 3

What is P{GPA=3, Year=4}?
- = 0.16

If we have a 3rd random variable we need to generalize table into 'cube'

It we know full joint PMF was completely characterize behavior of system

Is this a valid joint PMF for GPA and Year? How do we know

- Probability of the union of all event == 1
- Non of the cells can be negative
- Non of the cells can be greater than one
	- If all follow, we satisfy system

## Marginal PMF

We can compute the PMF of X or Y alone from P(X, Y)

Firsst the events {Y=y} for y element of \Y partition omega, 

so for a fixed event x {X = x} and {Y = y} for y element of \Y partition {X = x}


![alt tab](https://github.com/amsully/blob/notes/tree/master/CS240/resources/MarginalPMF.png)

Conditional PMF of X given Y: Denoted by P(X | Y)

Compute P(X | Y) using the definition of conditional probability:

P(A|B) = P(A and B) / P(B) = P(X=x | Y=y) = P(X=x | Y=y) / P(?)

Given our above graph

We want P(G | Y)
 - We devide the P(Y) by each value in the table
 - Whole graph no longer sums to 1, each column sums to 1

P(G | Y) = P(J) -- event doesnt have 0 probabity

P(G and Y) = P(G)P(Y)

P(G) does not change knowing P(Y)

We must check every entry to determine that independence is held

Suffices to show a counter example to show independence does not hold

**We can say X is condiionally independent of Y given Z if**:

P(X = x, Y = y | Z = z) = P(X =x | Z = z)P(Y = y)P(Z=z)

P(X=x | Y=y, Z=z) = P(X=x | Z=z)

P(Y=y | X=x, Z=z) = P(Y=y | Z=z)

## Space Complexity of Joint PMFs

- Suppose we have a problem that involves N Bernoulli random Variables

**X** = [X1, X2, ..., XN]

**Question**: How many numbers do we need to fully specify the joint PMF P(**X**=x) = P(X1=x1, X2=x2 ... XN=xn)

How Big? 2^n - 1

We have 3 bernoullis

3x3x3 -1 for normalization

Exponential growth in the number of random variables

Image 12 pixel Random Variables

12x12 Random Variables

**X** = X11 ... X1.12
	...	...
	X12.1 ... X12.12

This results in 2^104 Terabytes to store - number of numbers we need to specify the full joint PMF for the random variable

We can assume all pixel values are independent and probability P is the same that one pixel is on - defines valid P distribution

We can 144 coins and each has a biased representation

Form of the PMF under independence:

![alt tab](https://github.com/amsully/notes/blob/tree/master/CS240/resources/PMFUnderIndependence.png)

## Example Modeling Hand Written Digit Images

Question: How can we usw our joint mode?

Answer: Use Bayes Rule

Slide in Many Random Variables
















