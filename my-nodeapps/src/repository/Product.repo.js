
class ProductRepository {
    constructor() {
        console.log('ProductRepository')
    }
    findAll() {
        return [
            {
                id: 1,
                name: 'book'
            },
            {
                id: 2,
                name: 'Phone'
            },
            {
                id: 3,
                name: 'TV'
            }
        ]
    }
}
//share this class outside 
module.exports = ProductRepository