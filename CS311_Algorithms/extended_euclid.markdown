# Extended Euclid

## Last Lecture

Input: a, b

Outputss: d <- gcd(a,b)

gcd(a,b) = gcd( a mod(b), b)

2log(b) recurrences.

We want to produce two more outputs

a\*x + b\*y = d

mod a and b, place a mod b in b col and b in a col

a  b   x   y
99 78  -11 14  <--- x and y value
78 21  3 -11
21 15  -2 3
15 6   1  -2
6  3   0  1   
[3]  0   1  0

gcd is 3

Lets take a row of the table
m   n        x   y
n   m mod n  x'  y'

What do we know about second row? We know

x'n + y' m mod(n) = d

and we know

x'n + y' (m - floor\_(m/n)n) = d

y'm + (x' - y' floor(m/n)n = d

xm + yn =d

Set x to be y' and set y to be whatever the quantity (x'-...) is

x <- y'

y <- x'-y' floor(m/n)

## Recursive Extended Euclid
```
extendedEuclid(a,b)

	if b = 0 then 
		return(a, 1, 0) // gcd, x, y
	else
		(d', x', y') <- extendedEuclid(b, a mod(b))
	
	(d, x, y) <- (d', y', x'-y'(floor(a/b)))
	return (d, x, y)
```

#### Runtime of Recursive Extended Euclid

The number of recursive is the same.

Run Time: theta( log(b) )













































