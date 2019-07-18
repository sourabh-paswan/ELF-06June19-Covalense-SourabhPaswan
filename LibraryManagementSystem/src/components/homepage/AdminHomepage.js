import './AdminHomepage.css'
import Axios from 'axios';

import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
export class AdminHomepage extends Component {
    constructor(props){
        super(props);

        this.state = {
            employee : JSON.parse(localStorage.getItem("empdata"))
        }
    }
    logout() {
      Axios.get('http://localhost:8090/logout').then((response) => {
          console.log('Response Data', response.data);
          const responseData = response.data;
          
              localStorage.clear();
              localStorage.setItem("status", "true")
              this.props.history.push("/")

          
      }).catch((error) => {
          console.log('Error', error);
      })
      
  }
    render() {
        return (
            <div>
              <h3 id="flipkart-navbar">Welcome Admin</h3>
              <div className="row row2">
                <div className="col-sm-2">
                  <h1 style={{margin: '0px'}}><span className="largenav">ABC Library</span></h1>
                </div>
              </div>
              <div>
                <div id="flipkart-navbar"> 
                  <div className="container">
                    <div className="row row1">
                      <ul className="largenav pull-right">
                        <li className="upper-links"><a className="links" >All Users</a></li>
                        <li className="upper-links"><Link className="links" to="/createuser" >Add User</Link></li>
                        <li className="upper-links"><a className="links" >All Books</a></li>
                        <li className="upper-links"><a className="links" >Add Book</a></li>
                        <li className="upper-links"><a className="links" >Issue requests</a></li>
                        <li className="upper-links"><a className="links" >Homepage</a></li>
                        <button className="cart-button" onClick={this.logout.bind(this)}>logout</button>
                        
                      </ul>  
                      <div className="container">
        <div className="rowcol">
          <div className="search">
            <input type="text" className="form-control input-sm" maxLength={64} placeholder="Member ID" />
            <button type="submit" className="btn btn-primary btn-sm">Search Members</button>
          </div>
          <div className="search">
            <input type="text" className="form-control input-sm" maxLength={64} placeholder="Book Name" />
            <button type="submit" className="btn btn-primary btn-sm">Search Books</button>
          </div>
        </div>
      </div> 
                    </div>
                  </div>
                </div>
                
                
              </div>
            </div>
        )
    }
}

export default AdminHomepage

