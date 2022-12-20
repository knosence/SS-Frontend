// an environment is an object
// it contains key/value pairs for data you need across your side
// this is baked in when the project is built or served
export const environment = {
    production: true,
    // this is a property we can grab like any other object prop
    envTestVariable: 'We are in production',
    apiURL: 'https://thecocktaildb.com/api/json/v1/1/'
}