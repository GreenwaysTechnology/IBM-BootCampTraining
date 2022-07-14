//express
const express = require('express')
//create Application object 
const app = express()
const ProductRepository = require('./repository/Product.repo')
const ProductService = require('./services/Product.service')


let productRepo = new ProductRepository()
let productService = new ProductService(productRepo)

//using app object , you can start server,write rest api,

//end points 
//HTTP GET 

//product
app.get('/api/products', (req, res) => {
    res.status(200).json(productService.findAll())
})
app.post('/api/products', (req, res) => {
    res.status(200).json({
        message: 'post is called'
    })
})
app.delete('/api/products', (req, res) => {
    res.status(200).json({
        message: 'delete is called'
    })
})
app.put('/api/products', (req, res) => {
    res.status(200).json({
        message: 'update is called'
    })
})

//customer api 
app.get('/api/customers', (req, res) => {
    res.status(200).json(productService.findAll())
})
app.post('/api/customers', (req, res) => {
    res.status(200).json({
        message: 'post is called'
    })
})
app.delete('/api/customers', (req, res) => {
    res.status(200).json({
        message: 'delete is called'
    })
})
app.put('/api/customers', (req, res) => {
    res.status(200).json({
        message: 'update is called'
    })
})

app.listen(3000, () => {
    console.log('Express App is running!')
})