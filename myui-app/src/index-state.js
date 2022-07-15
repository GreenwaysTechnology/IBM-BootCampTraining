//Props : we can send data from the parent component to child component 
import React, { useState } from "react"
import ReactDOM from "react-dom"

//state pattern
const Counter = () => {

    //declare state variable
    const [count, setCount] = useState(0)

    //listener
    const onIncrement = () => {
        //increment counter 
        setCount((count) => {
            return count + 1
        })
    }
    const onDecrement = () => {
        //increment counter 
        setCount((count) => {
            return count - 1
        })
    }

    return <div>
        <h1>State Pattern-Counter App</h1>
        <h2>Counter : {count}</h2>
        <button onClick={onIncrement} >+</button>
        <button onClick={onDecrement} >-</button>

    </div>

}

const App = () => <Counter />

ReactDOM.render(<App />, document.getElementById('root'))

