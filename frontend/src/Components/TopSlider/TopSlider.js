import React from 'react';
import styles from "./TopSlider.module.css";
import slide1 from "./images/slider1.jpg";
import slide2 from "./images/slider2.jpg";
import slide3 from "./images/slider3.jpg";
import slide4 from "./images/slider4.jpg";
import slide5 from "./images/slider5.jpg";

const TopSlider = () => {
    return (
        <div className={styles.slider}>
            <div className={styles.slide_track}>
                <div className={styles.slide}>
                    <img src={slide1} alt="" />
                </div>
                <div className={styles.slide}>
                    <img src={slide2} alt="" />
                </div>
                <div className={styles.slide}>
                    <img src={slide3} alt="" />
                </div>
                <div className={styles.slide}>
                    <img src={slide4} alt="" />
                </div>
                <div className={styles.slide}>
                    <img src={slide5} alt="" />
                </div>



            </div>
        </div>

    )
}

export default TopSlider