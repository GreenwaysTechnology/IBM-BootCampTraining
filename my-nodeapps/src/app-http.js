const http = require('http')
const ProductRepository = require('./repository/Product.repo')
const ProductService = require('./services/Product.service')


//there are steps available in node
//1.create server 
// const server = http.createServer((req, res) => {
//     //request processing logic
//     res.end('Hello')

// })
const server = http.createServer((req, res) => {
    //request processing logic
    let productRepo = new ProductRepository()
    let productService = new ProductService(productRepo)
    const products = JSON.stringify(productService.findAll())
    //set header
    res.writeHead(200,{
        'Content-Type': 'application/json'
    })
    res.end(products)

})

//2.start server
server.listen(3000, () => {
    console.log('Node HTTP server is Running!')
})