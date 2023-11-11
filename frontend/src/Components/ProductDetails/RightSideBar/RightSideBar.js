import React, { useState } from "react";
import styles from "./RightSideBar.module.css";
import ReactSlider from "./ReactSlider/ReactSlider";

const RightSideBar = () => {
  return (
    <div className={styles.page}>
      <div className={styles.content}>
        <h1>Volini Spray 100gm</h1>
        <p>Treatments Pain Relief Application</p>
        <div className={styles.rating}>
          <p>5.0</p>
          <p>⭐⭐⭐⭐⭐</p>
          <p>(1 Ratings & 1 Reviews)</p>
        </div>
        <div className={styles.price}>
          <p className={styles.rs}>₹281.60 </p>
          <p className={styles.mrp}>
            MRP <span>₹320.00</span>
          </p>
          <p className={styles.save}>Save 12 %</p>
        </div>
        <button className={styles.addToCartBtn}>ADD TO CART</button>
        <p>SIZE:100g</p>
        <div className={styles.sizeOptions}>
          <button>100gm</button>
          <button>60gm</button>
          <button>40gm</button>
          <button>15gm</button>
          <button>200gm</button>
        </div>
      </div>

      {/* premium slider */}
      <div className={styles.sliderContainer}>
        <ReactSlider />
        <div className={styles.premium}>
          <p>Membership starting from ₹149 for 3 months</p>
        </div>
      </div>
    </div>
  );
};

export default RightSideBar;
