import React from 'react'
import { useHistory } from 'react-router'

export default function Navigation() {
  const history = useHistory();
  const switchPath = (path) => {
    history.push({
      pathname: path
    });
  }

  return (
    <ul className='navbar-nav'>
      <li className='nav-item'>
        <span className='nav-link' style={style} onClick={() => switchPath('/')}>Home</span>
      </li>
      <li>
        <span className='nav-link' style={style} onClick={() => switchPath('/profile')}>Profile</span>
      </li>
      <li>
        <span className='nav-link' style={style} onClick={() => switchPath('/all-contacts')}>All Contacts</span>
      </li>
    </ul>
  )
}

const style = {
  cursor: 'pointer'
} 








// TESTING
  // <div id='NavBar-Container'>
  //   <nav className='navbar navbar-expand-md navbar-dark bg-dark'>
  //     <ul className='navbar-nav'>
  //       <li className='nav-item'>
  //         <a className='nav-link' href={window.location.origin}>Home</a>
  //       </li>
  //       <li>
  //         <a className='nav-link' href={window.location.origin + '/profile'}>Profile</a>
  //       </li>
  //       <li>
  //         <a className='nav-link' href={window.location.origin + '/all-contacts'}>All Contacts</a>
  //       </li>
  //     </ul>
  //   </nav>
  // </div>