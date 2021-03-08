import React from 'react'
import { useHistory } from 'react-router'

export default function User() {
  const history = useHistory();
  const switchPath = (path) => {
    history.push({
      pathname: path
    });
  }

  return (
    <ul className='navbar-nav'>
      <li className='nav-item'>
        <span className='nav-link' style={style} onClick={() => switchPath('/login')}>Login</span>
      </li>
      <li>
        <span className='nav-link' style={style} onClick={() => switchPath('/register')}>Register</span>
      </li>
    </ul>
  )
}

const style = {
  cursor: 'pointer'
}