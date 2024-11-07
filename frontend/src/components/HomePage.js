import React from "react";
import { Link } from "react-router-dom";
import { useLocation } from "react-router-dom";
import "./HomePage.css";

function HomePage() {
  const location = useLocation();
  const data = location.state?.data;
  return (
    <div>
      <h1>Welcome Home {data.firstname}</h1>
      <p>Your democracy, own it!!</p>
      <div>
        <div className="icon-container">
          <Link to="/vote-registration" className="icon-link">
            <div className="icon">🏠</div>
            <span>Register to vote</span>
          </Link>
          <Link to="/cast-vote" className="icon-link">
            <div className="icon">🔍</div>
            <span>Cast your vote</span>
          </Link>
          <Link to="/election-results" className="icon-link">
            <div className="icon">📧</div>
            <span>Election results</span>
          </Link>
          <Link to="/login" className="icon-link">
            <div className="icon">⚙️</div>
            <span>Log out</span>
          </Link>
        </div>
      </div>
    </div>
  );
}

export default HomePage;
