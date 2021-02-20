import React, { useState } from 'react'

export default function NewContactForm() {
  const [fields, setFields] = useState({
    name: '', 
    phone: '',
    fax: '',
    company: '',
    address: '',
  });

  const changeNameHandler = (event) => {
    setFields({...fields, name: event.target.value});
    console.log(fields);
  }

  return (
    <div>
      <h3 style={{textAlign: 'center'}}>Add Contact</h3>
      <form>
        <label>Name: </label>
        <input placeholder='Name' name='name' className='NameField' value={fields.name} onChange={changeNameHandler}/>
      </form>
    </div>
  )
}