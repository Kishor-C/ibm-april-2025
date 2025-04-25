import {useState} from 'react';
import axios from 'axios';

export function EmployeeSearchById() {
    let [id, setId] = useState(undefined);
    let [employee, setEmployee] = useState(undefined);
    let [error, setError] = useState(undefined);
    
    // call this while clicking the search button
    let handleClick = (e) => {
        let URI = "http://localhost:8080/api/employee/"+id;
        // response.data will have success body
        // response.response.data will have error body
        axios.get(URI)
        .then((response)=>{setEmployee(response.data); console.log(response); setError(undefined)})
        .catch((response)=>{setError(response.response.data); console.log(response); setEmployee(undefined)})
    }
    // UI element
    return (<div>
        <h2 className="w-25 alert alert-secondary text-primary text-center">
            Search Employee
        </h2>
       
        <h4 className="w-25">Enter employee id: </h4>
        <input type = "number" className = "w-25 form-control form-control-lg" 
            onChange={e=>setId(e.target.value)}></input>
        <br />
        <input type = "button" value = "Search" className = "btn btn-primary btn-lg w-25"
            onClick={handleClick}></input>
        <div>
            <h4 className="text-success">Name: {employee?.name}, Dob: {employee?.dob}</h4>
            <h4 className="text-danger">Error Message: {error?.message}</h4>
        </div>
    </div>)
}