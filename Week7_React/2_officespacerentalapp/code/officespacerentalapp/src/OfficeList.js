import React from 'react';

const offices = [
  {
    name: "Green Tower",
    rent: 55000,
    address: "MG Road, Bangalore"
  },
  {
    name: "Tech Park",
    rent: 75000,
    address: "Electronic City, Bangalore"
  },
  {
    name: "Innovate Hub",
    rent: 60000,
    address: "Whitefield, Bangalore"
  }
];

function getRentStyle(rent) {
  return {
    color: rent > 60000 ? 'green' : 'red'
  };
}

function OfficeList() {
  return (
    <div>
      {offices.map((office, index) => (
        <div key={index} style={{ marginBottom: '20px' }}>
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          <p><strong>Rent:</strong> <span style={getRentStyle(office.rent)}>{office.rent}</span></p>
        </div>
      ))}
    </div>
  );
}

export default OfficeList;
