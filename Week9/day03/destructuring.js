// Destructuring objects and arrays in javascript

/**
 * What does this mean?
 * 
 * Sometimes, we want to access properties from an individual variables
 * - sometimes, we may want to use those properties as properties in a new object
 * 
 * Sometimes, we may want to collate several properties/ variables into an object/array
 * 
 * we may not want to do this one at a time (or use a loop)
 */

//Spead operator

let plane = {
    manufacturer: 'Boeing',
    model: '747',
    capacity: 450
}

// if we do this, otherPlain points to the same spot in memory as plane
// let otherPlane = plane;

// When we change the properties of one, we change it for the other
// otherPlane.model = '777';
// console.log(plain.model);

//we can use the spread operator to "spread out" the properties of an object into individual items
//we can "destructure" the object into its parts

const otherPlane = {...plane};

console.log(plane);
console.log(otherPlane);

console.log();

otherPlane.model = '777';
console.log(plane);
console.log(otherPlane);

console.log();

const thirdPlane = {...plane, material: 'Aluminum', launchDate: 'may 2022'};

console.log(thirdPlane);

const fourthPlane = {...thirdPlane};

console.log(fourthPlane);

console.log(fourthPlane.prototype === plane.prototype);
console.log(plane.prototype === fourthPlane.__proto__);
console.log(thirdPlane.__proto__ === Object.prototype);

//we can also use spread to destructure any array
// a string is an array, easy to see the destruturing
const myString = 'abcde';
const myStringArray = [...myString];

console.log(myStringArray);

const coins = ['Quarter', 'Dime', 'Nickel', 'Penny'];
const newCoins = [...coins];
console.log(coins);
console.log(newCoins);

// adding to one array does not affect the other
newCoins.unshift('Half Dollar');

console.log(coins);
console.log(newCoins);

console.log();

// REST operator
// looks just like the spread operator -- ... -- but does the opposite
// it takes a series of items and groups them together into an array

function collectNames(first, second, third, ...waitList) {
    console.log('People who must perform a Dance Number On-Camera tomorrow!')
    console.log(`First = ${first}`);
    console.log(`Second = ${second}`);
    console.log(`Third = ${third}`);
    console.log(`WaitList = ${waitList}`);
}

collectNames('Edwin', 'Brian', 'Dylan', 'Tor', 'Chris?', 'Jordan', 'Snuffelugaus', 'Casper');

console.log();
// destructuring into variables as opposed to other objects/arrays

const planet = {
    name: 'Saturn',
    madeOf: 'Gas',
    orbitNumber: 6
}

console.log(planet.name);

console.log();

// this takes the properties with matching names and creates variables for them
// new variable MUST have the same names as the properties, or they'll end up undefined
const {name, madeOf, orbitNumber} = planet;

console.log(name);
console.log(madeOf);
console.log(orbitNumber);

// destructuring an input parameter object

const candidate = {
    name: 'Barney',
    age: 52,
    field: 'Botany',
    skills: {
        skillOne: 'Planting',
        skillTwo: 'Semi-Green Thumb',
        SkillThree: 'Herbicide'
    }
}

function logCandidate({name, age, field, skills}) {
    const {skillOne, skillTwo, skillThree} = skills;
    console.log(`Name = ${name}`);
    console.log(`Age = ${age}`);
    console.log(`Field = ${field}`);
    console.log(`Skill 1 = ${skillOne}`);
    console.log(`Skill 2 = ${skillTwo}`);
    console.log(`Skill 3 = ${skillThree}`);
    
}

// console.log(candidate);
logCandidate(candidate);

//Destructing Arrays Into variables
const trees = ['Pine', 'Fir', 'Apple', 'Dogwood', 'Burch' ];

console.log(trees);

//this assigns variable names in order, a = 'Pine' and so forth
const [a, b, c, d, e] = trees;

console.log(c);

// this assigns the first two to these variable names
const [f,g] = trees;

// what if I only want the last two?
// leave empty spaces, separated by commas, to skip indices
const[, , , h, i,] = trees;

console.log(h);

// can use the rest operator to group array items into one new array
const [j, k, ...l] = trees;

console.log(j, k, l);

// in all of these cases, the variable and/or arrays/objects created are distinct from their sources