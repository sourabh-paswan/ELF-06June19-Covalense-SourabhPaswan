//import './HomePage.css'
import Axios from 'axios';

import React, { Component } from 'react'

export class Homepage extends Component {
    constructor(props){
        super(props);

        this.state = {
            employee : JSON.parse(localStorage.getItem("empdata"))
        }
    }
    render() {
        return (
            <div>
                <div className="navbar-wrapper">
        <div className="container-fluid">
          <nav className="navbar navbar-fixed-top">
            <div className="container">
              <div className="navbar-header">
                <button type="button" className="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                  <span className="sr-only">Toggle navigation</span>
                  <span className="icon-bar" />
                  <span className="icon-bar" />
                  <span className="icon-bar" />
                </button>
                <a className="navbar-brand" href="#">Logo</a>
              </div>
              <div id="navbar" className="navbar-collapse collapse">
                <ul className="nav navbar-nav">
                  <li className="active"><a href="#" className>Home</a></li>
                  <li className=" dropdown">
                    <a href="#" className="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">JOB SEARCH <span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li className=" dropdown">
                        <a href="#" className="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">POST JOB</a>
                      </li>
                      <li><a href="#">Add New</a></li>
                    </ul>
                  </li>
                  <li><a href="#">Add New</a></li>
                  <li className=" dropdown"><a href="#" className="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">POST JOB<span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li><a href="#">View Managers</a></li>
                      <li><a href="#">Add New</a></li>
                    </ul>
                  </li>
                  <li className=" dropdown"><a href="#" className="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">POST RESUME <span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li><a href="#">View Staff</a></li>
                      <li><a href="#">Add New</a></li>
                      <li><a href="#">Bulk Upload</a></li>
                    </ul>
                  </li>
                  <li className=" down"><a href="#" className="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">PRICING <span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li><a href="#">Change Time Entry</a></li>
                      <li><a href="#">Report</a></li>
                    </ul>
                  </li>
                </ul>
                <ul className="nav navbar-nav pull-right">
                  <li className=" dropdown"><a href="#" className="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Signed in as  <span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li><a href="#">Applicant Login</a></li>
                      <li><a href="#">HR Login</a></li>
                    </ul>
                  </li>
                  <li className=" dropdown"><a href="#" className="dropdown-toggle active" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Register <span className="caret" /></a>
                    <ul className="dropdown-menu">
                      <li><a href="#">Applicant Register</a></li>
                      <li><a href="#">HR Register</a></li>
                    </ul>
                  </li></ul>
              </div>
            </div>
          </nav>
        </div>
      </div>
            </div>
        )
    }
}

export default Homepage

