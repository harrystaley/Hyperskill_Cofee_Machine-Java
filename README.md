# Hyperskill Coffee Machine - Java

This repository contains a Java-based project that simulates the operations of a coffee machine. It was developed as part of the educational exercises on the Hyperskill platform. The project is designed to help learners understand and implement basic programming concepts in Java, such as variables, conditions, loops, and methods.

## Project Structure

The project is structured as follows:

- `src/`: This directory contains all the Java source files necessary to run the coffee machine simulation.
  - `Main.java`: The main class that initializes and runs the coffee machine.
  - `CoffeeMachine.java`: Contains the logic for the different operations of the coffee machine.
- `README.md`: Provides an overview of the project, installation instructions, and other useful information.
- `.gitignore`: Specifies intentionally untracked files to ignore.

## Setup and Installation

### Prerequisites

- Java JDK 11 or higher
- A Java IDE such as IntelliJ IDEA, Eclipse, or VSCode

### Installation Steps

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/Hyperskill_Coffee_Machine-Java.git
   cd Hyperskill_Coffee_Machine-Java
   ```

2. **Open the Project**
   - Open your Java IDE and import the project by selecting the `Hyperskill_Coffee_Machine-Java` directory.

3. **Build the Project**
   - Most IDEs support building the project through an integrated build tool like Maven or Gradle. If your IDE does not handle builds, you can compile the Java files manually from the terminal:
     ```bash
     javac src/*.java
     ```

4. **Run the Project**
   - After building, run the `Main.java` file either through your IDE or from the command line:
     ```bash
     java -cp src Main
     ```

## Usage

To use the coffee machine simulation, follow these steps after installation:

1. Start the application as described in the "Run the Project" section.
2. Interact with the coffee machine through the console. The program will prompt you for actions such as buying coffee, filling ingredients, taking money, etc.

Example:
```
Choose action (buy, fill, take, remaining, exit): 
buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: 
1
```

## Contributing

Contributions to this project are welcome! Here are a few ways you can help:

- Report bugs and issues.
- Suggest improvements or new features.
- Improve the documentation or write tutorials.
- Submit pull requests with bug fixes or new features.

Before contributing, please review the `CONTRIBUTING.md` file for detailed information on how to get started with contributing to this project.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. This means you are free to use, modify, and distribute the project as long as you include the original license and copyright notice.

---

This README is a general template and should be customized to fit the specifics of your project. For more detailed guidance on writing a README, consider looking at comprehensive resources or README templates available online.