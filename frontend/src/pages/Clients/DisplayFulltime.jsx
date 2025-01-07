import React, { useState, useEffect } from "react";
import axios from "axios";
import FullTimeTable from "../../components/FullTimeTable";
import PartTimeTable from "../../components/PartTimeTable"; // Import the PartTimeRecord component

function DisplayFulltime() {
  const [employeeType, setEmployeeType] = useState('FullTime');

  const handleSelectChange = (event) => {
    setEmployeeType(event.target.value);
  };

  return (
    <div className="flex flex-col gap-6 justify-center items-center">
      <h2>Record List</h2>

      {/* Dropdown for selecting FullTime or PartTime */}
      <div className="flex gap-2">
        <label>Choose Record Type:</label>
        <select
          value={employeeType}
          onChange={handleSelectChange}
          className="input input-bordered select-sm"
        >
          <option value="FullTime">FullTime</option>
          <option value="PartTime">PartTime</option>
        </select>
      </div>


      {employeeType === 'FullTime' ? <FullTimeTable /> : <PartTimeTable />}
    </div>
  );
}

export default DisplayFulltime;
