# 🎴 Java Tarot

A Java console application that simulates tarot card readings with visual shuffle effects and different spread types.

## 📋 About the Project

This project is a tarot deck simulator developed in Java, allowing users to perform different types of card readings interactively. The system ensures no card is repeated within the same drawing session, simulating a real deck experience.

## ✨ Features

### 🎯 Available Spreads
- **Single Card**: Simple one-card draw
- **Three Cards (Past/Present/Future)**: Classic three-position spread
- **Celtic Cross**: Complete 10-card reading with specific positions

### 🔧 Technical Features
- ✅ Non-repeating card system within the same session
- ✅ Animated shuffle visual effects
- ✅ Interactive console user interface
- ✅ Intuitive menu navigation
- ✅ Results pause for reading before returning to menu

## 🛠️ Technologies Used

- **Language**: Java (OpenJDK 25)
- **Architecture**: Object-Oriented Programming (OOP)
- **Libraries**: 
  - `java.util` (Collections, Random, Scanner)
  - Threads for animations

## 📁 Project Structure

```
java-tarot/
├── Baralho.java          # Main deck class
├── Menu.java             # User interface class
├── Main.java             # Program entry point
└── README.md             # This file
```

### Main Classes

1. **Baralho**: Manages cards, shuffling, and drawing
2. **Menu**: Controls user interface and navigation
3. **Main**: Application entry point

## 🚀 How to Run

### Prerequisites
- OpenJDK 25 or higher installed
- Terminal/Console with Unicode support (for symbols)

### Execution Steps

1. **Clone the repository:**
   ```bash
   git clone [REPOSITORY_URL]
   cd java-tarot
   ```

2. **Compile Java files:**
   ```bash
   javac Main.java
   ```

3. **Run the program:**
   ```bash
   java Main
   ```

### Alternative Execution (individual compilation)
```bash
javac Baralho.java Menu.java Main.java
java Main
```

## 📖 How to Use

1. When starting the program, you'll see a menu with 5 options:
   ```
   ═══════════════════════════════
           JAVA TAROT
   ═══════════════════════════════
   1. Shuffle cards
   2. Draw one card
   3. Draw 3 cards (past/present/future)
   4. Celtic Cross (complete spread)
   0. Exit
   ═══════════════════════════════
   ```

2. **Choose an option** by typing the corresponding number

3. **Follow on-screen instructions**:
   - The program will show a shuffle animation
   - It will display the reading results
   - It will wait for you to press ENTER to return to the menu

## 🃏 About the Deck

The implemented deck contains 78 complete cards:

### Major Arcana (22 cards)
- From "The Magician" (1) to "The Fool" (22)
- Includes all traditional tarot cards

### Minor Arcana (56 cards)
- Four suits: Cups, Pentacles, Swords, Wands
- Values: Ace, Two through Ten, Page, Knight, Queen, King

## 🔮 Celtic Cross Positions

The complete spread includes 10 positions with specific meanings:

1. **YOU (Present)**: Current situation
2. **CROSS (Challenge)**: Immediate obstacles
3. **CROWN (Goal)**: Goals and aspirations
4. **BASE (Root)**: Foundations of the situation
5. **BEHIND (Past)**: Past influences
6. **AHEAD (Future)**: Future possibilities
7. **ATTITUDE**: Your emotional posture
8. **ENVIRONMENT**: External influences
9. **HOPES/FEARS**: Expectations and worries
10. **OUTCOME**: Possible resolution

## 🛠️ Current Technical Implementation

### ✅ Implemented Features
- Non-repeating card system using index lists
- Shuffle animations with Thread.sleep()
- Functional menu interface
- Three different spread types
- Flow control with reading pauses

## 🚧 Planned Improvements

### Future Versions
1. **Robust user input handling**
2. **Automatic card interpretation system**
3. **Reversed cards mode**
4. **Reading save to file**
5. **Card draw statistics**
6. **Graphical user interface (GUI)**
7. **Meanings database**
8. **Multiple thematic decks**

## 🤝 Contributing

This project is under active development. To contribute:

1. Fork the project
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is available for educational and personal use. Feel free to modify and distribute, keeping credits to the original author.

## 👨‍💻 Author

Developed as a Java study project.

## 🙏 Acknowledgments

- Inspired by traditional tarot decks
- OpenJDK for providing an excellent development platform
- Java community for resources and documentation

---

**Note**: This software is intended for entertainment and study purposes. Readings are random and do not substitute professional advice.

✨ *May the cards be in your favor!* ✨
