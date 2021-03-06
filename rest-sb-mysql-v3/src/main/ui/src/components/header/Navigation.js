import React from 'react'

export default function Navigation() {
  return (
    <div id='NavBar-Container'>
      <nav className='navbar navbar-expand-md'>
        <ul className='navbar-nav'>
          <li className='nav-item'>
            <a className='nav-link' href={window.location.origin}>Home</a>
          </li>
          <li>
            <a className='nav-link' href={window.location.origin + '/profile'}>Profile</a>
          </li>
          <li>
            <a className='nav-link' href={window.location.origin + '/all-contacts'}>All Contacts</a>
          </li>
        </ul>
      </nav>
    </div>
  )
}
