// loops in javascript

/**
 * Most loops work exactly how you would expect them to from a java background
 * 
 * with some exceptions re: the enhanced for loop
 */

// while loop
console.log(`While loop:`)

let i = 0;
while (i < 5) {
    console.log(i);
    i++;
}

console.log();
console.log(`Do-While loop:`)

// do-while loop
do {
    console.log(i);
} while (++i < 10);

console.log();
console.log(`For loop:`)

// for loop
for(let j = 0; j < 5; j++) {
    console.log(i + j);
}

let veggiesBytes = ['GPU', 'RAM', 'Carrot Processing Unit', 'brussels Sprouts', 'Green Onions'];

// // Java Syntax
// for (String veggiesByte : veggiesBytes) {
//     console.log(veggiesByte);
// }

/**
 * The "for of" and "for in" loops
 * 
 * JavaScript seperates things into iterables and enumerables
 * 
 * Iterables Include:
 * Arrays -- Specifically the items within arrays
 * Iterators
 * 
 * Enumerables Include:
 * Arrays indices
 * Properties within an object
 */

//Js Versions
// this uses enumerables -- for in
// in this case, it will print the array indices
for (let veggiesByte in veggiesBytes) {
    console.log(veggiesByte);
}

// this uses iterables -- for of
// in this case, it will print the array items
for (let veggiesByte of veggiesBytes) {
    console.log(veggiesByte);
}

// With objects
const person = {
    head: 1,
    hands: 2,
    fingers: 10,
    toes: 10,
    hairs: 5000000n,
    heartChambers: 4
}

// must use for in, because person is an object, which is not enumerable
for (let bodyPart in person) {
    // this prints the "keys" for each perperty, not the value
    // console.log(bodypart);
    console.log(`key: ${bodyPart} and Value: ${person[bodyPart]}`);
}

let myString = 'Everyone loves enumerables!';

// to print the char values
for (let char of myString) {
    console.log(char);
}

for (let index in myString) {
    console.log(index);
}