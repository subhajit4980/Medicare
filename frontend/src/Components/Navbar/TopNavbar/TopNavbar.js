import React from "react";
import styles from "./TopNavbar.module.css";
import userImage from "../images/user-solid.svg";
import cartImage from "../images/cart-shopping-solid.svg";
import searchImage from "../images/magnifying-glass-solid.svg";
import ProductImg from "../images/Product.svg"
import logoImage from "../images/notes-medical-solid.svg";
import ImageButton from "../../Button/ImageButton/ImageButton";
import { Link } from "react-router-dom";


function TopNavbar() {
  return (
    <div className={styles.TopNavbar}>
      <img className={styles.logo} src={logoImage} alt="logoImage Medicare" />
      <div className={styles.searchContainer}>
        <div className={styles.searchInputContainer}>
          <img
            className={styles.search_img}
            src={searchImage}
            alt="search_image"
          />
          <input
            type="text"
            className={styles.searchInput}
            placeholder="Search..."
          />
        </div>
        <button className={styles.searchButton}>Search</button>
      </div>
      <ImageButton url={userImage} text="LogIn" />
      <ImageButton url={cartImage} text="Cart" />
      <Link to="products">
        <ImageButton url={ProductImg} text="Products" /></Link>
    </div>
  );
}

export default TopNavbar;
