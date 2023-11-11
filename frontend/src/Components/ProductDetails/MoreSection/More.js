import React, { useState } from "react";
import styles from "./More.module.css";
const More = () => {
  const [activeContentIndex, setActiveContentIndex] = useState(0);
  return (
    <div className={styles.more}>
      <div className={styles.btn}>
        <button
          className={activeContentIndex === 0 ? styles.active : ""}
          onClick={() => setActiveContentIndex(0)}
        >
          Therapeutic Uses
        </button>
        <button
          className={activeContentIndex === 1 ? styles.active : ""}
          onClick={() => setActiveContentIndex(1)}
        >
          Warning & Precautions
        </button>
        <button
          className={activeContentIndex === 2 ? styles.active : ""}
          onClick={() => setActiveContentIndex(2)}
        >
          Interactions
        </button>
        <button
          className={activeContentIndex === 3 ? styles.active : ""}
          onClick={() => setActiveContentIndex(3)}
        >
          Directions & For Use
        </button>
        <button
          className={activeContentIndex === 4 ? styles.active : ""}
          onClick={() => setActiveContentIndex(4)}
        >
          Side Effects
        </button>
        <button
          className={activeContentIndex === 5 ? styles.active : ""}
          onClick={() => setActiveContentIndex(5)}
        >
          More Information
        </button>
      </div>
      {activeContentIndex === 0 && (
        <div>
          <h1>What Volini is Used For?</h1>
          <p>
            Volini is a nutritional supplement that contains various components
            with several uses to support overall health and well-being.
          </p>

          <h2>Ginseng:</h2>
          <p>
            <ul>
              <li>
                Promotes carbohydrate metabolism and allows skeletal muscle to
                oxidize free fatty acids for energy production.
              </li>
              <li>
                Supports male reproductive health by promoting testosterone and
                spermatozoa levels.
              </li>
              <li>
                Promotes memory and learning and nutritionally supports immune
                function and cardiovascular health.
              </li>
            </ul>
          </p>

          <h2>Vitamins:</h2>
          <p>
            <ul>
              <li>
                Vitamin C, vitamin A, and vitamin D help in the development and
                maintenance of bones, cartilage, teeth, and gums.
              </li>
              <li>
                Vitamin C helps in connective tissue formation and wound
                healing.
              </li>
              <li>
                Vitamin B2, vitamin B6, and pantothenic acid help in tissue
                formation.
              </li>
              <li>Folate and vitamin B12 help to form red blood cells.</li>
              <li>
                Vitamin C and vitamin E act as antioxidants to prevent oxidative
                stress.
              </li>
              <li>
                Vitamin A helps maintain eyesight, skin, membranes, and immune
                function.
              </li>
              <li>
                Vitamin C, vitamin B1, vitamin B2, vitamin B3, vitamin B6,
                vitamin B12, and vitamin B9 help the body metabolize fats and
                proteins.
              </li>
            </ul>
          </p>

          <h2>Minerals:</h2>
          <p>
            <ul>
              <li>Help maintain immune function.</li>
              <li>Provide support for healthy metabolism.</li>
              <li>Support the function of the thyroid gland.</li>
              <li>
                Aid in the development and maintenance of bones and teeth.
              </li>
              <li>Assist in tissue formation.</li>
              <li>
                Help to form red blood cells and ensure their proper function.
              </li>
              <li>Maintain proper muscle function.</li>
              <li>Act as antioxidants for the maintenance of good health.</li>
            </ul>
          </p>
        </div>
      )}

      {activeContentIndex === 1 && (
        <div>
          <p>Talk to your doctor before taking Volini, if you:</p>
          <ul>
            <li>Are allergic to any of the ingredients in Volini</li>
            <li>
              Have stomach or intestinal ulcers, heart, liver or kidney disease
              or any other medical conditions
            </li>
          </ul>
        </div>
      )}
      {activeContentIndex === 2 && (
        <div>
          <p>
            Tell your doctor before taking Volini, if you are taking any other
            medicine including medicines obtained without prescription or any
            other supplements or herbal products.
          </p>
        </div>
      )}
      {activeContentIndex === 3 && (
        <div>
          <p>
            Always take Volini exactly as your health care provider has told you
          </p>
        </div>
      )}
      {activeContentIndex === 4 && (
        <div>
          <p>
            Volini may cause nausea, vomiting, stomach upset, headache, skin
            rashes or other allergic reactions, although not everybody gets them
          </p>
        </div>
      )}
      {activeContentIndex === 5 && (
        <div>
          <p>
            Keep out of reach of children Store at room temperature (15-25ºC) Do
            not use after the expiry date
          </p>
        </div>
      )}
    </div>
  );
};

export default More;
