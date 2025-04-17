import { FetchAllUsers } from "./components/FakeUsers"
import { Link, Routes, Route } from "react-router-dom"
import { DashboardComponent, LoginComponent, RegisterComponent, SuccessComponent } from "./components/Profile"
import React from "react"

// components with arrow function, use this when you want single line content

const Title = () => <><h3>Some title</h3></>
const Error = (props) => <><h2 className="text-danger">{props.message}</h2></>

// class based component was the one initially released in React before function/arrow style components
class Hello extends React.Component {
  //for states you must use the state property inhierted from the React.Component
  constructor(props) {
    super(props);
    this.state = {name:"", email:""}
  }
  handleClick = (e) => {
    this.setState({name:"Guest", email:"guest@g.com"})
  }
  //render function must be used to return the content
  render() {
    return (<div>
      <h2>This is inside class component {this.props.email}</h2>
      <h3>Updated Name: {this.state.name} and email: {this.state.email}</h3>
      <button onClick={this.handleClick}>Click</button>
    </div>)
  }
}

function App() {
  return (<div className="container-fluid">
    <h1 className="text-center alert alert-primary">Root Component</h1>
    <Hello email = "user@gmail.com" />
    <Error message="Something went wrong"></Error>
    <Error message="User record not found"></Error>
    <Title />
    <div>
      <Link to="register">Register</Link> &nbsp;
      <Link to="login">Login</Link> &nbsp;
      <Link to="dashboard">Dashboard</Link> &nbsp;
      <Link to="fakeUser">FakeUsers</Link> &nbsp;
    </div>
    <div>
      <Routes>
        <Route path="" element={<FetchAllUsers />} />
        <Route path="register" element={<RegisterComponent />} />
        <Route path="login" element={<LoginComponent />} />
        <Route path="dashboard" element={<DashboardComponent />} />
        <Route path="fakeUser" element={<FetchAllUsers />} />
        <Route path="success/:user/*" element={<SuccessComponent />} />
      </Routes>
    </div>
  </div>)
}

export default App
