# CRUD Functionality with In-Memory Storage

This project is a simple Spring Boot REST API that provides basic CRUD operations using in-memory storage. It is lightweight, does not require a database, and is ideal for learning or quick prototyping.

## Features:
- **Create**: Add new items.
- **Read**: Retrieve all or specific items.
- **Update**: Modify existing items.
- **Delete**: Remove items.

## Requirements:
- Java 17 or higher
- Maven 3.6+

## How to Run:

1. **Clone the repository**:
   ```bash
   git clone <repository_url>
   cd <repository_directory>
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

   The application will start running on [http://localhost:8080](http://localhost:8080).

## File Structure

```
journalApp
│
├── .idea
├── .mvn
├── src
│   └── main
│       └── java
│           └── com.rajatjoshi.journalApp
│               ├── controller
│               │   ├── HealthCheck
│               │   └── JournalEntryController
│               ├── entity
│               └── JournalApplication
├── resources
├── test
├── target
├── .gitattributes
└── .gitignore
```

## API Endpoints

### Create a new item
- **POST** `/api/items`

  **Request Body (JSON):**
  ```json
  {
    "name": "Item Name",
    "description": "Item Description"
  }
  ```

  **Response (Success):**
  ```json
  {
    "id": 1,
    "name": "Item Name",
    "description": "Item Description"
  }
  ```

### Get all items
- **GET** `/api/items`

  **Response:**
  ```json
  [
    {
      "id": 1,
      "name": "Item Name",
      "description": "Item Description"
    },
    {
      "id": 2,
      "name": "Another Item",
      "description": "Another Description"
    }
  ]
  ```

### Get item by ID
- **GET** `/api/items/{id}`

  **Response:**
  ```json
  {
    "id": 1,
    "name": "Item Name",
    "description": "Item Description"
  }
  ```

### Update an item
- **PUT** `/api/items/{id}`

  **Request Body (JSON):**
  ```json
  {
    "name": "Updated Item Name",
    "description": "Updated Item Description"
  }
  ```

  **Response:**
  ```json
  {
    "id": 1,
    "name": "Updated Item Name",
    "description": "Updated Item Description"
  }
  ```

### Delete an item
- **DELETE** `/api/items/{id}`

  **Response (Success):**
  ```json
  {
    "message": "Item deleted successfully"
  }
  ```
