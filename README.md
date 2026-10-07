# Project
Om projektet

Det här är ett enkelt projekt för att hantera information om en student. 

Programmet använder klassen Student för att sparar information om en student, till exempel
förnamn, efternamn, e-postadress, adress och ålder.

Programmet använder scanner för att läsa in information från användaren.

**Funktioner**
Programmet har en enkel meny med följande alternativer: 
1. Add student
2. Show student
3. Search student
4. Update student
5. Add course
6. Add grade
7. Exit

I den nuvarande versionen fokuserar programmet på att skapa och visa information om en student.

Student

Student-klassen innehåller följande information:

First name
Last name
Email
Address
Age

Åldern kontrolleras så att den måste vara mellan 0 och 150 år.

Hur programmet fungerar

När programmet startar skapas ett Student-objekt.

Användaren får sedan välja ett alternativ från menyn. Om användaren väljer att lägga till en student får användaren skriva in studentens förnamn, efternamn, e-postadress, adress och ålder.

Efter att informationen har skrivits in visas studenten med hjälp av toString().

Exempel

Ett exempel på hur programmet kan användas:

1. Add student
2. Show student
3. Search student
4. Update student
5. Add course
6. Add grade
7. Exit

Enter student first name
Anna

Enter student last name
Andersson

Enter student email address
anna.andersson@example.com

Enter student address
Example Street 12

Enter student age
21

Resultatet blir:

Student{firstName='Anna', lastName='Andersson', email='anna.andersson@example.com', address='Example Street 12', age=21}
Teknik

Projektet är skrivet i Java och använder Scanner för att läsa in input från användaren.

Projektet använder grundläggande objektorienterad programmering med en Student-klass, konstruktor, getters, setters och toString().

Projektets mål

Målet med projektet är att träna på grundläggande Java-programmering och objektorienterad programmering.

Projektet utvecklas steg för steg genom att lägga till fler funktioner i menyn.
