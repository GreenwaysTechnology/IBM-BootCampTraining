//arrays

let list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
list.forEach(item => {
    console.log(item)
})
//list of employees
let empList = [
    {
        id: 1,
        name: 'A',
        salary: 1000
    },
    {
        id: 2,
        name: 'B',
        salary: 400
    },
    {
        id: 3,
        name: 'C',
        salary: 1900
    }

]
empList.forEach(employee => {
    console.log(employee.id, employee.name, employee.salary)
})