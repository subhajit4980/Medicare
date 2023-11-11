import React from 'react'
import { Link } from 'react-router-dom'
import Navbar from '../Components/Navbar/Navbar'
import Footer from '../Components/Footer/Footer'

const Error = () => {
    return (
        <React.Fragment>
            <Navbar />
            <h2>Can't Find this Page</h2>
            <p>Go To <Link to="/"> Home Page</Link></p>
            <Footer />
        </React.Fragment>
    )
}

export default Error