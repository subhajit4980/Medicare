import React from 'react';
import styles from "./TopSlider.module.css";
import slide1 from "./images/slider1.jpg";
import slide2 from "./images/slider2.jpg";
import slide3 from "./images/slider3.jpg";
import slide4 from "./images/slider4.jpg";
import slide5 from "./images/slider5.jpg";

const TopSlider = () => {

    const handleSlideClick = (slideNumber) => {
        // Define the URLs for each slide
        const slideUrls = [
            'https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Image_created_with_a_mobile_phone.png/1200px-Image_created_with_a_mobile_phone.png',
            'https://example.com/slide2',
            'https://example.com/slide3',
            'https://example.com/slide4',
            'https://example.com/slide5',
        ];

        // Open a new window with the corresponding URL when a slide is clicked
        window.open(slideUrls[slideNumber - 1], '_blank');
    };

    return (
        <div className={styles.slider}>
            <div className={styles.slide_track}>
                <div className={styles.slide} onClick={() => handleSlideClick(1)}>
                    <img src={slide1} alt="" />
                </div>
                <div className={styles.slide} onClick={() => handleSlideClick(2)}>
                    <img src={slide2} alt="" />
                </div>
                <div className={styles.slide} onClick={() => handleSlideClick(3)}>
                    <img src={slide3} alt="" />
                </div>
                <div className={styles.slide} onClick={() => handleSlideClick(4)}>
                    <img src={slide4} alt="" />
                </div>
                <div className={styles.slide} onClick={() => handleSlideClick(5)}>
                    <img src={slide5} alt="" />
                </div>
            </div>
        </div>
    );
};

export default TopSlider;
