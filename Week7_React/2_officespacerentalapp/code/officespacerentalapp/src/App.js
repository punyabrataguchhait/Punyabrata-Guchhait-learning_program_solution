import React from 'react';

function App() {
  const office = {
    name: 'DBS',
    rent: 50000,
    address: 'Chennai'
  };

  const rentStyle = {
    color: office.rent > 60000 ? 'green' : 'red',
    fontWeight: 'bold'
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '30px' }}>
      <h1 style={{ fontWeight: 'bold',marginLeft:'150px' }}>Office Space , at Affordable Range</h1>

      <img
        src="/images.jpeg"
        alt="Office Space"
        style={{ width: '300px', height: '200px', marginTop: '20px' }}
      />

      <div style={{ 
        marginTop: '30px', 
        fontSize: '18px', 
        textAlign: 'left', 
        width: '300px',
        marginLeft: 'auto',
        marginRight: 'auto'
      }}>
        <p style={{fontSize: '25px'}}><strong>Name: {office.name}</strong></p>
        <p style={rentStyle}>Rent: Rs. {office.rent}</p>
        <p><strong>Address: {office.address}</strong></p>
      </div>
    </div>
  );
}

export default App;
