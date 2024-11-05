import React from "react";
import { Link } from "react-router-dom";

function MainPage() {
  return (
    <div>
      <h1>South Africa's Electronic voting System</h1>
      <p>Powered by blockchain</p>
      <div>
        <Link to="/login">
          <button>Login</button>
        </Link>
        <Link to="/register">
          <button>Register</button>
        </Link>
      </div>
    </div>
  );
}

export default MainPage;
