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







