// /**
//  * Async and Await
//  * 
//  * These were added to js to expand on Promises and make them easier/more readable
//  * 
//  * The whole then/catch syntax can be a little nutty in more complex situations
//  * 
//  * with async/await, we can write code that looks a little more like our regular synchronous code
//  * 
//  * Synchronous code -- code that executes line by line
//  * Asynchronous code -- any code that uses callbacks to execute something at a later point in time
//  * js is single-threaded -- it can only execute one thing at a time
//  * -- even thought we can send things off to the side to be executed late, they still wait for an opening in the main stack
//  */

// // to create an async function, just tack the keyword async onto the beginning
// async function myAsyncFunction() {
//     console.log('Welcome to the United States of Asyncmerica');
//     return "What do I return?"; // an async function returns a promise, either fulfilled or rejected
// }

// console.log(myAsyncFunction());

// const myReturnedPromise = myAsyncFunction();

// myReturnedPromise.then((data) => console.log(data)).catch((error) => console.log(error));

// console.log();

// // the await keyword
// // the await keyword only works inside of an async function

// // cannot call await inside of a non async function
// // function syncFuntion() {
// //     await myAsyncFunction();
// // }

// const dealWithPromise = async () => {
//     const data1 = await myAsyncFunction(); // here, we wait until this is done before moving on
//     const data2 = await myAsyncFunction(); // this code doesn't execute until the previous line returns its promise
//     console.log(data1); // this code doesn't execute either until the previous line returns its promise
//     console.log(data2); // this one proceeds normally
// }

// dealWithPromise();

// console.log();

// // create a function that returns a promise after a certain period of time
// function myTimedOutAsyncFunction(param) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             if (param === 0)
//                 resolve('We came, we waited, we conquered.');
//             else 
//                 reject('We failed')
//         }, 2000)

//     })
// }

// // create a function that requires waiting for the previous one
// async function waitForPromise() {
//     const data1 = await myTimedOutAsyncFunction(1).catch((error) => error);
//     console.log(data1);
// }

// waitForPromise();

// async function validateInput(input) {
//     if (input === 'YES') {
//         return `Let's go to Mars!`;
//     } else if (input === 'MAYBE') {
//         return `I'll get back to you.`;
//     } else {
//         throw 'take it easy, Elon.';
//     }
// }

// async function instantRejection() {
//     throw 'Yer out!';
// }

// /**
//  * same as this:
//  * 
//  * async function testValidation() {}
//  */

// const testValidation = async() => {
//     try {
//         const yes = await validateInput('YES');
//         console.log(yes);
//         const rejection = await instantRejection();
//         console.log(rejection);
//         const maybe = await validateInput('MAYBE');
//         console.log(maybe);
//         const no = await validateInput('NO');
//         console.log(no);
//     } catch (error){
//         console.log('Our validation failed...');
//         console.log(error);
//     }
// }

// testValidation();


// // mini-review
// // new Promises take in a function with two parameters -- resolve, reject
// const newestPromise = new Promise((resolve, reject) => {
//     let x = 5;
//     if (x === 6) 
//         resolve('Resolved!');
//     else 
//         reject('Rejected!');

// })

async function checkForOddSum(num1, num2) {
    if ((num1 + num2) % 2 !== 1)
        throw 'Rejected -- This is an even number';
    else
        return 'Fulfilled -- This is an odd number!';
}

checkForOddSum(4, 3)
    .then(data => console.log(data))
    .catch(error => console.log(error));