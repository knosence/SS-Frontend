/**
 * Objects in Javascripts
 * 
 * objects in JS are a little more lightweight than in Java, BUT they are a bit more flexible
 * 
 * we create an object using the curly braces -- {}
 * -- within the object we have properties listed out in key/value pairs
 * -- can think of this like a little internal HashMap of sorts
 * 
 * Syntax:
 * {
 *  key: value,
 *  otherKey: otherValue
 * }
 * 
 * commas are required between key/value pairs, but not after the last one
 * 
 */

const artist = {
    name: 'Mozart',
    genre: 'Classical',
    birthYear: 1756,
    alive: false
}

console.log(artist);

console.log();

// cannot do this, because artist is a coonst
//artist = {};

// but can change a properties
artist.name = 'Wolfgang Amadeus Mozart';
console.log(artist);

console.log(artist.parents);

artist.wigSize = 'X-Large';
console.log(artist);

console.log();

const artistRevised = {
    name: {
        first: 'Wolfgang',
        middle: 'Amadeus',
        last: 'Mozart'
    },
    genre: 'Classical',
    birthYear: 1756,
    alive: false,
    greatWorks: ['Fantasia', 'The Marriage Of Figaro', 'Requiem', 'The magic Flute']
}

console.log(artistRevised);
console.log(artistRevised.name.first);
console.log(artistRevised.greatWorks[1]);