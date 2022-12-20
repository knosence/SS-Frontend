/**
 * Variable and function hoisting
 *  this describes where variables and functions are accessed in the series of code lines
 *
 * functions can be accessed anywhere and are fully hoisted
 *
 */

sayName();
function sayName() {
    console.log("Marvin.");
}

sayName();

//var's declaration is hoisted to the top of the document but isn't initialized until the line of code actually arrives
// true no matter how deep in a block the declaration is

console.log(myVar);

if (true) if (true) if (true) var myVar = 123;

console.log(myVar);

