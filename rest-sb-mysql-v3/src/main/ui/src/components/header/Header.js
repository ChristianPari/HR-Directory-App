import React from "react";

// components
import Navigation from './Navigation'
import User from './User'
import Text from '../reusable/Text'

export default function Header() {
  return (
    <div>
      <Navigation />
      <Text id='MainHeading' className='' text='HR Directory App'/>
      <User />
    </div>
  )
}