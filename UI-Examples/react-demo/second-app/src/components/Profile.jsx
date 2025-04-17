import { useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

export function LoginComponent() {
    return (<div>
        <h2 className="alert alert-primary w-50">Login Form</h2> <hr />
        <p>You will create login form here</p>
    </div>)
}
export function RegisterComponent() {
    return (<div>
        <h2 className="alert alert-primary w-50">Registration Form</h2> <hr />
        <p>You will create registration form here</p>
    </div>)
}
// create a success component & read the :user and display its value
// in app component change the <Route> to display success component instead of success under development
export function DashboardComponent() {
    let [username, setUsername] = useState("");//import it from 'react'
    let nav = useNavigate();//import it from 'react-router-dom'
    let handleClick = (e) => {
        //programmatic navigation
        nav("/success/"+username); // url is dynamic & value will be stored in :user
    } 
    return (<div>
        <h2 className="alert alert-primary w-50">User Dashboard</h2> <hr />
        <input type="text" className="w-25 form-control form-control-lg" 
            onChange={e=>setUsername(e.target.value)} placeholder="Enter name"></input><br />
        <input type="button" className="w-25 btn btn-primary btn-lg" value="Click"
            onClick={handleClick}></input>
    </div>)
}
export function SuccessComponent() {
    let {user} = useParams(); 
    return (<div>
        <h1>Success Component</h1>
        <h2>Hello {user}</h2>
    </div>)
}