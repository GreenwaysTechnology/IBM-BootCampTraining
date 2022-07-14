//params and args ,return

//default args 
function add(a = 0, b = 0) {
    return a + b
}
console.log(add(1, 2))
console.log(add())

let substract = function (a = 0, b = 0) {
    return a - b
}
console.log(substract(1, 10))

let multiply = (a = 0, b = 0) => {
    return a * b
}
console.log(multiply(10, 10))
//reduce code : if function has only one statement - a * b , remove { } and return 
multiply = (a = 0, b = 0) => a * b
console.log(multiply(10, 10))