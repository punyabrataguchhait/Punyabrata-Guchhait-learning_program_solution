import React from 'react';

const BlogDetails = ({ show }) => {
  if (!show) return null; // Conditional rendering using `if`

  return (
    <div>
      <h2>React Learning</h2>
      <h4><b>Stephen Biz</b></h4>
      <p>Welcome to learning React!</p>

      <h2>Installation</h2>
      <h4><b>Schwezdenier</b></h4>
      <p>You can install React from npm.</p>
    </div>
  );
};

export default BlogDetails;
