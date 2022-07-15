import React, { useEffect, useState } from 'react'
import ReactDOM from 'react-dom'


const Todos = () => {
    const [state, setState] = useState({
        error: null,
        isLoaded: false, //spiner status
        todos: [] // data
    })
    //inside useEffect we write webservice call 
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/todos')
            .then(response => response.json())
            .then(todos => {
                setTimeout(() => {
                    setState(prevState => ({ ...prevState, todos: prevState.todos.concat(todos), isLoaded: true }))
                }, 5000)
            })
            .catch(err => {
                setState(prevState => ({ ...prevState, isLoaded: true, error: err }))
            });
    }, [])
  //render code
  const { error, isLoaded, todos } = state;
  if (error) {
      return <Error error={error} />
  } else if (!isLoaded) {
      return <Spinner />
  } else {
      return <div>
          <h1>Todo App</h1>
          <ul>
              {state.todos.map(todo => {
                  return <li key={todo.id}>{todo.title}</li>
              })}
          </ul>
      </div>
  }

}

const Error = props => {
    return <>
        <h2>{props.error}</h2>
    </>
}
const Spinner = props => {
    return <>
        <h2 style={{ backgroundColor: 'yellow' }}>Loading...</h2>
    </>
}
const App = props => <div>
    <h1>REST API Integration</h1>
    <Todos />
</div>

ReactDOM.render(<App />, document.getElementById('root'))