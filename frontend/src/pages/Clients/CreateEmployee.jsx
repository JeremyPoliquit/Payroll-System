import React, { useState } from "react";
import axios from "axios";
import FullTimeRecord from "../../components/FullTimeRecord";
import PartTimeRecord from "../../components/PartTimeRecord";
import UserAccount from "../../components/UserAccount";

function CreateEmployee() {
  const [selectedOption, setSelectedOption] = useState("FullTimeRecord");

  const [account, setAccount] = useState({
    name: "",
    position: "",
    department: "",
    salary: "",
    timeIn: "",
    timeOut: "",
    email: "",
    password: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setAccount({
      ...account,
      [name]: value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    const FullTime = {
      name: account.name,
      position: account.position,
      department: account.department,
      salary: account.salary,
      timeIn: account.timeIn,
      timeOut: account.timeOut,
      userAccount: {
        email: account.email,
        password: account.password
      }
    };

    const PartTime = {
      name: account.name,
      position: account.position,
      department: account.department,
      rate: account.rate,
      wage: account.wage,
      timeIn: account.timeIn,
      timeOut: account.timeOut,
      userAccount: {
        email: account.email,
        password: account.password
      }
    };

    try {
      if (selectedOption === "FullTimeRecord") {
        await Promise.all([axios.post("/api/create/fulltime/record", FullTime)]);

        alert("Full Time and User Account have been added");
      } else if (selectedOption === "PartTimeRecord") {
        await Promise.all([
          axios.post("/api/create/parttime/record", PartTime),
        ]);
        alert("Part Time and User Account have been added");
      }

      setAccount({
        name: "",
        position: "",
        department: "",
        salary: "",
        rate: "",
        timeIn: "",
        timeOut: "",
        email: "",
        password: "",
      });
    } catch (error) {
      console.error("Error occurred while submitting data:", error);
      alert("Failed to submit data.");
    }
  };

  return (
    <div className="flex flex-col gap-6 justify-center items-center">
      <select
        className="select select-sm select-bordered w-full max-w-xs"
        onChange={(e) => setSelectedOption(e.target.value)}
        value={selectedOption}
      >
        <option value="FullTimeRecord">Full Time</option>
        <option value="PartTimeRecord">Part Time</option>
      </select>

      {selectedOption === "FullTimeRecord" && (
        <div className="flex justify-between gap-8">
          <FullTimeRecord account={account} handleChange={handleChange} />
          <UserAccount account={account} handleChange={handleChange} />
        </div>
      )}
      {selectedOption === "PartTimeRecord" && (
        <div className="flex justify-between gap-8">
          <PartTimeRecord account={account} handleChange={handleChange} />
          <UserAccount account={account} handleChange={handleChange} />
        </div>
      )}

      <button
        onClick={handleSubmit}
        className="btn btn-success text-white w-1/2"
      >
        Create Record
      </button>
    </div>
  );
}

export default CreateEmployee;
