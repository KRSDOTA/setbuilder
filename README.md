# Overview

Simple webapp designed to take a request consisting of terms belonging to a set of grammar, translating to set builder notation.

I'll need to put some thought into exactly what grammar set will be valid.  
I suspect It'll need to be context depedent as well. Seeing as it doesn't make sense
to say specify:

for all greater than x 4. 

When this should cleary be: 

for all x greater than 4 and less than 10. 

I'll need to study what valid forms setbuilder notation takes as well. More specifically
what consists of valid sentences in plain english, such as:

- for all x such that x is an element of the real set and lies between the closed interval 100 and 1000
- for all x such that x is an element of the real set and is greater than or equal to 100 and less than or equal to 1000
- every x, given x is a member of the real set and satisfies the following inequality 100 <= x <= 1000 

Each one of the above statements is in effect the same thing and should result in the following outputted set builder notation:

`{ x ϵ R | 100 <= x <= 1000 }`

I need to look more into the differences between context specific and context-free grammars.

