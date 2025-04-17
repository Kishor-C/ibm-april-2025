import {useState} from 'react';
import axios from 'axios';

export function FetchAllUsers() {
    let [users, setUsers] = useState([]);
    let [id, setId] = useState("");
    let [user, setUser] = useState({});
    let URL = "https://jsonplaceholder.typicode.com/users";
    // event handler to get a single user
    let getSingleUser = (e) => {
        axios.get(`${URL}/${id}`)
        .then(res => setUser(res.data))
        .catch(err => console.log(err));
    }
    let getAllUsers = (e) => {
        axios.get(URL).then(res => setUsers(res.data)).catch(err=>console.log(err));
    } // display id, name, username, phone, street, city, zipcode in table format
    return (<div>
        <h2>Fetch users from json placeholder</h2><hr />
        <input type = "number" placeholder='Enter id' 
            onChange={e => setId(e.target.value)} className="w-25 form-control form-control-lg"/> <br />
        <input type = "button" value = "Search"
        onClick = {getSingleUser} className="btn btn-primary btn-lg"/>
        <div className="alert alert-success">
            <h3>
                User Id = {user.id}, Username = {user.username}, Phone = {user.phone}, Email = {user.email}
            </h3>
            <h4>
                Address = {user.address?.street}, {user.address?.city}, {user.address?.zipcode}
            </h4>
        </div>
    </div>)
}