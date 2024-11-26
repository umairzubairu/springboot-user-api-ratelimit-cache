# User-api-ratelimit-cache

The **User api ratelimit cache Service** is a Spring Boot application designed to demo the ratelimit feature using java and spring. It implements caching for frequently accessed data and rate limiting to prevent abuse of the service.

---

## **Features**
1. **User Profile Management**:
    - Retrieve user profiles by their unique IDs (same id will be return with the hardcode name)

2. **Caching**:
    - Caches frequently accessed user data to improve response times.
    - Cache entries are automatically evicted after 15 minutes of inactivity.

3. **Rate Limiting**:
    - Limits (10 request per min) the number of API requests a user can make within a specific time (1 minute) frame to ensure fair usage and prevent abuse.

4. **API Versioning**:
    - Supports versioning with `/v1` in the endpoints to ensure backward compatibility concept.

---

## **Technologies Used**
- **Java 17**
- **Spring Boot** (Core, Web, Cache)
- **Maven** (Dependency Management)

---

## **Getting Started**

### **Prerequisites**
- Java 17
- Maven
- IDE of your choice (e.g., IntelliJ IDEA, Eclipse)

---

### **Running the Application**

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/umairzubairu/springboot-user-api-ratelimit-cache.git
   cd springboot-user-api-ratelimit-cache
   ```

2. **Build the Project**:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**:
   The application runs on `http://localhost:8080` by default.

---

### **Endpoints**

#### **Get User Profile**
- **Endpoint**: `/api/v1/user/profiles/{userId}`
- **Method**: `GET`
- **Description**: Retrieves the user profile by the given user ID.
- **Response**:
    - Success: User profile details.
    - Error: Appropriate error message with an HTTP status code.

#### **Clear Cache for User**
- **Endpoint**: `/api/v1/cache/{userId}`
- **Method**: `DELETE`
- **Description**: Clears the cache for a specific user.

#### **Clear All Cache**
- **Endpoint**: `/api/v1/cache`
- **Method**: `DELETE`
- **Description**: Clears the entire user profile cache.

---

### **Configuration**

#### **Cache Settings**
The cache is configured in `CacheConfig`:
- Cache name: `userProfiles`
- TTL: 15 minutes (default)

#### **Rate Limiting**
The rate limiting logic is configured in `RateLimiterConfig`.

---

## **Project Structure**
```plaintext
src/main/java/com/uzu/user
├── config          # Cache and other configurations
├── controller      # REST controllers
├── service         # Business logic and caching
└── model           # Data models (e.g., UserProfile)
```

---

## **Future Enhancements**
1. Add support for distributed caching (e.g., Redis) with on/off switch.
2. Implement dynamic rate-limiting rules.
3. Provide CRUD operations for user profiles.

---

## **Contributing**
Contributions are welcome! Please fork the repository and submit a pull request.