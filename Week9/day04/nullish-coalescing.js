// nullish coalescing operator = ??

// to shorthand choose between two values
// uses first value if truthy; otherwise the second value

//two-point-five annoying things:
// 1. You have to select th values on truthy-falsiness alone -- workaround = ternary operator
// 2. I cant use the priority value if its falsey, even if I might want to
// 2.5 you may get a falsy value 2 back, which is partially unexpected.
const myConst1 = '123' || 456;

console.log(myConst1);

// NCO = ??

// the nullish coalescing operator checks if the value on the left is null or undifined
// if so, it uses the one on the right
// otherwise, it uses the one on the left, even if it is falsy
const myConst2 = 0 ?? 123;

console.log(myConst2)