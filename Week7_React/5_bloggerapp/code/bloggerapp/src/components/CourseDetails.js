import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      {courses.map((course, index) =>
        course.name ? (
          <div key={index}>
            <h2>{course.name}</h2>
            <h4>{course.date}</h4>
          </div>
        ) : null
      )}
    </div>
  );
};

export default CourseDetails;
