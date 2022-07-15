//Props : we can send data from the parent component to child component 
import React from "react"
import ReactDOM from "react-dom"


//Greeter - Parent 
const Greeter = () => {
    // send data as prop 
    //<> Fragment
    return <>
        <Hello name={"Subramanian"} />
        <Hello name={"Ram"} />
    </>
}
//Hello - Child Component
const Hello = props => {
    return <p>Hello {props.name}</p>
}




const App = () => <Greeter />

ReactDOM.render(<App />, document.getElementById('root'))

