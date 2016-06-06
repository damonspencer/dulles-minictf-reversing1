# dulles-minictf-reversing1
simple reversing problem
writeup: 
tl;dr the solution to the problem is is thisisthesolution1234 and the flag you get is minictf{gnisrever_ev0l_I}

There are many ways to solve this, but the two I can think of off of the top of my head are:
*open up the file in a hex editor and look for the flag
*guess a bit
the first one is self explanatory and is what most people did, so we will focus on the second one:


first, attempt to solve it. it says this isn't the solution. Type in "thisisthesolution" and you will get another hint. You could also type in "thisisthe" giving you another hint leading you to the previously mentioned hint.
next, it will tell you to "change that 'o'", so change the 'o' to a zero and you will get the next hint.
Finally, it asks for a horrible four digit password, guess 1234 and get the flag: minictf{gnisrever_ev0l_I}
