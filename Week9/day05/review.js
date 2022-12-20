// constructor function
// allow us to create a "type" of object and then use that "type" to create instanes

function Parrot(name, age, crackerPreference) {
    this.name = name;
    this.age = age;
    this.crackerPreference = crackerPreference;
}

// Create one uing the new key workd

const polly = new Parrot('Polly', 75, 'Saltines');
console.log(polly);

polly.name = 'Polly-o';
console.log(polly);
polly.color = 'blue';
console.log(polly);
delete polly.color;
console.log(polly);
polly.name = 'polly';
console.log(polly);

const paul = new Parrot('Paul', 30, 'Triscuits');
console.log(paul);

//PROTOTYPES
// each constructor function has a prototype which is the template for all objects created with that function

Parrot.prototype.color = 'Blue';
paul.color = 'Red';
console.log(polly.color);
console.log(paul.color);

const zulmak = new Parrot('Zulmak', 554, 'Human Skulls');
console.log(zulmak.color);

Parrot.prototype.name = 'Generic Parrot';

const undefinedParrot = new Parrot(undefined, 12, 'Cheez-Its');
console.log(undefinedParrot);

//The function has a .prototupe property
// Each instance has a .__proto__ property, which points to the function's .prototype property (which is an object)
console.log(Parrot.prototype === polly.__proto__);

polly.__proto__.eat = () => console.log(`Mmmm! love these ${this.crackerPreference}!`);

paul.eat();

//static properties and methods
Parrot.AVIAN_STATUS = true;
Parrot.molt = () => console.log('No Feathers left...');

//these MUST be called directly on the object and not an instance
// in java, we can call static properties/methods on instance, even though it's not proper
// in js, we cannot
console.log(Parrot.AVIAN_STATUS);
Parrot.molt();