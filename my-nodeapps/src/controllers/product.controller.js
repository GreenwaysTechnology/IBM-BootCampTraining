//router
const express = require('express')
const ProductRepository = require('../repository/Product.repo')
const ProductService = require('../services/Product.service')

const productRouter = express.Router()
let productRepo = new ProductRepository()
let productService = new ProductService(productRepo)


productRouter.get('/list', (req, res) => {
    res.status(200).json(productService.findAll())
})
productRouter.post('/save', (req, res) => {
    res.status(200).json({
        message: 'post is called'
    })
})
productRouter.delete('/remove', (req, res) => {
    res.status(200).json({
        message: 'delete is called'
    })
})
productRouter.put('/update', (req, res) => {
    res.status(200).json({
        message: 'update is called'
    })
})

module.exports = productRouter;