//main
const ProductRepository = require('./repository/Product.repo')
const ProductService = require('./services/Product.service')

function main() {
    let productRepo = new ProductRepository()
    let productService = new ProductService(productRepo)
    productService.findAll().forEach(product => {
        console.log(product.id, product.name)
    })
}
main()