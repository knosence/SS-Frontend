// Booleans in Javascript

/**
 * Many of our established pieces of syntax from java work exactly the same in javascript
 * 
 * ... with an interesting exception
 */

if (true) {
    console.log('Print this if true.');
}

if (false) {
    console.log('Print this if true.');
}

if ((3 + 2) * 5 / 2 == 12.5) {
    console.log('Print this if true.');
}

// this prints true...why?
// if (2 == '2') {
//     console.log('Print this if 2 ==\'2\'.')
// }

/**
 * What happens is that JavaScript does something called "coercion" to force values into comparable states when applicable
 * 
 * this can make certain things eaiser, like comparing an input string from a web form to a value stored as a member
 */

if (2 === '2') {
    console.log('Print this if 2 ==\'2\'.')
}

/**
 * JS strict equality operator
 * 
 * this does two things:
 * is 2 == '2'?
 * is typeof 2 == typeof '2'
 */

// booleans are not coerced from strings
if (true == 'true') {
    console.log("Print this if true == 'true");
}

//strict not equals operator is !==
if (true!== 'true') {
    console.log(`Print this if true !== 'true'`);
}

// not operator works just like it does in java
if (true == !false) {
    console.log('Print this if true === !false');
}

// null does == undefined...
if (null == undefined) {
    console.log('Print this if null == undefined');
}

// null does not === undefined...
if (null === undefined) {
    console.log('Print this if null == undefined');
}

console.log();

let testVariable = [];

if (testVariable) {
    console.log(`${testVariable} is true!`);
} else {
    console.log(`${testVariable} is false!`);
}

/**
 * Truthy and falsy
 * 
 * JavaScript processes booleans as you would expect.
 * 
 * BUT, it also safeguards against breaking the app given certain input parameteres by assigning a boolean value to 
 *  just about everything
 * 
 * Falsey Values:
 *  false
 *  0
 *  0.0
 *  0n
 *  -0
 *  ''
 *  undefined
 *  null
 *  !true (or not anything that's truthy)
 *  NaN (not a number)
 * 
 * 
 * Truthy Values
 * 
 * -- anything that's not falsy
 * 
 * true
 * !false
 * any number that isn't some variant of 0
 * '0' -- any string that isn't empty
 * [] -- all arrays, empty or otherwise
 * {} -- all objects, empty or otherwise
 */

/**
 * EXPLICIT CASTING
 * 
 * we can use Number(), String() and Boolean() to explicitly cast values as those types
 */

let five = Number('5');
console.log('5');


/**
 * the ternary operator exists in JS and functions the same as in java
 * 
 * but there is another shorthand which can be useful
 * 
 */

// same syntax -- boolean statement ? if true use this : if false use this
let ternaryValue = ((2 < 4) ? true : false);
console.log(ternaryValue);

// if the first statement evaluates to something truthy, assign that value to the variable
// if not, assign the second value to the variable
let shorthandValue = ((2 - 1) || (2 + 1));

// same thing longhand
let longHandValue = ( ((2 - 1) == true) ? (2 - 1) : (2 + 1))

console.log(shorthandValue);
console.log(longHandValue);

console.log();

function dosage(mgOfCaffeine) {
    // we could do this
    // if (mgOfCaffeine == null)

    //this takes our function - scoped variable mgOfCaffeine and either assigns in the input value if it's truthy or 0 if it's not
    mgOfCaffeine = (mgOfCaffeine || 0);
    console.log(`I'm going to need ${mgOfCaffeine}mg of caffeine for this lecture.`)
}

dosage('300');


function printArray(myArray) {
    myArray = (myArray || [1, 2, 3]);
    for (let i = 0; i < myArray.length; i++) {
        console.log(myArray[i]);
    }

}

printArray([]);