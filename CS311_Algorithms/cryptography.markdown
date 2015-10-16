# Cryptography

Confidentiality of a message. Authentication.
```
	    channel

[Alice] -------------- [Bob]
		|
		|
              [Eve]
	     [Carol?]
```
Carol can write to the line

### Transposition

-Matrix Transposer 3x4
```
c   a   n   /

y   o   u   /

r   e   a   d
```
cyraoenua//d

Carol doesn't know scheme or size of the matrix



## Secret Key System
	
alice and bob share a secret key k

Alice -------------------- Bob

```
Alice encrypts with:
C <- E\_k(M)		

Bob decrypts with:
M <- D\_k(C)

M = D\_k(E\_k(M))
```
## Public Key Cryptosystem
```
ALICE		BOB
Pa		Bb //PUblic
Sa		Sb // Secret


```
Everyone know the public key. 
```
Sb(Pb(M)) = M = Pb(Sb(M))

Alice			Bob

Pb(M)     -----> 	Sb(Pb(M)) = M
			Pa(M)
```

##Secrecy and Authentication

Alice

1. Sig <- Sa(M)
2. C <- Pb(M * SIG)

Bob

1. M' * SIG <- Sb(C)
2. M <- Pa(SIG)
3. If M = M', then accept

















