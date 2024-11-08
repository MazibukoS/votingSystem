import React, { useState } from "react";
import { toast, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

function RegisterToVotePage() {
  const [addressLine1, setAddressLine1] = useState("");
  const [addressLine2, setAddressLine2] = useState("");
  const [addressLine3, setAddressLine3] = useState("");
  const [postalCode, setPostalCode] = useState("");
  const [idCopy, setIdCopy] = useState("");

  const handleRegisterToVote = async (e) => {
    e.preventDefault();

    const voteRegistration = {
      addressLine1: addressLine1,
      addressLine2: addressLine2,
      addressLine3: addressLine3,
      postalCode: postalCode,
      idCopy: idCopy,
    };

    try {
      const response = await fetch("http://localhost:8080/api/vote/register", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(voteRegistration),
      });

      if (response.ok) {
        toast.success("Successfully Registered to vote");
      } else {
        toast.error("Unable to Register user to vote");
      }
    } catch (error) {
      console.error("Error:", error);
      toast.error("Something went wrong");
    }
  };

  return (
    <div>
      <h1>Register to vote</h1>
      <form onSubmit={handleRegisterToVote}>
        <div>
          <label>Address line 1:</label>
          <input
            type="addressLine1"
            value={addressLine1}
            onChange={(e) => setAddressLine1(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Address Line 2:</label>
          <input
            type="addressLine2"
            value={addressLine2}
            onChange={(e) => setAddressLine2(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Address Line 3:</label>
          <input
            type="addressLine3"
            value={addressLine3}
            onChange={(e) => setAddressLine3(e.target.value)}
            required
          />
        </div>
        <div>
          <label>Postal Code:</label>
          <input
            type="postalCode"
            value={postalCode}
            onChange={(e) => setPostalCode(e.target.value)}
            required
          />
        </div>
        <div>
          <label>ID Copy:</label>
          <input
            type="idCopy"
            value={idCopy}
            onChange={(e) => setIdCopy(e.target.value)}
            required
          />
        </div>
        <ToastContainer />
      </form>
    </div>
  );
}

export default RegisterToVotePage;
