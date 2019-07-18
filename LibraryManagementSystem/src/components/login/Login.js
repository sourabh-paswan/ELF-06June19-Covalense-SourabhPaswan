import './Login.css'
import React, { Component } from "react";
import { Button, FormGroup, FormControl } from "react-bootstrap";
import Axios from "axios";

export default class Login extends Component {
    constructor(props) {
      super(props);
  
      this.state = {
        userId: '',
        password: '',
        userType:''
      };
    }
  
    validateForm() {
      return this.state.userId.length > 0 && this.state.password.length > 0;
    }
  
    handleChange = event => {
      this.setState({
        [event.target.userId]: event.target.value
      });
    }
  
    handleSubmit = event => {
      event.preventDefault();
    }
  
    
  
  
    getAccount(event){
      event.preventDefault()
      Axios.post('http://localhost:8090/auth',null,
      {
      params:{
        userId:this.state.userId,
        password:this.state.password,
        userType:this.state.userType
        }
      }
      ).then((response)=>{
          //console.log('Response object',response.data.usersBeans[0]);
          //console.log(JSON.stringify(response.data.usersBeans[0]));
          //localStorage.setItem("empdata",JSON.stringify(response.data.usersBeans[0]));
          //console.log(JSON.stringify)
          if(this.state.userType==='admin'){
       this.props.history.push("/adminhomepage");
      }else if(this.state.userType==='librarian'){
        this.props.history.push("/librarianhomepage");
      }else if(this.state.userType==='user') {
        this.props.history.push("/userhomepage");
      }
  
      }).catch((error)=>{
          console.log('Error',error)
      })
  }
  
  
  
  render() {
      return (
       
<div className="container login-container">

        <div className="row">
          
          <div className="col-md-6 login-form-2">
          <h1>ABC Libarary</h1>
            <h3>User Login</h3>
            <form onSubmit={this.getAccount.bind(this)} method="post">
              <div className="form-group">
              <label htmlFor="user" className="form-group" >User Type</label>
                <select className="form-group"  onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType} type="text" name="userType" > 
                <option selected >Select</option>
                      <option selected value="user">User</option>
                      <option value="admin">Admin</option>
                     <option value="librarian">Librarian</option>
                </select>
            </div>
            <div className="form-group">
              <input onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} type="text" className="form-control" placeholder="Your Id"  />
            </div>
            <div className="form-group">
              <input onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} type="password" className="form-control" placeholder="Your Password" />
            </div>
            {/* <div className="form-group">
              <input type="submit" className="btnSubmit" defaultValue="Login" />
            </div> */}

            <div className="group">
                    <input type="submit" className="button" defaultValue="Sign In" />
                  </div>
            <div className="form-group">
              <a href="#" className="btnForgetPwd" value="Login">Forget Password?</a>
            </div>
            </form>
          </div>
          
        </div>
        
      </div>














          // <div>
              
          // <form onSubmit={this.getAccount.bind(this)} method="post">
            
          //   <div className="col-md-4 offset-2 text-black" style={{background: 'lightblue'}}>
          //     <div className="card-body">
          //       <h4 className="text-center">lib Managment sys</h4>
          //       <div className="form-group">
          //         <label htmlFor="name">user Id</label> 
          //         <input onChange={(event)=>{this.setState({id:event.target.value})}} value={this.state.id}  type="text" id="empid" name="empid" placeholder="Enter Employee Id" className="form-control" />
          //       </div>
          //       <div className="form-group">
          //         <label htmlFor="name">Password</label> 
          //         <input onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} type="password" id="pwd" name="pwd" placeholder="Password" className="form-control" />
          //       </div>
          //       <div className="row">
          //         <div className="col">
          //           <br />
          //           <button type="submit" 
          //           className="form-control btn btn-outline-secondary"
          //           >Submit</button>
          //         </div>
          //         <div className="col">
          //           <br />
          //           <button type="reset" className="form-control btn btn-outline-success">Reset</button>
          //         </div>
          //       </div>
          //       <div className="row">
          //         <div className="col">
          //           <br />
          //           <button type="button" className="form-control btn btn-outline-success" onclick="location.href='./createEmployee.html'">Create
          //             Account</button>
          //         </div>
          //         <div className="col">
          //           <br />
          //           <button type="submit" className="form-control btn btn-outline-success">Forgot
          //             Password</button>
          //         </div>
          //       </div>
          //       </div>
          //       </div>
          //   </form>
          //   </div>
      );
  }
  }
  