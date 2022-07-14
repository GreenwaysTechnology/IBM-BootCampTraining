//objects 
//constructors
function Employee(id = 0, name = '', salary = 0) {
    //instance variables
    this.id = id
    this.name = name
    this.salary = salary
    //instance methods
    this.calculate = function (noofDays = 0) {
        return this.salary * noofDays
    }
}
//object creation
let emp = new Employee(1, 'Subramanian', 10000)
console.log(emp.id, emp.name, emp.salary, emp.calculate(8))
//es 6 syntax
class Customer {
    //instance variables
    constructor(id = 0, name = '', invoice = 0) {
        this.id = id
        this.name = name
        this.invoice = invoice
    }
    //instance methods
    calculate(qty = 0) {
        return this.invoice * qty
    }
}
let customer = new Customer(1, 'Subramanian', 18)
console.log(customer.id, customer.name, customer.invoice, customer.calculate(8))
