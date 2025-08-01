import React from 'react';

const BookDetails = ({ books }) => {
  return (
    <ul>
      {books.length > 0 ? (
        books.map((book) =>
          book.price > 0 ? (
            <div key={book.id}>
              <h3>{book.bname}</h3>
              <h4>{book.price}</h4>
            </div>
          ) : null
        )
      ) : (
        <p>No books available</p>
      )}
    </ul>
  );
};

export default BookDetails;
