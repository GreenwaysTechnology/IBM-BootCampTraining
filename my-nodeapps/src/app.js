//main program
//express
const express = require('express')
const productRouter = require('./controllers/product.controller')
const customerRouter =require('./controllers/customer.controller')
//create Application object 
const app = express()

//bind router with main app 
app.use('/api/products',productRouter)
app.use('/api/customers',customerRouter)



app.listen(3000, () => {
    console.log('Express App is running!')
})