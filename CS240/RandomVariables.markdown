# Random Variables

### Uniform

P(x = k) = 1/ (b-a+1) for k = a, ..., b

### Bernoulli

P(x - k ) = { 1 - p if k = 0
	    { p     if k = 1

### Geometric

P(x = k) = (1-p)^(k-1) * p for k = 1,2,3....

### Poisson

P(x=k) = e^(-lambda) lambda^k / k!

- Can be flat, bump up, then come back down.
- Good for number of things that occur per unit time (number of cars passing an intersection)

We are taking a look at all the information

## Expectations of Random Variables

Suppose you play a simple game with your friend where you flip a coin. If the coin comes up heads, your friends pays you a dollar. If it comes up tails, you pay your friends a dollar.

Suppose you play N rounds of the game and you win Nw times and lose Nl time. What would your average payoff be?

Nw - Nl / N

As the number of rounds increases you will see that Nw/N converges to the probability of tails (1-p)

Let X be a random variable mapping the outcomes {heads, tails} to the payoff values {1, -1}. The limiting value of your average payoff converges to a nuber called the expected values of the random variabls X:

E[X] = P(X = -1)(-1)+P(X=1)(1)

Prob of win times amount you win plus prob you lost times amount you lose.

If the coin is fair, what are your expected winnings..


![alt tag](http://bit.ly/1hCPdZ7)

Answer is -.4

![alt tag](http://bit.ly/1hCPoUk)

The expected Value of X is also called the expectation of X or the mean of X.

## Expected Value

The expected value E[x] is a useful summary of the probability mass function of X. It is a summary of where the probability mass is located.


## Expectations of Standard Random Variables

#### Bernoulli

![alt tag](http://www.sciweavers.org/tex2img.php?eq=E%5Bx%5D%20%3D%20%281-p%29%2A0%20%2B%20p%2A1%20%3D%20p&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

#### Binomial

...

#### Geometric

...

Assume we have a finite collection of size N, they sum to zero, we can ask question for an arbitrary formula. 

## Functions of random variables

Suppose we have a random variable X and a function f(.) that maps from X to a different subset of the real number y.

Question: What does f(X) mean?
- f(X) is a random variable

The PMF is found as follows

P(Y = y) = \sigma\limits\_{x | f(x) = y} P(X = x) 

P(Y = y) = \sigma\limits\_{x | f(x) = y} P(X = x)

We see that the new PMF can be defined either in terms of P(X=x)

If X is a random variable, f(,) is a function, and Y= f(X) is a new random varie=able. what is E[Y]?

E[Y] = \sigma\limits{y} y * P(Y= y)
...
= \sigma\limits\_{x} f(x) * P(X = x)

## Linearity of Expectations

Let x be a random variable and Y be a random variable that is a linear function .. wehave


Suppose we have a random variable X. What is E[E[X]]?

E[E[X]] = E[X]

### Moments in Physics and Probability

The concept of moments in probability theory was also imported from physics.

In physics, any quantity multiplied by a length can be referred to as a "moment" or "first moment"

Moments

- The definition of the nTH moment is the proabbility weighted average of the nth power of x. In other words. It is a particular expectation

- We can see that the first moment is simply the expected vakue of X

The higher moments E[X^2], E[X3^3] ... are other typs of summaries of how the pribability mass is arranged on the real line, **with respect to the origin** ...


### Centered Moments

- Often it makes more sense to describe a prob mass function in terms of where the mass is located with respect to the origin (ie what is E[X]) and then to describe how the mass is arranged around E[X].

- The definition of the nth centered moment is the probability weighted average of the nth power of x-E[X]

### First Centered Moment

We can see that the first centered moment is E[X - E[X]]

Since the exp...

### Variance and he Second Centered Moment

- The second centered moment is called a **variance** of a ranom variable.
- The variance is a measure of the dispersion or spread of the probability mass around the mean E[X]

	var(X) = E[(X - E[X]^2)  =  E[X^2] - E[X]^2

- Since the variance is a probability weighted average of non-negative values, it's easy to see that it will always be non-negative.

### Standard Deviation

The term **standard deviation** simply refers to the positive square root of the variance, which always exists and is also positive

The standard deviation is also a measure of dispersion around the mean

One reason that people like to report standard deviations instead of variance i that the units are the same as X

Not needed to derive below but need to understand.

Bernoulli, Binomial, Geometric, Possion

Geometric is a cool derivation

Poisson is lambda



















 

= 
= 







