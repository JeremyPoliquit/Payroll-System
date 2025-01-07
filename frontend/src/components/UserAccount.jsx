import React from "react";

function UserAccount({ account, handleChange}) {
  return (
    <form className="flex flex-col gap-4">
      <h1 className="text-xl text-right">Account Employee</h1>
      <label className="input input-bordered flex items-center gap-2">
        E-mail:
        <input
          type="email"
          className="grow"
          name="email"
          placeholder="johndoe"
          value={account.email}
          onChange={handleChange}
          required
        />
        <span>@cvsu.mail.com</span>
      </label>
      <label className="input input-bordered flex items-center gap-2">
        Password:
        <input
          type="password"
          className="grow"
          name="password"
          value={account.password}
          onChange={handleChange}
          placeholder="User123"
          required
        />
      </label>
    </form>
  );
}

export default UserAccount;
