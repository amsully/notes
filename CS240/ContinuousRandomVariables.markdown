# Continuous Random Variables

Probability Laws: assigns a probabiltiy P(A) to anyevent A subset omega encoding our knowledge or beliefs about the collective likelihood of the elements of event A: Satisfies

- Nonnegativity
- Additivty
- Normalization


Axioms for discrete probability laws

### Discrete Random Variables and PMDs

Formally a discrete random variable X, is a function from the outcome space to a finite or countable subset of the real numbers. X: omega-> x

The Probability of event X = x is given by the pmf.

# Continuous Random Variables

Many random variables are much more naturally thought of as taking continous values than a finite or countable number of values.

Defining probability consistently over a continous space is tricky

#### Example: Wheel of Fortune

Consider an experiment where we spin a wheel and the ranfom variable X is which of 24 spaces the wheel land on numbered 1 - 24

What is the PMF of X? P(X=k) = 1/24

**Question 2** Suppose we now define the random variable X to be the precise angle the wheel stops at which is a continuos function in [0, 360]

You cannot define a PMF for this function. 

Answer: P(X) must be uniform as in the previous case since the wheel is fair. However, if we set P(X = x) = element for element >0, we can always fnd more than 1/element values of x and the sum of their probabilities would be greater than 1. If we set element = 0 again we cant obtain a normalized PMF by summing values of X.

There is an uncountable number of positions around the wheel.

**Questin 3** Suppose we now define the random variabe X to be the precise angle the wheel stops at, which is a continuous value in [0, 360]

Can we define P(X element of [a,b])  for 0 < a < b < 360 

Answer: Yes (b-a)/360. So we cant have a PMF that gives a non-zero probability to individual values of X, but it can have non-zero probability for X element of [a,b]

We are defining an interval. If we ask about any single point we cannot build a PMF, if we ask about an interval we are okay.



In General if we define a subset A of X ... is range of a continuous random variable X that has non-zero length, then P(X element of A) can be non-zero.

In order for the function P(X element of A) to yield a valid probability law on subsets of X, it needs to satisfy the **original** probability axioms.

In particular, for any sets A subset X, B subset X whose intersection has zero length, we must have that 

P(X element of A or B) = P(X subset of A) + P(X subset B)


WE must also have that P(X element of A) >= 0 any A subset X (nonnegativity) and P(X element of scriptX) = 1 (normalization)

We need arbitrary probability law for arbitrary disjoint subsets. Where nonnegativity, additivity holds

### Additivity

### Probability Density

- The standard way to construct probability laws for continuoous random variabls is using a probability density function.

- If we have a random variable X with probabilit density function p(X=x) then the probability of any set A subset X is given by the integralof the density over A:

![probability density](resources/probability_density.gif)

The only restriction p(X  x ) >= 0 for all X (nonnegativity) and integral p(X=x) dx = 1 (normalization

Then these two requirements are met, defininte probabilities of sets by integrating the density function over the set

![alt tag](resource/integration.gif)


Wheel of Fortune

p(X=x) = 1/ 360

p(X=a) > 0 for all a, and integral 0 to 360 dx = 1

Using the above results, we find P(X element of [a,b]...

## Exponential Random Variable X is a continuous random variable with probabiliy density function

p(X = x) = 1/(lambda)^(-1/lambda \* x)

Either normalizable or it's not.

Monotonically decreasing. Nonnegative.

Range [0,infinity)

The parameter lambda must be strictly greater than 0

Exponential random variables are often used to model waiting times (eg: length of time betwn calls at a call center, the length of time between people entering a store, the length of tim ebetween hits on a website)..

Biggest value is 1/lambda (~.2) .. If we decrease lambda the decay is much faster. Squishes up against zero

P(a < X < b) = integral from a to be of the exponential function

## Normal Random Variables

A normal random variable X is a continuous random variable with probability density function:

p(X = x) = 1/sqrt(2(PI)(sigma)^2)exp(- (1/2(sigma^2))(x-neu)^2)

The range of this random variable is X = (-inf, inf)



















