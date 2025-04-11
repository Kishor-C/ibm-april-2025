class Employee {
    id : number;
    name : string;
    dob : Date;
    constructor(id : number, name : string, dob : Date) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    // function inside class must not use function keyword
    display() : string {
        return `Employee[id = ${this.id}, name = ${this.name}, dob = ${this.dob}]`;
    }
}

// object creation in javascript / typescript syntax is same, but in typescript you provide type
let emp : Employee; // stores single object
let employees : Employee[]; // stores array of employee object

// storing single object, javascript can also use new keyword with constructor to create object
// emp = { id : 1, name : "Raj", dob : new Date("2001-10-25") } this is also correct
emp = new Employee(100, "Raj", new Date("2001-10-25"));
employees = [
    new Employee(200, "Atharav", new Date("2024-08-04")),
    new Employee(300, "Siddharth", new Date("2022-08-05"))
]
//printing a single employee
console.log(emp.display());
// iterate the employees and print the item


// function greet(name : string ) : void { 
//     console.log("Hello "+name);
//     console.log(`Hello ${name}`);
//     console.log("_______________________");
// }
// greet("Kishor");
// greet("Atharva");
// //greet(250);
