import React, { useState } from "react";
import FullTimeRecord from "../../components/FullTimeRecord";
import PartTimeRecord from "../../components/PartTimeRecord";

function CreateEmployee() {
  // State for the select option
  const [selectedOption, setSelectedOption] = useState("FullTimeRecord");

  return (
    <div className="flex flex-col justify-center items-center">
      <select
        className="select select-sm select-bordered w-full max-w-xs"
        onChange={(e) => setSelectedOption(e.target.value)}
        value={selectedOption}
      >
        <option value="FullTimeRecord">Full Time</option>
        <option value="PartTimeRecord">Part Time</option>
      </select>

      {selectedOption === "FullTimeRecord" && <FullTimeRecord />}
      {selectedOption === "PartTimeRecord" && <PartTimeRecord />}
    </div>
  );
}

export default CreateEmployee;
