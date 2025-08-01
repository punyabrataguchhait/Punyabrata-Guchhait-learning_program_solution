import React from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import { books } from './data/books';
import './App.css';

function App() {
  const showBlog = true;

  const courseData = [
    { name: 'Angular', date: '4/5/2021' },
    { name: 'React', date: '6/3/20201' },
  ];

  return (
    <div>
      <div className="mystyle1">
        <h1>Course Details</h1>
        <CourseDetails courses={courseData} />
      </div>

      <div className="st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>

      <div className="v1">
        <h1>Blog Details</h1>
        <BlogDetails show={showBlog} />
      </div>
    </div>
  );
}

export default App;
