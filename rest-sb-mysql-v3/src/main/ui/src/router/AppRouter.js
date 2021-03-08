import React from 'react'
import { Redirect, Route, Switch } from 'react-router-dom'

// components
import Home from "../pages/Home"
import AllContacts from "../pages/AllContacts"
import Profile from "../pages/Profile"
import Login from "../pages/Login"
import Register from "../pages/Register"
import NavBar from '../components/header/Navbar'

export default function AppRouter() {
  return (
    <div>
      <NavBar />
      <Switch>
        <Route exact path='/' component={Home} />
        <Route exact path='/all-contacts' component={AllContacts}/>
        <Route exact path='/profile' component={Profile}/>
        <Route exact path='/login' component={Login}/>
        <Route exact path='/register' component={Register}/>
        <Redirect to='/'/>
      </Switch>
    </div>
  )
}