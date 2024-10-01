# library-management-system
A Spring Boot-based Library Management System that allows users to manage book records, including adding new books, borrowing, and returning them. The application uses an H2 database for data storage and Thymeleaf for the front-end interface.

## Overview

The **Library Management System** is a web application built using **Spring Boot** that facilitates the management of book records in a library. This system allows users to easily add new books, view available books, and manage borrowing and returning of books. The application is designed with a user-friendly interface utilizing **Thymeleaf** for rendering web pages, and it employs an **H2 Database** for efficient data storage.

## Features

- **Add New Books**: Users can add books to the library's collection by providing the title and author.
- **View Book List**: A comprehensive list of all available books is displayed, showing their status (available or borrowed).
- **Borrow and Return Books**: Users can borrow books if they are available and return them when done.
- **In-Memory Database**: The application uses H2 as an in-memory database, enabling quick setup and testing without complex configurations.

## Technologies Used

- **Programming Language**: Java
- **Framework**: Spring Boot
- **Database**: H2 Database
- **Web Technologies**: Spring Data JPA, Thymeleaf, HTML, CSS

## Getting Started

To get started with the Library Management System, follow the steps below:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/library-management-system.git
   cd library-management-system
