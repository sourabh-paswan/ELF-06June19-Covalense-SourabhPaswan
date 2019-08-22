import './AdminHomepage.css'
import Axios from 'axios';

import React, { Component } from 'react'

export class AdminHomepage extends Component {
    constructor(props){
        super(props);

        this.state = {
            employee : JSON.parse(localStorage.getItem("empdata"))
        }
    }
    render() {
        return (
            <div>
              <h3>Welcome Admin</h3>
                <div>
        <div id="flipkart-navbar">
          <div className="container">
            <div className="row row1">
              <ul className="largenav pull-right">
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">All Users</a></li>
                <li className="upper-links"><a className="links" href="https://campusbox.org/">Add User</a></li>
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">All Books</a></li>
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">Add Book</a></li>
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">Issue requests</a></li>
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">Homepage</a></li>
                <li className="upper-links"><a className="links" href="http://clashhacks.in/">Logout</a></li>
              </ul>
            </div>
            <div className="row row2">
              <div className="col-sm-2">
                <h1 style={{margin: '0px'}}><span className="largenav">ABC Library</span></h1>
              </div>
              <div className="flipkart-navbar-search smallsearch col-sm-8 col-xs-11">
                <div className="row">
                  <input className="flipkart-navbar-input col-xs-11" type placeholder="Search for Users by Id" />
                  <button className="flipkart-navbar-button col-xs-1">
                    <svg width="15px" height="15px">
                      <path d="M11.618 9.897l4.224 4.212c.092.09.1.23.02.312l-1.464 1.46c-.08.08-.222.072-.314-.02L9.868 11.66M6.486 10.9c-2.42 0-4.38-1.955-4.38-4.367 0-2.413 1.96-4.37 4.38-4.37s4.38 1.957 4.38 4.37c0 2.412-1.96 4.368-4.38 4.368m0-10.834C2.904.066 0 2.96 0 6.533 0 10.105 2.904 13 6.486 13s6.487-2.895 6.487-6.467c0-3.572-2.905-6.467-6.487-6.467 " />
                    </svg>
                  </button>
                </div>
              </div>
              
              <div className="cart largenav col-sm-2">
                <a className="cart-button">
                  <svg className="cart-svg " width={16 } height={16 } viewBox="0 0 16 16 ">
                    <path d="M15.32 2.405H4.887C3 2.405 2.46.805 2.46.805L2.257.21C2.208.085 2.083 0 1.946 0H.336C.1 0-.064.24.024.46l.644 1.945L3.11 9.767c.047.137.175.23.32.23h8.418l-.493 1.958H3.768l.002.003c-.017 0-.033-.003-.05-.003-1.06 0-1.92.86-1.92 1.92s.86 1.92 1.92 1.92c.99 0 1.805-.75 1.91-1.712l5.55.076c.12.922.91 1.636 1.867 1.636 1.04 0 1.885-.844 1.885-1.885 0-.866-.584-1.593-1.38-1.814l2.423-8.832c.12-.433-.206-.86-.655-.86 " fill="#fff " />
                  </svg> Link
                  <span className="item-number ">0</span>
                </a>
              </div>
            </div>
          </div>
        </div>
        <div id="mySidenav" className="sidenav">
          <div className="container" style={{backgroundColor: '#2874f0', paddingTop: '10px'}}>
            <span className="sidenav-heading">Home</span>
            <a href="javascript:void(0)" className="closebtn" onclick="closeNav()">×</a>
          </div>
          <a href="http://clashhacks.in/">Link</a>
          <a href="http://clashhacks.in/">Link</a>
          <a href="http://clashhacks.in/">Link</a>
          <a href="http://clashhacks.in/">Link</a>
        </div>
      </div>
            </div>
        )
    }
}

export default AdminHomepage

