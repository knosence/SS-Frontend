// class Notation

/**
 * There are no actual classes in JavaScript
 * A 'class' is just a suped-up constructor function
 */

class Animal {
    // declare some properties
    name;
    #vertebrate; // private property, we declare the name with a # before it, still can get/set, does not enumerate.

    //static property
    static ALIVE = true; // attaches to the class itselft

    //constructor
    //use the constructor keyword
    // we can only have one constructor in JS, because overloading is not allowed
    constructor(name, vertebrate) {
        this.name = name;
        this.#vertebrate = vertebrate;
    }

    get name() {
        return this.name;
    }

    set name(name) {
        this.name = name;
    }

    get vertebrate() {
        return this.#vertebrate;
    }
    
    set vertebrate(vertebrate) {
        this.#vertebrate = vertebrate;
    }

    //custom methods
    speak() {
        console.log(`Hi, my name is ${this.name}, and I am ${(this.#vertebrate) ? '' : 'not '}a vertebrate.`)
    }
}



class Mammal extends Animal{

    // new properties
    gotMilk;

    // constructor using super() to constructor chain
    constructor(name, vertebrate, gotMilk) {
        super(name, vertebrate);
        this.gotMilk = gotMilk;
    }

    // custom method that overrides the parent's method
    speak() {
        console.log(`It does a body good`)
    }

    //static method that belongs to the Animal class
    static evolve() {
        console.log('From a bacterium I came...')
    }

}

class Dog extends Mammal {

}

class Pug extends Dog {

}

console.log();
console.log(Pug.prototype.__proto__ === Dog.prototype);
console.log(Pug.prototype.__proto__.__proto__ === Mammal.prototype);

/**
 * each constructor function's (class's) prototype inherits from the parent class's prototype
 */

// creating a new Animal
const animal1 = new Animal('Bipples', true);

console.log(animal1);
console.log(animal1.vertebrate); // this uses the getter method with the same syntax as regular variable access
animal1.vertebrate = true;
console.log(animal1.vertebrate);
animal1.speak();

// creating a new Mammal
const mammal1 = new Mammal('Kanga', true, true);
// this uses the overridden version of the speak() method
mammal1.speak();
console.log(mammal1.name);

console.log(mammal1.__proto__ === Mammal.prototype);
console.log(mammal1.__proto__.__proto__ === Animal.prototype);

console.log(Animal.ALIVE);
// Animal.evolve(); // calling a static method