Process-Data
========

This tool processes a specific text file as input and returns output as specified below.

The input file represents a list of places and people at different times. There are two distinct formats mixed in the same file:

1. Each line starts with F or D.
2. If F, this is a "format" line and two formats can be provided (1 or 2).
3. If D, this is a "data" line whose format is defined by the closest above format line.
4. If "F1" is specified, you can expect these fields separated with a comma:
 * a. D defining a data line
 * b. Name and surname
 * c. City
 * d. ID formatted as "12345678Z"
5. If "F2" is specified, you can expect these fields separated with space-semicolon-space:
 * a. D defining a data line
 * b. Name and surname
 * c. City
 * d. ID formatted as "12345678-Z"

For this project, an interface named Processor was created in order to represent each type of processing (CITY, ID), making it easy to add new future implementations (by NAME for example). 

Also, to support the different types of Processor, a Factory class (Creational Design Pattern) with the creation rules was added.  

Virtually, there's no restriction regarding to the size of the text input file. This is due to the use of BufferedReader class to process the text file at run time, keeping the space complexity of the code constant after a certain point. 

## Setup

Maven and JDK 8+ is necessary to setup this project. 
 * [Apache Maven](https://maven.apache.org/download.cgi)
 * [JDK 8](https://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html)

After you have them installed, clone this repository and run the following command to build a runnable jar: 

```bash
mvn package
```

This command will generate a folder named target containing the runnable JAR process-data.jar.

## Commands supported

1. Will print the list of names and ID's belonging to people that have been in that city:
```bash
java -jar process-data.jar {FILE} CITY {CITY_NAME}
``` 

2. Will print the list of cities that this person has been to (ID format example for input: 12345678Z):
```bash
java -jar process-data.jar {FILE} ID {ID_VALUE} 
``` 

## Output examples

1. The following command must output an unordered unrepeated list of people and IDs that have been to CARTAGENA.
```bash
java -jar process-data.jar input.txt CITY CARTAGENA
```

Expected output:
```
Mitchell Newton,25384390A
Rhonda Hopkins,54315871Z
Alexander Arnold,21743514G
Susan Holland,04810023X
Jake Salazar,38399984N
```

2. The following command must output an unordered unrepeated list of cities that Shelley Payne have been to.
```bash
java -jar process-data.jar input.txt ID 54808168L
```

Expected output:
```
MADRID
BARCELONA
OVIEDO
```

## Input data

```
F1
D Erica Burns,BARCELONA,93654902Y
D Lucy Mcgee,LONDON,51011156P
D Mitchell Newton,SAN FRANCISCO,25384390A
D Margarita Richards,LAS VEGAS,09877359D
D Rhonda Hopkins,SAN FRANCISCO,54315871Z
D Antonia Harper,LAS VEGAS,27466628M
D Hilda Caldwell,LONDON,61682270L
D Alexander Arnold,SAN FRANCISCO,21743514G
D Cheryl Hawkins,LAS VEGAS,76878166E
D Renee Anderson,BARCELONA,44340637H
F2
D Mitchell Newton ; LAS VEGAS ; 25384390-A
D Margarita Richards ; NEW YORK ; 09877359-D
D Rhonda Hopkins ; BARCELONA ; 54315871-Z
D Taylor Matthews ; LISBOA ; 58202263-G
D Shelley Payne ; MADRID ; 54808168-L
D Johnathan Cooper ; PARIS ; 10863096-N
F1
D Lowell Miles,BARCELONA,04217040J
D Russell Pope,BARCELONA,69429384C
D Shelley Payne,BARCELONA,54808168L
D Johnathan Cooper,BARCELONA,10863096N
D Myra Maldonado,LAS VEGAS,32445934H
D Irene Owen,LONDON,15015516N
D Susan Holland,SAN FRANCISCO,04810023X
D Rodolfo West,LAS VEGAS,74176315G
D Peter Daniel,BARCELONA,58204706D
F2
D Russell Pope ; CARTAGENA ; 69429384-C
D Shelley Payne ; OVIEDO ; 54808168-L
D Johnathan Cooper ; SANTANDER ; 10863096-N
D Myra Maldonado ; MARSELLA ; 32445934-H
D Glenn Bryan ; LISBON ; 90844421-X
D Neal Love ; SEVILLA ; 52498689-Q
D Taylor Matthews ; LONDRES ; 58202263-G
F1
D Marta Mendez,LAS VEGAS,17200667W
D Glenn Bryan,LAS VEGAS,90844421X
D Neal Love,LAS VEGAS,52498689Q
D Taylor Matthews,LAS VEGAS,58202263G
D Tommie Lindsey,LAS VEGAS,12020245P
D Ruben Daniels,BARCELONA,84604786E
D Emilio Warner,BARCELONA,23803975X
D Mark Quinn,LAS VEGAS,82098573G
D Dwight Roy,LONDON,87179151C
D Jake Salazar,SAN FRANCISCO,38399984N
D Edna Soto,LAS VEGAS,66991455E
```