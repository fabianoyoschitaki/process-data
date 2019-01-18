Process-Data
========

This tool processes a specific text file as input and returns output as specified below.

The input file represents a list of places and people at different times. There are two distinct formats mixed in the same file:

1. Each line starts with F or D.
2. If F, this is a "format" line and two formats can be provided (1 or 2).
3. If D, this is a "data" line whose format is defined by the closest above format line.
4. If "F1" is specified, you can expect these fields separated with a comma:
	a. D defining a data line
	b. Name and surname
	c. City
	d. ID formatted as "12345678Z"
5. If "F2" is specified, you can expect these fields separated with space-semicolon-space:
	a. D defining a data line
	b. Name and surname
	c. City
	d. ID formatted as "12345678-Z"

#### Program setup

Maven and JDK 8+ is necessary to setup this project. 
 * [Apache Maven](https://maven.apache.org/download.cgi)
 * [JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

After you have them installed, clone this repository and run the following command to build a runnable jar: 

```shell
    mvn package
```
