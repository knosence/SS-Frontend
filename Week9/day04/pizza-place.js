// sean's pizza place (tm)

/**
 * We want to be able to take an order an validate it
 * we want to be able to prep the order
 * we want to be able to box up the order
 * we want to be able to deliver the order
 */

const myOrder = {
    name: "Tor Morton",
    cardNumber: "5555-5555-5555-5555",
    address: "123 wallaby way, Sydney",
    orderDetails: [
        "Pineapple Pizza (with implied ham)",
        "10 Buffalo Wings",
        "Dr. Pepper",
        "Twix brownies",
    ],
};

// function for placing the order and validating the fields
// destructuring the incoming order object
const placeOrder = ({ name, cardNumber, address, orderDetails }) => {
    if (
        name == null ||
        cardNumber.length !== 19 ||
        address == null ||
        orderDetails == null ||
        orderDetails.length === 0
    )
        return Promise.reject("This is not a valid order."); // this wraps whatever data into a new promise
    return Promise.resolve(`Than you, ${name}, your order has been placed!`);
};

// function for preparing the order
const prepOrder = (orderDetails) => {
    for (let item of orderDetails) {
        console.log(`now making: ${item}`);
    }
};

// function for boxing up the order
const boxOrder = (orderDetails) => {
    let numberOfAvailableBoxes = 4;
    if (orderDetails.length > numberOfAvailableBoxes)
        return Promise.reject(`We don't have enough boxes on hand. Sorry!`);

    return Promise.resolve(
        `Order Boxed! ${
            numberOfAvailableBoxes - orderDetails.length
        } remaining.`
    );
};

// function for delivering the order
const deliverOrder = (order) => {
    if(order.address.length > 30) 
        return Promise.reject(`Address too long to deal with.`);
    return Promise.resolve(`Enjoy your ${order.orderDetails[0]}!`)
}

placeOrder(myOrder)
    .then(() => prepOrder(myOrder.orderDetails)) // this neither resolves nor rejects the promise, just passes it on
    .then(() => boxOrder(myOrder.orderDetails))
    .then(() => deliverOrder(myOrder))
    .then((data) => console.log(data))
    .catch((error) => console.log(error));
