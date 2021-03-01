import React, { useState } from 'react'
import ContactService from '../services/ContactService';

export default function NewContactForm() {
  const [fields, setFields] = useState({
    name: '', 
    phone: '',
    fax: '',
    company: '',
    address: '',
  });

  const changeHandler = (event) => {
    let type = event.target.name;
    setFields({...fields, [type]: event.target.value});
  }

  const saveContact = () => {
    let contact = {
      name: fields.name,
      phone: fields.phone,
      fax: fields.fax,
      company: fields.company,
      address: fields.address
    };
    console.log('contact => ' + JSON.stringify(contact));

    ContactService.createContact(contact)
    .then(res => {
      window.location = window.location.origin;
    })
  }

  const cancel = () => {
    window.location = window.location.origin;
  }

  return (
    <div>
      <h3 style={{textAlign: 'center'}}>Add Contact</h3>
      <form>
        <label>Name: </label>
        <input placeholder='Name' name='name' className='NameField' value={fields.name} onChange={changeHandler}/>
        <label>Phone: </label>
        <input placeholder='Phone' name='phone' className='PhoneField' value={fields.phone} onChange={changeHandler}/>
        <label>Fax: </label>
        <input placeholder='Fax' name='fax' className='FaxField' value={fields.fax} onChange={changeHandler}/>
        <label>Company: </label>
        <input placeholder='Company' name='company' className='CompanyField' value={fields.company} onChange={changeHandler}/>
        <label>Address: </label>
        <input placeholder='Address' name='address' className='AddressField' value={fields.address} onChange={changeHandler}/>
      </form>
      <div className='ButtonsDiv'>
        <button className='SaveButton' onClick={saveContact}>Save</button>
        <button className='CancelButton' onClick={cancel}>Cancel</button>
      </div>
    </div>
  )
}