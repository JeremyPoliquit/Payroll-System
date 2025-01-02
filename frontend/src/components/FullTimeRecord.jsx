import React, { useState } from "react";
import axios from "axios";

function FullTimeRecord() {
  const [account, setAccount] = useState({
    name: "",
    position: "",
    department: "",
    salary: "",
    timeIn: "",
    timeOut: ""
  });

  // Handle form input changes
  const handleChange = (e) => {
    const { name, value } = e.target;
    setAccount({
      ...account,
      [name]: value
    })
  }
  
  // Handle form submission
  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const response = await axios.post("/api/create/fulltime", account);
      console.log("Response from server:", response.data);
      alert("New record has been successfully created!");

      // Reset form state
      setAccount({
        name: "",
        position: "",
        department: "",
        salary: "",
        timeIn: "",
        timeOut: "",
      });
    } catch (error) {
      console.error(
        "Error during request:",
        error.response ? error.response.data : error.message
      );
      alert("Failed to submit data.");
    }
  };

  return (
    <form className="flex flex-col gap-4" onSubmit={handleSubmit}>
      <h1 className="text-xl">Full Time Record</h1>
      <label className="input input-bordered flex items-center gap-2">
        Name:
        <input
          type="text"
          className="grow"
          name="name"
          value={account.name}
          onChange={handleChange}
          placeholder="John Doe"
          required
        />
      </label>
      <label className="input input-bordered flex items-center gap-2">
        Position:
        <input
          type="text"
          className="grow"
          name="position"
          value={account.position}
          onChange={handleChange}
          placeholder="IT Instructor"
          required
        />
      </label>
      <label className="input input-bordered flex items-center gap-2">
        Department:
        <input
          type="text"
          className="grow"
          name="department"
          value={account.department}
          onChange={handleChange}
          placeholder="Computer Studies"
          required
        />
      </label>

      {/* Fulltime Salary Information */}
      <label className="input input-bordered flex items-center gap-2">
        Salary Amount:
        <input
          type="number"
          className="grow"
          name="salary"
          value={account.salary}
          onChange={handleChange}
          placeholder="24000"
          required
        />
        <p>Pesos</p>
      </label>
      <div className="flex justify-between gap-4">
        <label className="input input-bordered flex items-center gap-2">
          Time In:
          <input
            type="time"
            className="grow"
            name="timeIn"
            value={account.timeIn}
            onChange={handleChange}
            required
          />
        </label>
        <label className="input input-bordered flex items-center gap-2">
          Time Out:
          <input
            type="time"
            className="grow"
            name="timeOut"
            value={account.timeOut}
            onChange={handleChange}
            required
          />
        </label>
      </div>

      <input
        type="submit"
        className="btn btn-success text-white"
        value="Create"
      />
    </form>
  );
}

export default FullTimeRecord;
