import React from 'react' //const React = require('react')
import ReactDOM from 'react-dom'

//declare component
/**
 * components can be delcared in three ways 
 * 1.variables pattern
 * 2.function pattern
 * 3.class pattern
 */
//using class
class Greeter extends React.Component {
    render() {
        return <div>
            <h1>Hello</h1>
        </div>
    }

}

ReactDOM.render(<Greeter />, document.getElementById('root'))