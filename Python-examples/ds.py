# datastructures - list, set, tuple, dictionary
fruits = ["apple", "mango", "orange"] #list
gender =  ("male", "female") #tuples can't be modified
items = {"laptop", "tv", "carrom"} #set doesn't support duplicates
employee = {"id":100, "name":"Alex"} #dictionary
print(fruits);
print(gender);
print(items);
print(employee);
# functions in the list - append(), pop(), insert(), remove(), clear()
fruits.append("watermelon"); # fruits.insert(0, "watermelon")
print(fruits);
# iterating the items
for item in items:
    print(item);
    for c in item:
        print(c);
# creating a function def functionName() : 
name = "Alex";
def printName() :
    global name; 
    name = "Guest";
    print(name)

printName();
# print name outside the printName
print("Name = "+name); 
# write programs to understand while, operators, functions, datatypes, classes & object
# intermediate - reading & writing the files
# some programs to manipulate the list, set & dictionary