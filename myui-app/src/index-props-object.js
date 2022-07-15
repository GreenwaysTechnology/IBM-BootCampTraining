//Props : we can send data from the parent component to child component 
import React from "react"
import ReactDOM from "react-dom"

const Product = () => {

    return <>
        <ProductDetails product={{
            id: 1,
            name: 'Phone'
        }} reviews={['Good', 'Bad']} />
    </>
}
//Hello - Child Component
const ProductDetails = props => {
    return <div>
        <h1>Id : {props.product.id}</h1>
        <h1>Name : {props.product.name}</h1>
        {/* render */}
        <ul>
            {props.reviews.map(review => {
                return <li>
                    <span>{review}</span>
                </li>
            })}
        </ul>
    </div>
}


const App = () => <Product />

ReactDOM.render(<App />, document.getElementById('root'))

