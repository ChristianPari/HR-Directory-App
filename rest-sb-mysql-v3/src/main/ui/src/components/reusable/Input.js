import React from 'react'

export default function Input(props) {
  return (
    <input
      id={props.id}
      placeholder={props.ph}
      name={props.name}
      type={props.type}
      onChange={props.onChange}
    />
  )
}