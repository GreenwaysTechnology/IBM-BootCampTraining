//main program
//express
const express = require('express')
const productRouter = require('./controllers/product.controller')
const customerRouter =require('./controllers/customer.controller')
const employeeRouter =require('./controllers/employee')
// get driver connection
const dbo = require("./db");

//create Application object 
const app = express()

//bind router with main app 
app.use('/api/products',productRouter)
app.use('/api/customers',customerRouter)
app.use('/api/employees',employeeRouter)



// app.listen(3000, () => {
//     console.log('Express App is running!')
// })
app.listen(3000, () => {
    // perform a database connection when server starts
    dbo.connectToServer(function (err) {
        if (err) console.error(err);

    });
    console.log(`Server is running on port: ${3000}`);
});