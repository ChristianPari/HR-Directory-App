import React from 'react'
import { Route, Switch } from 'react-router-dom'
import ContactsList from '../components/ContactsList'
import NewContactForm from '../components/NewContactForm'

export default function AppRouter() {
  return (
    <Switch>
      <Route exact path='/'>
        <ContactsList /> 
        {/* change to a homepage/login/signup */}
      </Route>
      {/* create routes for login, signup, user home page, create new contact */}

      <Route exact path='/add-contact'>
        <NewContactForm /> 
        {/* change to a homepage/login/signup */}
      </Route>

      <Route path='/'>
        {/* create a 404 page */}
        <div>
          <h1>404 Error</h1>
          <button onClick={() => window.location = window.location.origin}>Back to home</button>
        </div>
      </Route>
    </Switch>
  )
}