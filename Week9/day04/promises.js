/**
 * What is a Promise?
 *
 * Representatively, it is a promise that some sort of data will eventually come back
 *
 * It is a specific type of object
 * - it contains the data as well as a status
 *
 * Statuses A promise can have:
 *  -Pending -- meaning it has not yet been rejected or ful filled
 *  - fulfilled (resolved) -- everything went according to plan
 *  - Reject -- something bad happened, and we didn't get what we expected
 *
 */

// A function that creates and returns a Promise

function createPromise(message, sender) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (sender === "Jon") {
                reject(`jon's not on the list.. sorry!`);
            }
            resolve(message);
        }, 2000);
    });
};


//this runs the function, creates a promise
// we use the .then() function to unpack the fulfilled promise data
// if the promise is rejected, we need .catch() to unpack the rejected promise data
// or we're going to throw an exception.
createPromise('Yay! Promise fulfilled!', 'Jon')
    .then((data) => console.log(data)) // then() takes in a function describing what we're going to do with the data
    .catch((error) => console.log(error)); // same with .catch()

console.log();

const promiseToChain = createPromise('This is a promise chain.', 'Wilhamina');

promiseToChain
    .then(message => {
        console.log(message);
        // Equivalent to resolving the promise and packing in the new message as its data
        // Promise.resolve(message + "Here's the second link.")
        return message + ` Here's the second link.`
    })
    .then(message => {
        console.log(message);
        return message + ` And here's the third link.`
    })
    .then(message => {
        console.log(message);
        // this is equivalent to rejecting the promise and packing in the error message as its data
        throw 'PROMISE REJECTED!!'
    })
    .catch((error) => console.log(error));