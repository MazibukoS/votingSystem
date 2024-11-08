import logo from "./logo.svg";
import "./App.css";
import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import MainPage from "./components/MainPage";
import LoginPage from "./components/LoginPage";
import RegisterPage from "./components/RegisterPage";
import HomePage from "./components/HomePage";
import CastVote from "./components/CastVote";
import ElectionResults from "./components/ElectionResults";
import RegisterToVote from "./components/RegisterToVote";

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/login" element={<LoginPage />} />
        <Route path="/register" element={<RegisterPage />} />
        <Route path="/home" element={<HomePage />} />
        <Route path="/cast-vote" element={<CastVote />} />
        <Route path="/election-results" element={<ElectionResults />} />
        <Route path="/vote-registration" element={<RegisterToVote />} />
      </Routes>
    </Router>
  );
}

export default App;
