import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Homepage from './components/homepage/Homepage';

import Login from './components/login/Login'

function App() {
  return (
    <Router>
      <Route exact path='/' component={Login}/>
      <Route exact path='/homepage' component={Homepage}/>
    </Router>
  );
}

export default App;
