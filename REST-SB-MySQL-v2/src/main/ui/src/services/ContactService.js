import axios from 'axios'

let CONTACT_API_BASE_URL = "http://localhost:8080/api/v1/";

class ContactServie {
  getContacts() {
    return axios.get(CONTACT_API_BASE_URL + "getAllContacts");
  }

  createContact(contact) {
    return axios.post(CONTACT_API_BASE_URL + "addContact", contact);
  }

  deleteContact(contactID) {
    return axios.delete(CONTACT_API_BASE_URL + "deleteContact/" + contactID);
  }
}

export default new ContactServie()