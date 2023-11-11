import React from "react";
import styles from "./ProductCard.module.css";
import medicinesImg from "../../TopSection/Image/medicines.jpg";
import { Link } from "react-router-dom";
const ProductCart = () => {
  return (
    <div className={styles.card}>
      {/* link to the details page */}
      <Link to="/products/product1">
        <img
          className={styles.cardImg}
          src={medicinesImg}
          alt="Lab test_image"
        />
        <h2 className={styles.name}>Product Name</h2>
        <p className={styles.bestPrice}>
          Best Price:<span>Rs:₹45.33</span>
        </p>
        <p className={styles.mrpPrice}>
          MRP:<span>Rs:₹122.33</span>
        </p>
        <div className={styles.button}>
          <button className={styles.btn}>Add To Cart</button>
        </div>
      </Link>
    </div>
  );
};

export default ProductCart;
