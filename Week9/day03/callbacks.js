// Callback basics

/**
 * A callback is a function that doesn't execute immediately but goes off into the event loop to be dealt with later
 */

function sayHello() {
    console.log('Hello.');
}

function sayHi() {
    console.log(`Hi.`)
}

// setTimeout(() => {
//     sayHello();
// }, 2000);

// setInterval(sayHi, 1000);

// this timeout, even though it has a 0 delay time, gets sent into the even loop for callbacks/async operations
// the event loop has lower priority than inline code
setTimeout(sayHello, 0);

console.log("I'm waiting...");

while(true) {

}