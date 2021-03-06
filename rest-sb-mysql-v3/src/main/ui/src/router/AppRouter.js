import React from 'react'
import { Route, Switch } from 'react-router-dom'

// components
import Home from "../pages/Home"
import AllContacts from "../pages/AllContacts"
import Profile from "../pages/Profile"
import NotFound from "../pages/NotFound"

export default function AppRouter() {
  return (
    <Switch>
      <Route exact path='/' component={Home} />
      <Route exact path='/all-contacts' component={AllContacts}/>
      <Route exact path='/profile' component={Profile}/>
      <Route path='/' component={NotFound} />
    </Switch>
  )
}