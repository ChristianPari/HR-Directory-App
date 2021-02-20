import React, { useState, useEffect } from 'react'
import ContactService from '../services/ContactService'

export default function ContactsList(props) {

  const [contacts, setContacts] = useState([]);

  useEffect(() => {
      ContactService.getContacts().then((res) => {
        setContacts(res.data);
      })
  }, [])

  return (
    <div className="ContactsListContainer">
      <h1 className="ListHeading" style={headingStyle}>Contacts</h1>
      <button className='NewContactButton' onClick={addContact}>Add Contact</button>
      <div className="ContactTableConatiner" style={containerStyle}>
        <table className="ContactTable" style={tableStyle}>
          <thead className="ContactTableHead">
            <tr>
              <th>Name</th>
              <th>Phone</th>
              <th>Fax</th>
              <th>Company</th>
              <th>Address</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody className="ContactTableBody">
            {
              contacts.map(
                contact =>
                  <tr key={contact.id}>
                    <td>{contact.name}</td>
                    <td>{contact.phone}</td>
                    <td>{contact.fax}</td>
                    <td>{contact.company}</td>
                    <td>{contact.address}</td>
                    <td>
                      <button type="button">EDIT</button>
                      <button type="button">DELETE</button>
                    </td> 
                    {/* CHANGE ABOVE TO BUTTONS IN FUTURES */}
                  </tr>
              )
            }
          </tbody>
        </table>
      </div>
    </div>
  )
}

function addContact() {
  window.location = window.location + 'add-contact';
}

const containerStyle = {
  display: 'flex',
  justifyContent: 'space-around'
}

const headingStyle = {
  textAlign: 'center'
}

const tableStyle = {
  width: '90%'
}