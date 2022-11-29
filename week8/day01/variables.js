var global;

// variable initialization
global = "global";
// can redefine a variable with any type we wish
global = 56;
global = true;

// with var, we can redeclare the same variable
// can't do this in java

console.log(global);
var global = "still global";
console.log(global);

console.log();

// function-scoped variable
function functionScope() {
    var global = 78;
    console.log(global);
}

functionScope();

console.log(global);
console.log();
/**
 * DOWNSIDES TO USING VAR
 *
 * 1. Function -/global-scroping leads to some strange and unpredictable interactions
 * 2. the idea of redeclaring a variable doesn't exist in other languages, so it's a little weird
 */

/**
 * WHAT ARE THE ALTERNATIVES
 *
 * let
 * -- let is similar to var in that I CAN redefine the variable's value
 * -- let x = 10; x = 11; x = 'Joe'; x = true;
 * --  I can NOT redeclare the variable
 * -- let x = 10; let x = 11; -- not allowed!
 *
 *
 * const
 * -- const is similar to final in java
 * -- once I initialize the value, I cannot change it
 * -- if the value is an object, I can change its properties
 *
 */

let firstName = "Susan";
console.log(firstName);
// cannot redelare with let
// let firstName = "Michelle";
firstName = "Machelle";
console.log(firstName);
// can give a new value, even it the new value is a different type
firstName = false;
console.log(firstName);

console.log();
const lastName = "McTevish";
console.log(lastName);

const newPerson = {
    firstName: "Larry",
    lastName: "David",
    age: 73,
    temperment: "Cantankerous",
};

console.log(newPerson);

console.log();
//hoisting and its issues

function hoistingTestVar() {
    console.log(x);
    var x = 10;
    console.log(x);
}

hoistingTestVar();

function hoistingTestLet() {
    let x = 25;
    console.log(x);
}

hoistingTestLet();

console.log();
// various scopes

let y = 10;
console.log(`Before function: ` + y);

function scopes() {
    let y = 20;
    console.log(`Inside function, before block` +y);
    if (true) {
        let y = 30;
        console.log(`Inside block` + y);
    }
    console.log(`Inside function, after block` + y);
}

scopes();

console.log(`After function: ` + y);

