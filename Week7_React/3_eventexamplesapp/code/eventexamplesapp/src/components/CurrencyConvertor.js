import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    if (currency.toLowerCase() === 'euro') {
      let converted = parseFloat(amount) * 80;
      alert(`Converting to ${currency} Amount is ${converted}`);
    } else {
      alert('Please enter Euro as currency');
    }
  };

  return (
    <div>
      <h1 style={{ color: "green" }}><b>Currency Convertor!!!</b></h1>
      <form onSubmit={handleSubmit}>
        <label>Amount:&nbsp;&nbsp;</label>
        <input
          type="text"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        /><br /><br />
        <label>Currency:&nbsp;&nbsp;</label>
        <textarea
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        ></textarea><br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
