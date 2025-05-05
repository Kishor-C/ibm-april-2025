# to have a single line comment
"""
 3 quotes for multiple line comments , single or double quotes both are the same
"""
# declararing variables
username = "Atharv"
age = 1
gender = 'M'
print("Hello "+username);
# use f followed by a string to concat mulitple strings with expression
print(f"Hello {username}, your age is {age} and gender is {gender}")
# to concat with + you must convert everything to string using str(variable)
print("Age: "+str(age)+", Gender: "+gender)
# checking types using type function
print(f"Type of age {type(age)}"); # int type
# to take input from the keyboard you have input() that always return str, 
# use int(), float(), bool() to typecast
# username = input("Enter username: ")
# age = int(input("Enter age: "))
# print(f"Entered username is {username}, age is {age}")
# python doesn't use { } for blocks it uses indentation after : 
# if statement & else statement if condition : <<indentation in the next line>>
marks = 80;
if marks >= 75 :
    print("A+");
    print("this is still inside if")
elif marks <= 70 and marks > 60 :
    print("A")
    print("this is inside elif")
else : 
    print("Pass")
# for loop 
for i in range(1, 10):
    print(i);