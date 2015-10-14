
# Lecture Notes

Notes from Shaylyn that I missed in the book or feel should be re-emphasized.

**Industrial Strength Software Keywords:** Portability, robustness, reliability, usability, documentation

**Regression testing**: Retest everything after changing anything

**6 Attributes of Quality:** functionality, efficiency, reliability, maintainabilility, usability, portability

**Iron Triangle**

Tech -> People -> Process

**ETVX Approach** Entry Criteria, Transformation, Verification, Exit Criteria

## Requirements Specifcations

Characteristics of

**Customer:**

Complete, Accurate, Precise, Understandable, Accessible, Configurable

**Developer**

Accurate, Includes performance requirements, Detailed, Expected behavior, intuitive/accessible, unambiguous

CONTENT

1. USers
2. Expected I/O
3. Max Cost?
4. The Problem
5. Processing
6. Environment / platform
7. Restrictions/Regulations
8. Compatibility
9. Security considerations

Cost of fixing requirement errors in 

Design - 5 hours 65%

Coding - 15 hours 2%

Testing - 50 hours 30%
 
Maintain - 150 hours 3%

## Problem Analysis

- partition the problem 
- consider different states separately
- projection: look at problem from different points of view

** Data Flow Modeling**

Worker --flow--> Processes ----> entity
		[Database]

- DOES NOT SHOW FLOW OF CONTROL, Just Data

Structured Analysis:

1. Do a DFD of current physical environment
2. Abstract it to yield a logical DFD
3. Draft a new DFD -> Requirements
4. Identify man-machine boundaries
5. Identify logical entities (who is part of this) & goals

Object Oriented Analysis

- UML -> unified modeling language

## Requirement Specs

- Contract that should be verfiable, prioritized, correct, modifiable, traceable, consistent, complete, unambiguous

- Components
	1. Functional Requirements
	2. Performance Requirements
	3. Design Constraints
	4. Exterior interfaces (and UI)

**1 Functional:**

- everythin the system has to do
- relationship between inputs and outputs
- behaviour in outlier cases
- detailed description of data inputs
- what has to be done -- all operations including  validity checking, logical & mathematical manupulation

**2 Performance**

- Static: aka capacity requirements
- Dynamic: response time and throughput
- must be measureable and verifiable

**3 Design Constraints**

- Environmental factors
- Standards resource limits, reliability, operating environment, fault tolerance, securit ...

**4 External Interfaces**

- All interactions with people, hardware, and other software system
- Explicitly includes user interface -> Feedback, error message, screen formats, screen flows, user commands -> prelimanary user manual
- Full specification of minimal hardware environment
-Description of all interfaces to other systems

-Specifation language:
	- Lists be sufficient short deal in all sentences
	- Use appropriate diagram that you actually refer to

Structure:

1. Introduction -> Purpose scopre, definitions, acronyms, references, overview
2. Overall description -> product perspective & functions, user characteristics
3. Specific requirements -> the above listed as well as attributes

Writing functional specs with use cases	

- Use case captures single interaction between system and user
- Use case is initiated by primary actor
- Use cases use scenarios

- Typical contents of use cases
	- name, author, description, actors, primary actors, preconditions, post conditions, scenario, exceptions, primary actors

Developing a use case

- can be created within different layers of abstraction
- customer can read it
- failure handling and appropriate recovery behavior
- failure condiions

## Testing

need for test oracle

- given this output/input is it correct?
- run test cases 
- test criterion 
	- specication of something
	- must have reliability = if all that test cases that satisfy the criterion fnd the same set of errors
	- must have validity = for all faults there exists a set of test cases satisfying the criterion that exposes the faul

Test Plan

- test unit specifications - (entire system, set of modules, package or set of classes)
- Specify features and requirements of features that need to be tested in a given unit
- Deliverables -- test cases can be printed out and list error
- back door testing -- need to visualize it

Test PLan

- Testibility
- Test harnesses -> want to test something but dont have all modules
- avoid test harnesses by incremental testing


## Design

- Software architecture - way of describing how a system is put together, multiple views

- Consistency is key throughout
- 3 views of a system
	1. Modules - static views (classes)
	2. Component and connector -> objects/processes, 'runtime view'
	3. Allocation

rounded circle=client
rectangle = server
DB is ...
curved rectangle = app 
------- = request/reply

\_
\_|---- pipe

---- connection

<----> RPC (remote procedural call

### Types of diagrams / Styles of architecture

- Pipe and filters
- shared data
- client server 
- peer -2- peer
- publish-subscribe
- csp
- model view controller

 - Conceptual Integrity -> all fit together no extraneous bits, flows logically



















































