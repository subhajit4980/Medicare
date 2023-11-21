import React from 'react'
import styles from "./TopSection.module.css";

import medicineImg from "./Image/medicines.jpg";
import healthCareImg from "./Image/healthcare.jpg";
import labTestImg from "./Image/labtest.jpg";
import blogImg from "./Image/blog.jpg";
import offersImg from "./Image/offers.jpg";
import memberImg from "./Image/member.jpg";
import valueStoreImg from "./Image/valueStore.jpg";

import Card
    from './Card/Card';
const TopSection = () => {
    return (
        <div className={styles.container}>
            <Card img={medicineImg} title="Medicine" offer="Upto 65% ff" />
            <Card img={labTestImg} title="Lab Test" offer="Upto 65% ff" />
            <Card img={healthCareImg} title="Health Care" offer="Upto 65% ff" />
            <Card img={blogImg} title="Blog" offer="Upto 65% ff" />
            <Card img={memberImg} title="Plus Member" offer="Upto 65% ff" />
            <Card img={offersImg} title="Offers" offer="Upto 70% ff" />
            <Card img={valueStoreImg} title="Value Store" offer="Upto 70% ff" />


        </div>
    )
}

export default TopSection