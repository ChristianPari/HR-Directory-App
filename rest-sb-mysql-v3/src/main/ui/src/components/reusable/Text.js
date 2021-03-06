import React from 'react'

export default function Text(props) {
  const Tag = props.tag || 'p';

  return (
    <Tag
      id={props.id}
      className={props.className}
    >
      {props.text}
    </Tag>
  )
}
