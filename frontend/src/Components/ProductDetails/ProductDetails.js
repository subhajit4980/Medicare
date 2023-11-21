import React from "react";
import styles from "./ProductDetails.module.css";
import ImageSlider from "./ImageSlider/ImageSlider";
import RightSideBar from "./RightSideBar/RightSideBar";
import More from "./MoreSection/More";
import Rating from "./Rating/Rating";

const ProductDetails = () => {
  return (<>
    <div className={styles.container}>
      <div className={styles.leftContainer}>
        <ImageSlider />
      </div>
      <div className={styles.rightContainer}>
        <RightSideBar />
      </div>

    </div>
    <More />
    <Rating />
  </>
  );
};

export default ProductDetails;
