import React from 'react';
import styles from "./Card.module.css";
import medicineImage from "../Image/medicines.jpg";
function Card(props) {
    return (
        <div className={styles.card}>
            <img src={props.img} alt="Card_Image" />
            <div className={styles.card_content}>
                <h2>{props.title}</h2>
                <p>{props.offer}</p>
            </div>
        </div>
    );
}

export default Card;