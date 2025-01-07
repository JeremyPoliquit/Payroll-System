import React, { useEffect, useState } from "react";
import axios from "axios";

const FullTimeTable = ({ searchTerm }) => {
  const [fullTimeRecords, setFullTimeRecords] = useState([]);

  useEffect(() => {
    const fetchRecords = async () => {
      try {
        const response = await axios.get("/api/get/fulltime/search", {
          params: { name: searchTerm },
        });
        setFullTimeRecords(response.data);
      } catch (error) {
        console.error(
          "There was an error fetching the full-time records!",
          error
        );
      }
    };

    if (searchTerm) {
      fetchRecords();
    } else {
      axios
        .get("/api/get/fulltime/record")
        .then((response) => setFullTimeRecords(response.data))
        .catch((error) => console.error(error));
    }
  }, [searchTerm]);

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
          {fullTimeRecords.map((record) => (
            <tr key={record.id}>
              <td className="font-semibold">{record.name}</td>
              <td className="font-semibold">{record.position}</td>
              <td className="font-semibold">{record.department}</td>
              <td className="font-semibold">{record.salary}</td>
              <td className="font-semibold flex justify-between gap-2">
                <div> {record.timeIn}AM</div>-<div> {record.timeOut}PM</div>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default FullTimeTable;
