# Machine Test - API Testing Documentation

## Author Information
**Name:** Jitesh Shringare  
**Organization:** Qspider Thane

## API Endpoints for Postman Tool Testing

### 1) Category Endpoints

- **Add Category**  
  - **URL**: `http://localhost:8080/api/categories`
  - **Method**: POST

- **Get Category by ID**  
  - **URL**: `http://localhost:8080/api/categories/1`
  - **Method**: GET

- **Get All Categories**  
  - **URL**: `http://localhost:8080/api/categories`
  - **Method**: GET

- **Update Category**  
  - **URL**: `http://localhost:8080/api/categories/1?cname=Mobiles`
  - **Method**: PUT

- **Delete Category**  
  - **URL**: `http://localhost:8080/api/categories/4`
  - **Method**: DELETE

### 2) Product Endpoints

- **Add Product**  
  - **URL**: `http://localhost:8080/api/products/add`
  - **Method**: POST

- **Get Product by ID**  
  - **URL**: `http://localhost:8080/api/products/2`
  - **Method**: GET

- **Get All Products**  
  - **URL**: `http://localhost:8080/api/products/all`
  - **Method**: GET

- **Update Product**  
  - **URL**: `http://localhost:8080/api/products/1`
  - **Method**: PUT

- **Delete Product**  
  - **URL**: `http://localhost:8080/api/products/3`
  - **Method**: DELETE

While testing, make sure to refer to the annotation mapping given in the `com.nmt.service` package class-wise.



        
