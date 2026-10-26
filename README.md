# 💧 Water Tank Demo

A simple Java console program that demonstrates the **Stack** data structure (LIFO: Last In, First Out) using a water tank and buckets as a real-life analogy.

Each bucket of water poured into the tank is **pushed** onto the stack, and each drain **pops** the most recently poured bucket.

---

## 📖 Concept

| Tank Action | Stack Operation | Method |
|-------------|-----------------|--------|
| Pour a bucket in | `push` | `pour(int liters)` |
| Drain the top bucket | `pop` | `drain()` |
| Look at the top bucket | `peek` | `checkTop()` |
| Is the tank empty? | `isEmpty` | `isEmpty()` |
| Number of buckets | `size` | `bucketCount()` |
| Total water inside | sum of all elements | `totalLiters()` |

The tank is backed by a fixed-size `int[]` array and a `top` index (starts at `-1`).

- **Overflow**: pouring into a full tank spills the water on the floor.
- **Underflow**: draining an empty tank prints a warning and returns `0`.

---

## ✨ Features

- Array-based stack implementation
- Two constructors:
  - No-argument constructor: creates a "Standard Tank" with a capacity of 5 buckets
  - Parameterized constructor: custom name and capacity
- Overflow and underflow handling
- ASCII art visualization of the tank (`drawTank()`)
- Banners and dividers for readable console output

---

## 🗂️ Project Structure

```
.
├── README.md
└── src
    └── antonnyy
        └── WaterTankDemo.java
```

---

## 🚀 Getting Started

### Requirements

- Java JDK 11 or higher (JDK 8+ will work if you replace `String.repeat()` in the banner helpers)

### Compile and Run

From the project root:

```bash
# Compile
javac -d out src/antonnyy/WaterTankDemo.java

# Run
java -cp out antonnyy.WaterTankDemo
```

### Run in an IDE

1. Open the project in Eclipse, IntelliJ IDEA, or VS Code.
2. Make sure `WaterTankDemo.java` is inside the `antonnyy` package.
3. Run the `main` method.

---

## 🖥️ Sample Visualization

After pouring 10L, 20L, and 15L into the Standard Tank, `drawTank()` prints:

```
      ~ Standard Tank ~
     |           |
     |           |
     |           |
     |~~  15L ~~| <- TOP
     |~~  20L ~~| <-    
     |~~  10L ~~| <-    
     +===========+
      \_________/
```

---

## 🧪 What the Demo Does

**Tank 1 (Standard Tank, capacity 5)**
1. Pours 10L, 20L, and 15L
2. Shows the top bucket
3. Drains one bucket
4. Prints remaining buckets and total liters

**Tank 2 (Mini Tank, capacity 3)**
1. Pours 5L, 10L, and 15L (tank is now full)
2. Tries to pour 20L, which triggers **Overflow**
3. Drains four times, and the fourth drain triggers **Underflow**
4. Checks whether the tank is empty

---

## 📚 What You Will Learn

- How a stack works using an array
- Constructor overloading
- Encapsulation with private fields and public methods
- Handling overflow and underflow conditions
- Writing clean console output

---

## 🤝 Contributing

Suggestions and improvements are welcome. Fork the repo, make your changes, and open a pull request.

---

## 👤 Author

**Antonnyy**

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
