// Footer.js
import React from "react";
import styles from "./Footer.module.css";
// counter
import CountUp from "react-countup";
import user from "./Images/user.png";
import location from "./Images/location.png";
import store from "./Images/store.png";

const Footer = () => {
  return (
    <div className={styles.container}>
      <div className={styles.pageContainer}>
        <div className={styles.sections}>
          <img src={store} alt="" />
          <div>
            <CountUp
              start={0}
              end={1000}
              duration={3}
              separator=","
              useEasing={true}
              useGrouping={true}
              enableScrollSpy
              className={styles.number}
            />
            <span>+</span>
            <p>Offline Stores</p>
          </div>
        </div>
        <div className={styles.sections}>
          <img src={location} alt="" />
          <div>
            <CountUp
              start={0}
              end={20000}
              duration={3}
              separator=","
              useEasing={true}
              useGrouping={true}
              enableScrollSpy
              className={styles.number}
            />
            <span>+</span>
            <p>Pincodes Served</p>
          </div>
        </div>
        <div className={styles.sections}>
          <img src={user} alt="" />
          <div>
            <CountUp
              start={0}
              end={9}
              duration={3}
              separator=","
              useEasing={true}
              useGrouping={true}
              enableScrollSpy
              className={styles.number}
            />
            <span>M+</span>
            <p>Happy Customers</p>
          </div>
        </div>
      </div>
      <footer className={styles.footer}>
        <div className={styles.section}>
          <h3>COMPANY</h3>
          <ul>
            <li>About Medicare</li>
            <li>Customers Speak</li>
            <li>In the News</li>
            <li>Terms and Conditions</li>
            <li>Privacy Policy</li>
            <li>Contact</li>
          </ul>
        </div>

        <div className={styles.section}>
          <h3>SHOPPING</h3>
          <ul>
            <li>Browse by Manufacturers</li>
            <li>Health Articles</li>
            <li>Offers / Coupons</li>
            <li>FAQs</li>
          </ul>
        </div>

        <div className={styles.section}>
          <h3>BUSINESS</h3>
          <ul>
            <li>Franchise</li>
            <li>CATEGORIES</li>
            <li>Ayush</li>
            <li>Devices</li>
            <li>Family Care</li>
            <li>Fitness</li>
            <li>Lifestyle</li>
            <li>Personal care</li>
            <li>Treatments</li>
          </ul>
        </div>

        <div className={styles.section}>
          <h3>SOCIAL</h3>
          <ul>
            <li>Patients Alike</li>
            <li>Facebook</li>
            <li>Twitter</li>
            <li>LinkedIn</li>
            <li>Youtube</li>
            <li>Refer & Earn</li>
          </ul>
        </div>

        <div className={styles.section}>
          <h3>SUBSCRIBE TO OUR NEWSLETTER</h3>
          <p>
            Get a free subscription to our health and fitness tips and stay
            tuned to our latest offers
          </p>
          <div className={styles.newsletterForm}>
            <input type="email" placeholder="Enter your email address" />
            <button className={styles.go}>Go</button>
          </div>
          <div className={styles.appDownload}>
            <p>Download Medicare App for iOS from App Store</p>
          </div>
        </div>
      </footer>
    </div>
  );
};

export default Footer;
