import React from "react";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import styles from "./ReactSlider.module.css";

import firstImage from "./Images/1.png";
import secondImage from "./Images/2.png";
import thirdImage from "./Images/3.png";
// previous and next button style

import { SampleNextArrow, SamplePrevArrow } from "./Buttons";
const ReactSlider = () => {
  const settings = {
    dots: true,
    infinite: true,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true,
    autoplaySpeed: 2000,
    pauseOnHover: true,
    nextArrow: <SampleNextArrow />,
    prevArrow: <SamplePrevArrow />,
  };
  return (
    <Slider {...settings} className={styles.slider}>
      <div className={styles.slide}>
        <img className={styles.img} src={firstImage} alt="First_Image" />
        <div className={styles.text}>
          <p className={styles.offer}>Additional 2% NMS cash</p>
          <p className={styles.validity}>max ₹100 on prepaid medicine</p>
          <p className={styles.slideNo}>1/3</p>
        </div>
      </div>
      <div className={styles.slide}>
        <img className={styles.img} src={secondImage} alt="second_Image" />
        <div className={styles.text}>
          <p className={styles.offer}>Unlimited Free Delivery</p>
          <p className={styles.validity}>free delivery on order above ₹99</p>
          <p className={styles.slideNo}>2/3</p>
        </div>
      </div>
      <div className={styles.slide}>
        <img className={styles.img} src={thirdImage} alt="third_Image" />
        <div className={styles.text}>
          <p className={styles.offer}>Super Fast Delivery</p>
          <p className={styles.validity}>Quality Delivery on every order</p>
          <p className={styles.slideNo}>3/3</p>
        </div>
      </div>
    </Slider>
  );
};

export default ReactSlider;
