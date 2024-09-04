# Bank-Management
The Bank Management System is a Java-based application that provides a graphical user interface (GUI) for managing various banking operations. The system allows customers to access banking services, such as balance inquiry, money transfer, and account management. It also includes features for bank employees, such as customer account creation, loan management, and transaction history tracking.


Objectives:

To design and implement a GUI-based bank management system using Java Swing.
To provide a user-friendly interface for customers and bank employees to access banking services.
To implement features for account management, transaction history tracking, and loan management.

Requirements:

Java Development Kit (JDK) 1.8 or higher.
Java Swing library.
MySQL database management system.


Design:

The system consists of several components, including:

A GUI-based interface for customers and bank employees.
A database management system to store customer and transaction information.
A set of classes and methods to implement the banking operations


Implementation:

The system is implemented using Java Swing for the GUI and MySQL for the database management system. The system consists of several classes, including:

BankManagementGUI: The main GUI class that creates the interface for customers and bank employees.
Account: The class that represents a bank account, including account number, account type, and balance.
Transaction: The class that represents a transaction, including transaction date, transaction type, and amount.
DatabaseManager: The class that manages the database connection and performs database operations.
This code creates a GUI with a JFrame as the main window, a JPanel to hold the components, and several JButton, JTextField, JPasswordField, JComboBox, and JTable components to create a user-friendly interface for managing accounts.

The createAccountButton and loginButton are used to create a new account and log in to an existing account, respectively. The usernameField and passwordField are used to input the username and password, respectively. The accountTypeComboBox is used to select the type of account to create. The accountTable is used to display the account information.

The main method creates an instance of the BankManagementGUI class and sets it to be visible
