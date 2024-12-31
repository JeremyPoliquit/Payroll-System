import React, { useEffect, useState } from "react";
import axios from "axios";

function DisplayFulltime() {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    const fetchEmployees = async () => {
      try {
        const response = await axios.get("/api/get/fulltime");
        setEmployees(response.data);
      } catch (error) {
        console.error("Error fetching employees:", error);
      }
    };

    fetchEmployees();
  }, []);

  return (
    <div className="flex justify-center items-center">
      <div className="overflow-x-auto">
        <table className="table text-center">
          <thead>
            <tr>
              <th>Name</th>
              <th>Job</th>
              <th>Job Type</th>
              <th>Salary</th>
              <th>Worked Hours</th>
              <th>Schedule</th>
              <th>Settings</th>
            </tr>
          </thead>
          <tbody>
            {employees.map((employee) => (
              <tr key={employee.id}>
                <td className="font-semibold">{employee.name}</td>
                <td className="font-semibold">
                  {employee.position}
                  <br />
                  <span className="badge badge-ghost badge-sm">
                    {employee.department}
                  </span>
                </td>
                <td className="font-semibold">{employee.fullTimeSalary.jobType}</td>
                <td className="font-semibold">
                  {employee.fullTimeSalary.salaryAmount}
                </td>
                <td className="font-semibold">
                  {employee.fullTimeSalary.hoursWorked}
                </td>
                <td className="font-semibold">
                  <div className="flex justify-between gap-4">
                    <div>{employee.fullTimeSalary.timeIn}AM</div>-
                    <div>{employee.fullTimeSalary.timeOut}PM</div>
                  </div>
                </td>
                <td className="font-semibold">
                  <div className="flex justify-between gap-4">
                    <div></div>
                    <div><button type="button" className="btn btn-primary btn-xs text-white">Update</button></div>
                    <div><button type="button" className="btn btn-error btn-xs text-white">Delete</button></div>
                  </div>
                </td>
              </tr>

              // <tr key={employee.id}>
              //   <td>
              //     <div className="flex items-center gap-3">
              //       <div className="avatar">
              //         <div className="mask mask-squircle h-12 w-12">
              //           <img
              //             src="https://img.daisyui.com/images/profile/demo/2@94.webp"
              //             alt="Avatar Tailwind CSS Component"
              //           />
              //         </div>
              //       </div>
              //       <div>
              //         <div className="font-bold">{employeee.name}</div>
              //       </div>
              //     </div>
              //   </td>
              //   <td>
              //     {employee.position}
              //     <br />
              //     <span className="badge badge-ghost badge-sm">
              //       {employee.department}
              //     </span>
              //   </td>
              //   <td>{employee.fullTimeSalary.hoursWorked}</td>
              //   <td>{employee.fullTimeSalary.salaryAmount}</td>
              //   <td>
              //     <div className="flex justify-between gap-4">
              //       {employee.fullTimeSalary.timeIn}
              //       {employee.fullTimeSalary.timeOut}
              //     </div>
              //   </td>
              // </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default DisplayFulltime;
