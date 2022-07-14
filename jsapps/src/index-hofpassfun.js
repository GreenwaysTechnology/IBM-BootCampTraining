//Higher order functions 

function sayHello(callback) {
    callback('hello')
}
//passing lnline anonmous function 
sayHello(function (message = "") {
    console.log(message)
})
let hello = function (message = "") {
    console.log(message)
}
sayHello(hello)
/////////////////////////////////////////////////////////////////////////////

let sayGreet = function (callback) {
    callback('greet')
}
sayGreet(function (message) {
    console.log(message)
})
///////////////////////////////////////////////////////////////////////////////

let login = (username, password, resolve, reject) => {
    if (username === 'admin' && password === 'admin') {
        resolve('Login success')
    } else {
        reject('Login Failed')
    }
}

login('admin', 'admin', (status) => {
    console.log(status)
}, (err) => {
    console.log(err)
})
login('ddd', 'dddd', (status) => {
    console.log(status)
}, (err) => {
    console.log(err)
})





