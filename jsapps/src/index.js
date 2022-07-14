let isValid = true;

let a = 10;
let b = 20;
let isBig = a > b

if (isValid) {
    console.log('valid')
} else {
    console.log('invalid')
}
if (isBig) {
    console.log('Big')
} else {
    console.log('Not Big')
}
/**
 * In javascript everthing is true expect the following values
 * 
 * 1.boolean false 
 * 2.empty string "" ,''
 * 3.0
 * 4.undfined
 * 5.NaN
 * 6.null
 */

let firstName = "Subramanian"
if (firstName) {
    //truthy block
    console.log('Welcome ')
} else {
    //falsy block
    console.log('Good bye ')
}
let price = 0
if (price) {
    //truthy block
    console.log('Price ')
} else {
    //falsy block
    console.log('Good bye ')
}
price=undefined
if (price) {
    //truthy block
    console.log('Price ')
} else {
    //falsy block
    console.log('Good bye ')
}

price *10
if (price) {
    //truthy block
    console.log('Price ')
} else {
    //falsy block
    console.log('Good bye ')
}