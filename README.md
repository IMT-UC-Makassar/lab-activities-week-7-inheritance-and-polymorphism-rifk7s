[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/sYlbGAOm)

# SmartBank System - OOP Lab Week 7

## Overview
This project implements a banking system for SmartBank, a modern financial institution that offers various account types and financial services to its customers. The implementation demonstrates object-oriented programming principles including inheritance, polymorphism, abstraction, encapsulation, and interfaces.
 
## TL;DR - System Architecture
The system uses an abstract `BankAccount` class with three concrete implementations (Savings, Checking, Business), a `Card` hierarchy (Debit, Credit, Platinum), and two interfaces (`OnlineService`, `LoanService`) to model a complete banking system with clean OOP design.

## System Architecture

### Core Components
- **Bank Accounts**: An abstract base class with concrete implementations for different account types
- **Card System**: A hierarchy of card types with different features and interest rates
- **Service Interfaces**: Defined protocols for online banking and loan services

### Class Hierarchy

#### Bank Account System
- `BankAccount` (Abstract): Base class for all account types
  - `SavingsAccount`: High-interest account for individual savings
  - `CheckingAccount`: Daily transaction account with no interest
  - `BusinessAccount`: Corporate account with loan capabilities

#### Card System
- `Card`: Base class for all card types
  - `DebitCard`: Directly linked to checking accounts with no interest
  - `CreditCard`: Standard credit card with 15% interest rate
  - `PlatinumCard`: Premium credit card with reduced 10% interest rate

### Interfaces
- `OnlineService`: For accounts that support online banking features
  - Methods: transferFunds(), payBills()
- `LoanService`: For accounts that support loan applications
  - Methods: applyForLoan(), checkLoanStatus()

## Key Features
1. **Account Management**:
   - Deposit and withdrawal operations
   - Balance tracking and management
   - Interest calculation based on account type

2. **Online Banking**:
   - Fund transfers between accounts
   - Bill payment services

3. **Loan Services**:
   - Loan application processing
   - Loan status tracking

4. **Card Management**:
   - Different card types with varying interest rates
   - Card holder information tracking

## Object-Oriented Concepts Demonstrated

- **Inheritance**: Multiple levels of inheritance in both account and card hierarchies
- **Polymorphism**: Method overriding (e.g., calculateInterest() implemented differently in each account type)
- **Abstraction**: Abstract base class (BankAccount) that defines common structure
- **Encapsulation**: Private fields with getter/setter methods
- **Interfaces**: Multiple interface implementation for specialized behaviors

## Implementation Notes
- Interest calculations vary by account type:
  - Savings accounts: 5% interest rate
  - Checking accounts: No interest
  - Business accounts: 2% interest rate
- Card interest rates:
  - Debit cards: 0%
  - Credit cards: 15%
  - Platinum cards: 10%

## Running Tests
The system includes comprehensive test cases for all components:
- `BankAccountTest`: Tests core banking functionality
- `CardTest`: Tests card system features
- `AbstractionAndInterfaceTest`: Tests OO design principles and implementation

Use Gradle to run tests:
```
./gradlew test
```

