function sum(a = 2, b = 3) {
    console.log(a);
    console.log(b);
    return a + b;
}

console.log(sum());
console.log(sum(6));

console.log();

// lets's create a function for rectangluar area
// height times width
function area(height, width = height) {
    return height * width;
}

console.log(area(4));