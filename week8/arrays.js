//ARRAYS IN JAVASCRIPT

/**
 * Arrays in JS behave somewhat differently than arrays in JAVA
 * 
 * -- really a little more like ArrayLists
 * -- No fixed size (can add as many items as you like)
 * -- have many more methods than you might expect
 *  --push/pop, shift/unshift, slice, splice, indexOf)
 * 
 * 
 * -- support some of the things we talked about when dealing with streams (map, reduce, filter, foreach)
 * -- items in arrays in JS do not all have to be the same types!!
 *  -- a signle array can contain a string alongside a number, alongside an object, etc.
 *  
 */

// syntax --> [item1, item2, item3]
let thanksgivingFoods = ['Turkey', 'Sweet Potatoes', 'Stuffing', 'Cranberry Sauce', 'Pumpkin Pie'];

console.log(thanksgivingFoods);

// accessing a specific item by index
console.log(thanksgivingFoods[2]);

// overwriting a specific item by index
thanksgivingFoods[2] = 'stove top stuffing';
console.log(thanksgivingFoods[2]);

// .pop() takes the last item off and returns it
thanksgivingFoods.pop();

console.log(thanksgivingFoods);

// .push() adds an item to the end of the list
thanksgivingFoods.push('Pumpkin Pie');

console.log(thanksgivingFoods);

// .shift() takes the first item off and returns it
thanksgivingFoods.shift();

console.log(thanksgivingFoods);

// .unshift() adds an item to the front of the list
thanksgivingFoods.unshift('Turkey');

console.log(thanksgivingFoods);

// finding an element by value with indexOf
console.log(thanksgivingFoods.indexOf('Cranberry Sauce'));

// using "splice"
// this starts at index 2 and removes 1 item (inclusive of first index)
thanksgivingFoods.splice(2, 1);

console.log(thanksgivingFoods);

//arguments AFTER the number of items to remove are added in place of what was removed
// if second argumnet is 0, nothing is removed, and this is effectively an insert
thanksgivingFoods.splice(2, 0, 'Stuffing', 'Ham', 'Mint Jelly');

console.log(thanksgivingFoods);

let nastyFoods = thanksgivingFoods.splice(3, 2); // returns an array

console.log(thanksgivingFoods);
console.log(nastyFoods);

// slice copies our array's values into a new array in a new location that is distinct from the original array
let tFoods = thanksgivingFoods.slice();
// let tFoods = thanksgivingFoods; -- this would assign the tFoods variable to the same array in the same location

console.log(tFoods);

tFoods.shift();
console.log(tFoods);
console.log(thanksgivingFoods);

// for slice, the first parameter is the index at which to start copying (inclusive), second is the index at which to stop (exclusive)
let tFoods2 = thanksgivingFoods.splice(2, 5);
console.log(tFoods2);

