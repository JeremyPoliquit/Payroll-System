import React, { useState } from "react";
import FullTimeTable from "../../components/FullTimeTable";
import PartTimeTable from "../../components/PartTimeTable"; // Import the PartTimeRecord component

function DisplayFulltime() {
  const [employeeType, setEmployeeType] = useState("FullTime");
  const [employeeType, setEmployeeType] = useState("fulltime");
  const [searchTerm, setSearchTerm] = useState("");

  const handleSelectChange = (event) => {
    setEmployeeType(event.target.value);
  };

  const handleSearchChange = (event) => {
    setSearchTerm(event.target.value);
  };

  return (
    <div className="flex flex-col gap-6 justify-center items-center">
      <h2>Record List</h2>
<<<<<<< HEAD
      <div className="flex justify-between items-center w-1/2">
        <div>
          <label>Choose Record Type:</label>
=======
      {/* Dropdown for selecting FullTime or PartTime */}
      <div className="flex justify-between items-center w-1/2">
        <div>
          <label>Record Type: </label>
>>>>>>> 2e090d918e0b00b2b5f23f3cc2856124f64b50d2
          <select
            value={employeeType}
            onChange={handleSelectChange}
            className="input input-bordered select-sm"
          >
            <option value="FullTime">FullTime</option>
            <option value="PartTime">PartTime</option>
          </select>
        </div>

        <div>
          <label className="input input-bordered input-sm flex items-center gap-2">
            <input
              type="text"
              className="grow"
              value={searchTerm}
              onChange={handleSearchChange}
              placeholder="Search"
            />
            <svg
              xmlns="http://www.w3.org/2000/svg"
              viewBox="0 0 16 16"
              fill="currentColor"
              className="h-4 w-4 opacity-70"
            >
              <path
                fillRule="evenodd"
                d="M9.965 11.026a5 5 0 1 1 1.06-1.06l2.755 2.754a.75.75 0 1 1-1.06 1.06l-2.755-2.754ZM10.5 7a3.5 3.5 0 1 1-7 0 3.5 3.5 0 0 1 7 0Z"
                clipRule="evenodd"
              />
            </svg>
          </label>
        </div>
      </div>
<<<<<<< HEAD

      {employeeType === "FullTime" ? (
=======
      {employeeType === "fulltime" ? (
>>>>>>> 2e090d918e0b00b2b5f23f3cc2856124f64b50d2
        <FullTimeTable searchTerm={searchTerm} />
      ) : (
        <PartTimeTable searchTerm={searchTerm} />
      )}
    </div>
  );
}

export default DisplayFulltime;
