# Logitech Interview Programming Questions
## Notes
* Both Question 1 and Question 2 have unit test that are provided that run within NetBeans

## Question 1
### How to run
This question uses a maven-based project that was written and tested in NetBeans 11.1 with Java 12. I make use of some Java 8+ concepts like Lambda functions and stream().

The pom.xml file is included which encapsulates the dependencies.

The Launch.java file contains our main method and runs a simple and a more complex example of the problem being solved.
### Approach
1. I try to approach everything from TDD, so writing my unit-tests beforehand with very simple class constructs. This was no different. I knew what input had to yield what output, so I wrote test cases around them.

2. I started this question by developing a worst-case scenario and hoping that idea of dynamic programming (as it pertains to this question) would come to me in the process of solving in a non-efficient way. I did this simply by calculating every possible subset using bit masks and then validating them against our "setting off the alarm" rule. I wasn't sure if I should include this in the repository, but it was part of my process so I included it as a separate file.


3. Once I got the non-ideal solution working, things started coming to me from solving the 0/1 knapsack problem and I worked my way through it knowing that it was possible to solve in linear time.
### Assumptions
1. All input is non-negative, but we test for this anyways
2. Houses are robbed on the same day. No added dimentionality here
### Sample Output
```
Maximum we can steal from [1, 2, 3, 1] is 4
```

## Question 2
### How to run
This question uses a maven-based project that was written and tested in NetBeans 11.1 with Java 12. I make use of some Java 8+ concepts like Lambda functions and stream().

The pom.xml file is included which encapsulates the dependencies. The only library I used in the main application is apache-lang to provide some quick validation in my constructor (notBlank, notNull..etc)

The BuildOrganization.java file contains the main method and create the organizational structure that was asked for and prints it out afterwards.
### Approach
I tried to stick to the basics here and not get too fancy. My primary concern was a quick lookup for employees which is why the EmployeeRegistry was created with a HashMap that can do constant time lookup. Since the employee hierarchy is basically a tree with nodes in non-sorted order, we would have to check each node of the tree to try and find the Employee we wanted if we didn't have a lookup map. The rest of the organizational structure just follows a child/parent type relationship with the CEO being the root of the tree.
### Assumptions
1. Nobody at the company has the same given name (first name) since the requirements indicate that an employee should be returned for reading and writing based on this

2. Employees can only be added, not removed. This removal would be fairly easy in any case (except for the CEO); we would simply associate any children for a removed employee with the current boss of the employee to be removed, so we don't break the corporate chain and have orpaned employees.

3. Employees won't change their first name since it will break the employee registry. Since a HashMap key has to be replaced instead of changed, we would simply generate a new employee record for an employee that wanted to change their given name and add the employee to the registry again, but this was out of the scope of the question.

4. There is a single class of Employee. If we wanted to get fancier we  may make Employee an abstract class and subclass it for other types of Employees like CEO, VP, Manager since they all come with their own behaviour / data I'm sure. Again, outside of the scope of this question.
### Sample Output
```
--John
Subordinates:
	Mary

	--Mary
	Subordinates:
		Sam
		Will

		--Will
		Subordinates:
			Jackie
			Frank
	Peter
	Michael
```
