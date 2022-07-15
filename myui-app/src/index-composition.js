import React from "react"
import ReactDOM from "react-dom"
//component compostion
//The complex ui is broken into smaller and smaller 

/**
 * Layout(Page)
 *   -header
 *   -body 
 *   -footer
 */
const Header = () => {
    return <header>
        <h1>Header</h1>
    </header>
}
const Body = () => {
    return <div>
        <section>
            <p>This is section</p>
        </section>
        <section>
            <p>This is section</p>
        </section>  <section>
            <p>This is section</p>
        </section>  <section>
            <p>This is section</p>
        </section>  <section>
            <p>This is section</p>
        </section>  <section>
            <p>This is section</p>
        </section>  <section>
            <p>This is section</p>
        </section>
    </div>
}
const Footer = () => {
    return <footer>
        <h5>This is footer</h5>
    </footer>
}
const Page = () => {
    return <div>
        <Header />
        <Body />
        <Footer />
    </div>
}
const App = () => <Page />

ReactDOM.render(<App />, document.getElementById('root'))