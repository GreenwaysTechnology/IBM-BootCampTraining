/**
 * 
 * @returns 
 * if inner function access outter function variables, then it becomes closure
 */
// function counter() {
//     let counter = 0
//     return function () {
//         return counter++
//     }
// }
const counter = () => {
    let counter = 0
    return () => counter++
}
const myfun = counter()
console.log(myfun())
console.log(myfun())
console.log(myfun())