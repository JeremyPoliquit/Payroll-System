import React, { useState } from "react";
import axios from 'axios';

function CreateEmployee() {
  const [account, setAccount] = useState({
    name: "",
    position: "",
    department: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setAccount((prev) => ({
      ...prev,
      [name]: value,
    }));
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("/api/create", account, {
        headers: {
          "Content-Type": "application/json",
        },
      });

      console.log("Response from server:", response.data);
      alert("New record has been sent");

      setAccount({
        name: '',
        position: '',
        department: ''
      })
    } catch (error) {
      console.error(
        "Error during request:",
        error.response ? error.response.data : error.message
      );
      alert("Failed to submit data.");
    }
  };

  return (
    <div className="flex justify-center items-center">
      <form className="flex flex-col gap-4" onSubmit={handleSubmit}>
        <h1 className="text-xl">Employee Record</h1>
        <label className="input input-bordered flex items-center gap-2">
          Name:
          <input type="text" className="grow" name="name" value={account.name} onChange={handleChange} placeholder="John Doe" />
        </label>
        <label className="input input-bordered flex items-center gap-2">
          Position:
          <input type="text" className="grow" name="position" value={account.position} onChange={handleChange} placeholder="IT Instructor" />
        </label>
        <label className="input input-bordered flex items-center gap-2">
          Department:
          <input type="text" className="grow" name="department" value={account.department} onChange={handleChange} placeholder="Computer Studies" />
        </label>

        <input type="submit" className="btn btn-success text-white" value="Create" />
      </form>
    </div>
  );
}

export default CreateEmployee;
