import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import AdminHomepage from './components/homepage/AdminHomepage';


import Login from './components/login/Login'
import { UserHome } from './components/homepage/Userhome';
import { LibrarianHome } from './components/homepage/LibrarianHome';
import CreateUser from './components/createUser/CreateUser';

function App() {
  return (
    <Router>
      <Route exact path='/' component={Login}/>
      <Route exact path='/adminhomepage' component={AdminHomepage}/>
      <Route exact path='/librarianhomepage' component={LibrarianHome}/>
      <Route exact path='/userhomepage' component={UserHome}/>
      <Route exact path='/createuser' component={CreateUser}/>
    </Router>
  );
}

export default App;
