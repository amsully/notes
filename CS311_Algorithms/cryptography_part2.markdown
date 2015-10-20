# Cryptography


Public Key

Alice		Bob
Pa Sa		Pb Sb

SIG < - Sa(M)

M.SIG <- Left is message right is signature

C <- Pb(M.SIG)

M'.SIG<- Sb(C)

M <- Pa(SIG) // apply alices key

f(M = M') then accept else reject



Properties

1.)

M = Sa(Pa(M))

M = Pa(Sa(M))

2.)

Pa(), Sa() <- Easy to compute

3.)

y <- Pa(x)

Hard to invert

One-way function

Trapdoor Function


# RSA

Key Generation

1) Select two large random primes (p & q)

2) compute n = pq phi = (p-1)(q-1)

3) Select small odd integer e such that e is relatively prime to phi

gcd( e , phi ) = 1

4) Find d such that d\*e mod phi = 1

5) PUblic Key = (e, n)

Secret Key = (d, n)

Extended Euclid

x\*e + y\*phi = 1

x\*e mod phi = 1

x value we get is d value

Public Key Encryption 0 <= M <= n-1

P(M) = M^e mod n = C

S(C) = C^d mod n = M

S(P(M)) = (M^e mod n)^d mod n

= M^ed mod n

we know e \* d mod phi is one

= M^(q \*phi + 1) mod n

Fact of number theory: Euler-Fermat Theorem

M^phi mod n = 1

M^q \* phi +1 mod n

M^(phi)q \* M mod n
1 M mod n = 

= M mod n = M

# Security of RSA

Carol knows the public key, 

Infer S =(d,n) from P(e,n)

Factoring is hard

Carol Knows:

C < - cypher text d <- someones secret key

C^d mod n = M

Carol knows C and carol knows n 

Lets assume Carol knows M, a set of M

M = C^d mod(n)

Solving for d is solving a Discrete Logarithm and we don't know an efficient way to solve it.















