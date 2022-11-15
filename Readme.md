<h1>CSC-254-01-Fall-2022 Homework 10</h1>
This project is an assignment in the CSC 254 class offered by <a href="https://www.missouriwestern.edu/">Missouri Western State University</a>. Some wording has been modified from the original assignment, to make instructions clearer.

Given the file [states.csv](states.csv), output the following information about the states:


    name:String -- The name of the state is in column 
    nickname:String -- This is the nickname of the state.  Some states have more than one nickname.  If there is more than one nickname, then the different names are separated by "#".  I found the last nickname to be the most interesting.  So if a state has multiple nicknames, only keep the [nicknames.length-1] name.  Be sure to trim() it to get rid of leading and trailing blank spaces.
    admissionDate:LocalDate -- You will need to read it in and then convert it to a LocalDate.
    capital:String
    population:int
    flag:String  This is a url where the flag may be viewed.
The file is "tab delimited"  The field separator is "\t"  Valid rows have exactly 6 fields.   You should skip any row that does not have exactly 6 fields.

Your program should read each line of the file.  It should print the lines that have valid data (that is lines that have 6 fields).