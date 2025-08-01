import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './components/CurrencyConvertor';

function App() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(prev => prev + 1);
    sayHello("Member1");
  };

  const sayHello = (msg) => {
    alert("Hello " + msg);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleClick = (e) => {
    alert("I was clicked");
  };

  return (
    <div style={{ margin: '30px' }}>
      <p>{count}</p>
      <button onClick={handleIncrement}>Increment</button>
      <br /><br />
      <button onClick={() => setCount(prev => prev - 1)}>Decrement</button>
      <br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button>
      <br /><br />
      <button onClick={handleClick}>Click on me</button>
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
