//declare an empty array we're going to place our cards into for local use
let deck = [];

// array of objects to pull from
const databaseDeck = [
    {
        name: "Queen Of Spades",
        suit: "Spades",
        color: "Black",
        value: 12,
    },
    {
        name: "Eight of Hearts",
        suit: "Hearts",
        color: "Red",
        value: 8,
    },
    {
        name: "Jack of Diamonds",
        suit: "Diamonds",
        color: "Red",
        value: 11,
    },
    {
        name: "Ace of Clubs",
        suit: "clubs",
        color: "Black",
        value: 1,
    },
    {
        name: "Deuce of Diamonds",
        suit: "Diamonds",
        color: "red",
        value: 2,
    },
];

//function for getting the object from the database
// use a async function when we're dealing with database connections that may take time
const getDatabaseDeck = async () => {
    let localDeck = [...databaseDeck];
    while (localDeck.length !== 0) deck.push(localDeck.shift());
};

// function for displaying the cards on our page
const displayCards = async () => {
    // this line is our "database" operation, so it MUST be awaited
    await getDatabaseDeck();

    // this clears the div before pulling new ones in
    document.getElementById("card-container").innerHTML = "";

    // looping through the cards in our deck
    // for (let i = deck.length - 1; i >= 0; i--) {
    for (let card of deck) {
        // destructuring the card object into individual variables
        const { name, suit, color, value } = card;

        // creating new tags for the section and each line
        const newSection = document.createElement("section");
        const newh1 = document.createElement("h1");
        const newh2 = document.createElement("h2");
        const newh3a = document.createElement("h3");
        const newh3b = document.createElement("h3");

        // adding the values to each field
        newh1.innerText = name;
        newh2.innerText = `Suit: ${suit}`;
        newh3a.innerText = `Color: ${color}`;
        newh3b.innerText = `Value: ${value}`;

        // placing the fields within the section
        newSection.append(newh1, newh2, newh3a, newh3b);

        // placing the section into the container ont the actual page
        const container = document.getElementById("card-container");
        container.appendChild(newSection);
    }
};
