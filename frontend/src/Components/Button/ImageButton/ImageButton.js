import React from 'react';
import styles from './ImageButton.module.css';



const ImageButton = (props) => {
    const Image = props.url;
    const text = props.text;
    return (
        <div className={styles.container}>
            <img className={styles.img} src={Image} alt="user_image" />
            <button className={styles.btn}>{text}</button>
        </div>
    )
}

export default ImageButton