# MediCare - Medicine Shopping App

## Description

MediCare is a comprehensive medicine shopping application designed to provide users with a seamless experience in purchasing medicines and healthcare products. 
Built on a Spring Boot backend, this application offers a range of functionalities to cater to the diverse needs of users looking for medicinal products.
## BASE IP ADDRESS :[https://medicare.up.railway.app/](https://medicare.up.railway.app/api/productUser/getItem)
## Features

- **User Authentication**: Register new users and authenticate login credentials securely.
- **Browse Medicines**: Access a wide range of medicines with detailed information.
- **Product Details**: View comprehensive details of each medicine, including dosage, price, and availability.
- **Shopping Cart**: Add, update, or remove items from the cart for easy purchasing.
- **Checkout Process**: Secure payment gateways and order confirmation.

## REST API Endpoints

### Authentication

- `/api/auth/signup` - POST: Register a new user.
- `/api/auth/signin` - POST: User login to the application.
- `/api/auth/forget_password` - POST: Request to reset the password.
- `/api/auth/verify_OTP` - POST: Verify the One-Time Password (OTP) for password reset.
- `/api/auth/update_Password` - POST: Update the password after successful verification.

### Product Admin Endpoints

#### Add Item
- **POST /api/productsAdmin/create**
  - Description: Add a new item to the database.
  - Method: `POST`
  - Body: `Product` object with item details.

#### Update Item
- **POST /api/productsAdmin/update**
  - Description: Update item data in the database.
  - Method: `POST`
  - Body: `ProductRequest` object with item ID and updated details.

#### Delete Item
- **POST /api/productsAdmin/delete**
  - Description: Delete an item from the database.
  - Method: `POST`
  - Body: `ProductRequest` object with item ID.

### Product User 

#### Get All Items
- **GET /api/productUser/getItem**
  - Description: Retrieve all items from the database.
  - Method: `GET`

#### Filter by Discount
- **GET /api/productUser/filterByDiscount**
  - Description: Filter products by a specific discount percentage.
  - Method: `GET`
  - Parameters:
    - `discount` (double): Discount percentage.

#### Filter Product by Discount
- **GET /api/productUser/filterProductByDiscount**
  - Description: Filter a particular product by a specific discount percentage.
  - Method: `GET`
  - Parameters:
    - `discount` (double): Discount percentage.
    - `product` (string): Name of the product.

#### Filter by Category
- **GET /api/productUser/filterByCategory**
  - Description: Filter products by category.
  - Method: `GET`
  - Parameters:
    - `category` (string): Category name.

#### Filter by Range Discount
- **GET /api/productUser/filterByRangeDiscount**
  - Description: Filter products by a range of discount percentages.
  - Method: `GET`
  - Parameters:
    - `minDiscount` (double): Minimum discount percentage.
    - `maxDiscount` (double): Maximum discount percentage.

#### Filter Product by Range Discount
- **GET /api/productUser/filterProductByRangeDiscount**
  - Description: Filter a particular product by a range of discount percentages.
  - Method: `GET`
  - Parameters:
    - `minDiscount` (double): Minimum discount percentage.
    - `maxDiscount` (double): Maximum discount percentage.
    - `product` (string): Name of the product.

#### Filter by Popularity
- **GET /api/productUser/filterByPopularity**
  - Description: Filter products by popularity (based on the number of buyers).
  - Method: `GET`

#### Filter Product by Popularity
- **GET /api/productUser/filterProductByPopularity**
  - Description: Filter a particular product by popularity (based on the number of buyers).
  - Method: `GET`
  - Parameters:
    - `product` (string): Name of the product.


### Cart

#### Add to Cart
- **POST /api/order/addCart**
  - Description: Add an item to the cart.
  - Method: `POST`
  - Body: `CartRequest` object with item ID, username, and quantity.

#### Delete Cart Item
- **POST /api/order/deleteCartItem**
  - Description: Remove an item from the cart.
  - Method: `POST`
  - Parameters:
    - `cartId` (string): Cart item ID.

#### Increase Item Quantity in Cart
- **POST /api/order/increaseItemInCart**
  - Description: Increase the quantity of an item in the cart.
  - Method: `POST`
  - Parameters:
    - `cartId` (string): Cart item ID.
    - `increment` (int): Quantity to increment.

#### Decrease Item Quantity in Cart
- **POST /api/order/decreaseItemInCart**
  - Description: Decrease the quantity of an item in the cart.
  - Method: `POST`
  - Parameters:
    - `cartId` (string): Cart item ID.
    - `decrement` (int): Quantity to decrement.

#### Get Cart Items
- **GET /api/order/cart**
  - Description: Retrieve cart items for a specific user.
  - Method: `GET`
  - Parameters:
    - `username` (string): Username to fetch cart items.

### Orders

#### Buy Product
- **POST /api/order/buy**
  - Description: Buy a product and create an order.
  - Method: `POST`
  - Body: `OrderRequest` object with item ID, quantity, user details, and order information.

## Security

- Token-based authentication ensuring secure user access.
- Consistent error handling for invalid requests and security breaches.

## Error Handling

- Utilization of appropriate HTTP status codes for error responses.
- Clear and descriptive error messages for enhanced user understanding.

## Technologies Used

- **Spring Boot**: Backend framework for robust application development.
- **Java**: Primary programming language for implementing backend logic.
- **RESTful APIs**: Architecture for communication between client and server.
- **MongoDB**: No SQL Database management systems for data storage.
- **Spring Security**: Implementation of security features and authentication.

## Setup Instructions

1. **Clone Repository**: Clone the repository from GitHub.
2. **Configure Database**: Set up a MongoDB database and configure database properties in `application.properties`.
3. **Run Application**: Use Maven to build and run the Spring Boot application.
4. **Access Endpoints**: Utilize the provided endpoints for various functionalities.

## Usage

1. **Register/Login**: Create a new account or log in using existing credentials.
2. **Browse Medicines**: Explore available medicines and view details.
3. **Add to Cart**: Select desired medicines and add them to the cart.
4. **Checkout**: Complete the purchase process by placing an order securely.

## Contributing

Contributions are most welcome! 
If you'd like to contribute to the project, 
please fork the repository and create a pull request.



