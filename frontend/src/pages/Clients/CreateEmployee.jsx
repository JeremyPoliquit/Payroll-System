import React, { useState } from "react";
import axios from "axios";

function CreateEmployee() {
  const [account, setAccount] = useState({
    name: "",
    position: "",
    department: "",
    
    hoursWorked: "",
    salaryAmount: "",
    timeIn: "",
    timeOut: "",
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

    const payload = {
      name: account.name,
      position: account.position,
      department: account.department,
      fullTimeSalary: {
        hoursWorked: account.hoursWorked,
        salaryAmount: account.salaryAmount,
        timeIn: account.timeIn,
        timeOut: account.timeOut,
      },
    };

    try {
      const response = await axios.post("/api/create", payload);

      console.log("Response from server:", response.data);
      alert("New record has been sent");

      setAccount({
        name: "",
        position: "",
        department: "",
        hoursWorked: "",
        salaryAmount: "",
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
    <div className="flex justify-center items-center">
      <form className="flex flex-col gap-4" onSubmit={handleSubmit}>
        <h1 className="text-xl">Employee Record</h1>
        <label className="input input-bordered flex items-center gap-2">
          Name:
          <input
            type="text"
            className="grow"
            name="name"
            value={account.name}
            onChange={handleChange}
            placeholder="John Doe"
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
          />
        </label>

        {/* Fulltime Base */}
        <div className="flex justify-between gap-4">
          <label className="input input-bordered flex items-center gap-2">
            Working Time:
            <input
              type="number"
              className="grow"
              name="hoursWorked"
              value={account.hoursWorked}
              onChange={handleChange}
              placeholder="8"
            />
            <p>Hours</p>
          </label>
          <label className="input input-bordered flex items-center gap-2">
            Salary Amount:
            <input
              type="number"
              className="grow"
              name="salaryAmount"
              value={account.salaryAmount}
              onChange={handleChange}
              placeholder="24000"
            />
            <p>Pesos</p>
          </label>
        </div>
        <div className="flex justify-between gap-4">
          <label className="input input-bordered flex items-center gap-2">
            Time In:
            <input
              type="time"
              className="grow"
              name="timeIn"
              value={account.timeIn}
              onChange={handleChange}
              placeholder="6:00"
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
              placeholder="12:00"
            />
          </label>
        </div>

        <input
          type="submit"
          className="btn btn-success text-white"
          value="Create"
        />
      </form>
    </div>
  );
}

export default CreateEmployee;
