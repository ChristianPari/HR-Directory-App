import React from "react";

// components
import Navigation from './Navigation'
import User from './User'
import Heading from './Heading'

export default function NavBar() {
  return (
    <nav className='navbar navbar-expand navbar-dark bg-dark'>
      <ul className='navbar-nav justify-content-between w-100'>
        <Navigation />
        <Heading />
        <User />
      </ul>
    </nav>
  )
}






// TESTING
    // <div id='header-container' className='container'>
    //   <div className='row'>
    //     <div className='col'>
    //       <Navigation />
    //     </div>
    //     <div className='col'>
    //       <Heading />
    //     </div>
    //     <div className='col'>
    //       <User />
    //     </div>
    //   </div>
    // </div>