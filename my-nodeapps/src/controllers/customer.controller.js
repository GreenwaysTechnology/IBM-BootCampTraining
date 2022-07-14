const express = require('express')
const customerRouter = express.Router()


//customer api 
customerRouter.get('/list', (req, res) => {
    res.status(200).json({
        message: 'customer get is called'
    })
})
customerRouter.post('/save', (req, res) => {
    res.status(200).json({
        message: 'customer post is called'
    })
})
customerRouter.delete('/remove', (req, res) => {
    res.status(200).json({
        message: 'customer delete is called'
    })
})
customerRouter.put('/update', (req, res) => {
    res.status(200).json({
        message: 'customer update is called'
    })
})
module.exports = customerRouter