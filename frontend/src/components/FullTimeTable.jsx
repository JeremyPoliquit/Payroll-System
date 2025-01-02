import React, { useState, useEffect } from "react";
import axios from "axios";

const FullTimeTable = () => {
  const [fullTimeEmployees, setFullTimeEmployees] = useState([]);

  useEffect(() => {
    axios
      .get("/api/record/fulltime")
      .then((response) => setFullTimeEmployees(response.data))
      .catch((error) => console.error(error));
  }, []);

  return (
    <div className="overflow-x-auto">
      <table className="table border-2 border-black text-center">
        <thead>
          <tr>
            <th className="text-sm text-black">Name</th>
            <th className="text-sm text-black">Position</th>
            <th className="text-sm text-black">Department</th>
            <th className="text-sm text-black">Salary</th>
            <th className="text-sm text-black">Schedule</th>
          </tr>
        </thead>
        <tbody>
          {fullTimeEmployees.map((emp) => (
            <tr key={emp.id}>
              <td className="font-semibold">{emp.name}</td>
              <td className="font-semibold">{emp.position}</td>
              <td className="font-semibold">{emp.department}</td>
              <td className="font-semibold">{emp.salary}</td>
              <td className="font-semibold flex justify-between">
                <div> {emp.timeIn}AM</div>-<div> {emp.timeOut}PM</div>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default FullTimeTable;
