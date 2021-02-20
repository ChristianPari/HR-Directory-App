import axios from 'axios'

let CONTACT_API_BASE_URL = "http://localhost:8080/api/v1/";

class ContactServie {
  getContacts() {
    return axios.get(CONTACT_API_BASE_URL + "getAllContacts");
  }
}

export default new ContactServie()