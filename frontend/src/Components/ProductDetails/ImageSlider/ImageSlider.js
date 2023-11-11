import React, { useState } from "react";
import styles from "./ImageSlider.module.css";

// dummy Images
import medicineImg from "../../TopSection/Image/medicines.jpg";
import healthCareImg from "../../TopSection/Image/healthcare.jpg";
import labTestImg from "../../TopSection/Image/labtest.jpg";
import blogImg from "../../TopSection/Image/blog.jpg";
import offersImg from "../../TopSection/Image/offers.jpg";

const ImageSlider = () => {
  const [activeContentIndex, setActiveContentIndex] = useState(0);
  const [imageSource, setImageSource] = useState(medicineImg);
  return (
    <div className={styles.container}>
      <div className={styles.left}>
        <img
          className={
            activeContentIndex === 0
              ? `${styles.active} ${styles.demo}`
              : styles.demo
          }
          onClick={() => {
            setActiveContentIndex(0);
            setImageSource(medicineImg);
          }}
          src={medicineImg}
          alt="Slider _image"
        />
        <img
          className={
            activeContentIndex === 1
              ? `${styles.active} ${styles.demo}`
              : styles.demo
          }
          onClick={() => {
            setActiveContentIndex(1);
            setImageSource(healthCareImg);
          }}
          src={healthCareImg}
          alt="Slider _image"
        />
        <img
          className={
            activeContentIndex === 2
              ? `${styles.active} ${styles.demo}`
              : styles.demo
          }
          onClick={() => {
            setActiveContentIndex(2);
            setImageSource(labTestImg);
          }}
          src={labTestImg}
          alt="Slider _image"
        />
        <img
          className={
            activeContentIndex === 3
              ? `${styles.active} ${styles.demo}`
              : styles.demo
          }
          onClick={() => {
            setActiveContentIndex(3);
            setImageSource(blogImg);
          }}
          src={blogImg}
          alt="Slider _image"
        />
        <img
          className={
            activeContentIndex === 4
              ? `${styles.active} ${styles.demo}`
              : styles.demo
          }
          onClick={() => {
            setActiveContentIndex(4);
            setImageSource(offersImg);
          }}
          src={offersImg}
          alt="Slider _image"
        />
      </div>
      <div className={styles.right}>
        <img
          className={styles.actualImage}
          src={imageSource}
          alt="Slide_Image"
        />
      </div>
    </div>
  );
};

export default ImageSlider;
