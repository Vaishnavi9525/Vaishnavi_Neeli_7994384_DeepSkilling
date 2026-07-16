import './App.css';

import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

import { books } from './Books';
import { blogs } from './Blogs';
import { courses } from './Courses';

function App() {

    // Method 1 : Element Variable
    const bookdet = <BookDetails books={books} />;

    // Method 2 : Ternary Operator
    const content = true
        ? <BlogDetails blogs={blogs} />
        : <h3>No Blogs Available</h3>;

    // Method 3 : Logical &&
    const coursedet = true && <CourseDetails courses={courses} />;

    return (

        <div className="container">

            <div className="column">
                <h1>Course Details</h1>
                {coursedet}
            </div>

            <div className="column">
                <h1>Book Details</h1>
                {bookdet}
            </div>

            <div className="column">
                <h1>Blog Details</h1>
                {content}
            </div>

        </div>

    );
}

export default App;