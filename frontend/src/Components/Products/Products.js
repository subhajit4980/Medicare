import React from 'react';
import styles from './Products.module.css';
import ProductCard from './ProductCard/ProductCard';

const Products = () => {
    return (
        <div className={styles.container}>
            <ProductCard />
            <ProductCard />
            <ProductCard />
            <ProductCard />
            <ProductCard />
            <ProductCard />
            <ProductCard />
        </div>
    )
}

export default Products