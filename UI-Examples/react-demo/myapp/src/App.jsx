import { useState } from 'react';
import Greet, {Hello} from './Greet.jsx';
/*
this is a component that must return an HTML element 
you must mandatorily have container tags as a parent tag like div in the component
*/

function SimpleList() {
  let iplTeams = ["RCB", "KKR", "MI", "CSK", "SRH"];
  return (<div>
    <h2>List of teams</h2><hr />
    <ol>
      {iplTeams.map((team, index)=><li key = {team}>{team}</li>)}
    </ol>
  </div>)
}
// a component that displays the table having user information with id, name, dob and gender headings
function ComplexList() {
  let userList = [
    {id : 100, name : "Atharv", dob : "2025-04-08", gender: "Male"},
    {id : 200, name : "Ravi", dob: "1987-03-18", gender: "Male"},
    {id : 300, name: "Vaishnavi", dob: "2002-09-27", gender:"Female"}
  ];
  return (<div>
    <h2>User List</h2>
    <table className="table table-striped">
      <thead>
       <tr><th>Id</th><th>Name</th><th>Dob</th><th>Gender</th></tr>
      </thead>
      <tbody>
        {
          userList.map((user, index)=><tr key={user.id}>
            <td>{user.id}</td><td>{user.name}</td><td>{user.dob}</td><td>{user.gender}</td>
          </tr>)
        }
      </tbody>
    </table>
  </div>)
}
function EventHandlerDemo() {

  //initial value of the counter = 1
  let [counter, setCounter] = useState(1);

  let handleClick = (e) => setCounter(++counter);
  let handleClick2 = (e) => {
    setCounter(counter + 2);
  }
  return (<div>
    <h3>Counter: {counter}</h3>
    <button onClick = {handleClick} className="btn btn-primary">Button1</button> <br /> <br />
    <button onClick = {handleClick2} className="btn btn-primary">Button2</button> <br /> <br />
    <button onClick = {e => setCounter(counter + 3)} className="btn btn-primary">Button3</button> <br />
  </div>)
}
function FormDemo() {
  let [name, setName] = useState("");
  let [age, setAge] = useState("");
  let handleSubmit = (e) => {
    e.preventDefault(); // prevent the reload
    console.log(`Name = ${name}, Age = ${age}`);
  }
  return (<div>
    <h2>Form Demo</h2>
    <form onSubmit={handleSubmit}>
      <input type = "text" onChange = {e => setName(e.target.value)} 
        placeholder="Enter Name" className="form-control-lg"/> <br /> <br />
      <input type = "number" onChange = {e => setAge(e.target.value)} 
      placeholder="Enter Age" className="form-control-lg"/> <br /> <br />
      <input type = "submit" value = "Submit" className="btn btn-primary btn-lg"/>
    </form>
  </div>)

}
function App() {
  return (<div className="container-fluid">
    <h1 className="alert alert-primary text-center">This is a root component</h1>
    <FormDemo />
   
  </div>);
}

export default App
