import React, { useState } from "react";
import FullTimeTable from "../../components/FullTimeTable";
import PartTimeTable from "../../components/PartTimeTable";

function DisplayFulltime() {
  const [selectedType, setSelectedType] = useState("FullTime");

  const handleFilterChange = (event) => {
    setSelectedType(event.target.value);
  };

  return (
    <div className="flex flex-col gap-6 justify-center items-center">
      <h2>Record List</h2>
      {/* Dropdown Option */}
      <div className="flex justify-between w-1/2">
        <div className="flex items-center gap-2">
          <label htmlFor="employeeType" className="text-lg">
            Filter Job Type:{" "}
          </label>
          <select
            id="employeeType"
            className="select select-bordered select-sm  "
            value={selectedType}
            onChange={handleFilterChange}
          >
            <option disabled selected>
              Job Type
            </option>
            <option value="FullTime">FullTime</option>
            <option value="PartTime">PartTime</option>
          </select>
        </div>
        <div className="flex items-center gap-2">
          Search:
          <label
            className="input input-bordered input-sm flex items-center gap-2"
            htmlFor="search"
          >
            <input type="text" className="grow" placeholder="John Doe" />
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

      {/* Table Records */}
      {selectedType === "FullTime" && <FullTimeTable />}
      {selectedType === "PartTime" && <PartTimeTable />}
    </div>
  );
}

export default DisplayFulltime;
