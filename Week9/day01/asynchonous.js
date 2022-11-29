// Asynchronous operations

// In JS, we have the even loop, to deal with later.
// But, we may want things to happen after certain amounts of time of at certain intervals

// We can use setTimeout and setInterval for these

// setTimeoutout takes two parameters -- a function to execute, and a time delay in milliseconds
// setInterval is the same, but the function will execute Every (time amount)

// this happens first
console.log("First Action");

let x = 10;

//this is sent second, but happens last
setTimeout(() => {
    console.log("Second Action");
    x = 20;
}, 2000); // 2000ms == 2s

// this is set third but happens before the second action's timeout elapses
console.log("Third Action");

// this is set last but it's first occurrence is before the section action's timeout elapses

// setInterval(() => {
//     if (counter > 4)
//         return;
//         console.log('Fourth Action');
//         console.log(x);
// }, 1000);

for (let i = 0; i < 5; i++) {
    setTimeout(() => {
        console.log("Fourth Action");
        console.log(x++);
    }, ((i+1)*1000));
}
