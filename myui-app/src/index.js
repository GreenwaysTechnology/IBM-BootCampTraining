import React, { useEffect } from 'react'
import ReactDOM from "react-dom"
import { BrowserRouter, Routes, Route, Link, Outlet } from 'react-router-dom';

const Layout = () => {
    // menus
    return <div><nav>
        <ul>
            <li>
                <Link to="/">Home</Link>
            </li>
            <li>
                <Link to="/about">About</Link>
            </li>
            <li>
                <Link to="/dashboard">Dashboard</Link>
            </li>
            <li>
                <Link to="/transcations">Transactions</Link>
            </li>

        </ul>
    </nav>
        <hr />

        {/* An <Outlet> renders whatever child route is currently active,
        so you can think about this <Outlet> as a placeholder for
        the child routes we defined above. */}
        <Outlet />
    </div>
}

const Home = () => <h1>IBM-home</h1>
const About = () => <h1>IBM-about</h1>
const Dashboard = () => <h1>IBM-dashboard</h1>
const Transactions = () => <h1>TransactionPage</h1>

const App = () => {

    return <BrowserRouter>
        <Routes>
            {/* root route */}
            <Route path="/" element={<Layout />}>
                {/* Child routes */}
                <Route index element={<Home />} />
                <Route path="about" element={<About />} />
                <Route path="dashboard" element={<Dashboard />} />
                <Route path="transcations" element={<Transactions />} />
            </Route>
        </Routes>
    </BrowserRouter>
}

ReactDOM.render(<App />, document.getElementById('root'))