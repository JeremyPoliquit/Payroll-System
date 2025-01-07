import React, { useState, useEffect } from "react";
import axios from "axios";

const PartTimeTable = ({ searchTerm }) => {
  const [partTimeRecords, setPartTimeRecords] = useState([]);

  useEffect(() => {
    const fetchRecords = async () => {
      try {
<<<<<<< HEAD
        const response = await axios.get("/api/get/parttime/search", {
=======
        const response = await axios.get('/api/get/parttime/search', {
>>>>>>> 2e090d918e0b00b2b5f23f3cc2856124f64b50d2
          params: { name: searchTerm },
        });
        setPartTimeRecords(response.data);
      } catch (error) {
<<<<<<< HEAD
        console.error(
          "There was an error fetching the part-time records!",
          error
        );
=======
        console.error('There was an error fetching the part-time records!', error);
>>>>>>> 2e090d918e0b00b2b5f23f3cc2856124f64b50d2
      }
    };

    // Only fetch if there's a search term, otherwise get all records
    if (searchTerm) {
      fetchRecords();
    } else {
<<<<<<< HEAD
      axios
        .get("/api/get/parttime/record")
        .then((response) => setPartTimeRecords(response.data))
        .catch((error) => console.error(error));
=======
      axios.get('/api/get/parttime/record')
        .then(response => setPartTimeRecords(response.data))
        .catch(error => console.error(error));
>>>>>>> 2e090d918e0b00b2b5f23f3cc2856124f64b50d2
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
            <th className="text-sm text-black">Wage</th>
            <th className="text-sm text-black">Rate Hour</th>
            <th className="text-sm text-black">Schedule</th>
          </tr>
        </thead>
        <tbody>
          {partTimeRecords.map(record => (
            <tr key={record.id}>
              <td className="font-semibold">{record.name}</td>
              <td className="font-semibold">{record.position}</td>
              <td className="font-semibold">{record.department}</td>
              <td className="font-semibold">{record.wage}</td>
              <td className="font-semibold">{record.rate}</td>
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

export default PartTimeTable;
