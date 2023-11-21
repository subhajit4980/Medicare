import React, { useState } from 'react';
import styles from './Rating.module.css'; // Import CSS module

const ProductReviewsPage = () => {
    const [reviews, setReviews] = useState([
        {
            id: 1,
            author: 'John Doe',
            date: 'October 15, 2023',
            rating: 5,
            content:
                'This product is amazing! It exceeded my expectations. I highly recommend it.',
        },
        {
            id: 2,
            author: 'Jane Smith',
            date: 'October 10, 2023',
            rating: 4,
            content:
                'Good product, but there is room for improvement. I would buy it again.',
        },
        // Add more reviews as needed
    ]);

    // Calculate the average rating
    const averageRating =
        reviews.reduce((total, review) => total + review.rating, 0) / reviews.length;

    return (
        <div className={styles.productReviewsPage}>
            <h1>Product Reviews</h1>
            <div className={styles.container}>
                <div className={styles.averageRating}>
                    <h2>Average Rating:<span className={styles.ratingValue}>{averageRating.toFixed(1)}</span></h2>

                    <button className={styles.writeReviewButton}>Write a Review</button>
                </div>

                <div className={styles.reviewsContainer}>
                    {reviews.map((review) => (
                        <div key={review.id} className={styles.review}>
                            <div className={styles.reviewHeader}>
                                <div className={styles.reviewAuthor}>{review.author}</div>
                                <div className={styles.reviewDate}>{review.date}</div>
                                <div className={styles.reviewRating}>Rating: {review.rating}</div>
                            </div>
                            <p className={styles.reviewContent}>{review.content}</p>
                        </div>
                    ))}
                    <button>More</button>
                </div>
            </div>
        </div>
    );
};

export default ProductReviewsPage;
