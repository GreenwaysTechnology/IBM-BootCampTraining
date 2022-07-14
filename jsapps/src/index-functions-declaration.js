//functions  declaration syntax:
//named functions
function sayHello() {
    console.log('Hello')
}
//innovcation
sayHello();
//anonmous functions 
/**
 * function itself is value/literal in js .
 * we can store the function into a variable
 * we can pass function as paremeter to another function
 * we can return function from another function  
 */

let a = 10;
let greet = function () {
    console.log('Greet')
};
greet();

// es 6 syntax : arrow functions 
let hai = () => {
    console.log('Greet')
};
hai();

