
class ProductService {
    constructor(productRepo) {
        console.log('ProductService')
        this.productRepo = productRepo
    }
    findAll() {
       return this.productRepo.findAll()
    }
}
module.exports = ProductService