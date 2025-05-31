# 🎮 VideoGameChar Java Project

This Java project demonstrates object-oriented programming by modeling video game characters. It includes a `VideoGameChar` class and a `VideoGameCharDriver` class for user interaction.

## 📌 Features

- Create and name two characters (Hero and Villain)
- Set maximum health and remaining health for each character
- Calculate and display the health percentage
- Format character details using a `toString()` method

## 🧩 Classes

### `VideoGameChar`

Represents a game character with:
- `name` – Character's name
- `maxhealth` – Maximum health value
- `remaininghealth` – Current health value

**Methods include:**
- Getters and setters for all fields
- `getHealthPercentage()` – Returns remaining health as a percentage
- `toString()` – Returns a formatted string with character stats

### `VideoGameCharDriver`

- Uses `Scanner` to get user input
- Creates and configures Hero and Villain objects
- Displays each character's information with percentage health

## 🛠 How to Run

1. Compile the Java files:
   ```bash
   javac VideoGameChar.java VideoGameCharDriver.java


2. Run the driver: 
java VideoGameCharDriver


4. Follow the prompts to enter:
- Hero and villain names
- Max and remaining health values

## Sample Output

```
Welcome to the VideoGameChar class driver
Please enter the name of the hero: Link
You entered: Link
Please enter the name of the villain: Ganon
You entered: Ganon
Please enter Link's max health: 100
You entered: 100.0
Please enter Ganon's max health: 120
You entered: 120.0
Please enter Link's remaining health: 75
You entered: 75.0
Please enter Ganon's remaining health: 45
You entered: 45.0
Link:75.0 out of 100.0 health or 75.0 %
Ganon:45.0 out of 120.0 health or 37.5 %
```



---

## 👩🏽‍💻 Author
Lavincia S.
Created: February 11, 2022

