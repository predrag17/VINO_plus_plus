# VINO++ - A Winery Listing Application

**VINO++** is an application that lists wineries in **Macedonia**, providing users with an interactive map to explore wineries, leave ratings, and comments. The app allows users to register, log in, and manage wineries they have added, while admins have full access to manage all functionalities. This project was developed as part of a college assignment.

## Overview

The goal of VINO++ is to create a platform where users can:

- Browse a list of wineries in Macedonia.
- Interact with the map, which displays the locations of wineries.
- Add, update, or delete wineries that they have created (if logged in).
- Leave comments and ratings for wineries.
- Interact with an admin interface that allows full control over the app’s functionality.

The map feature highlights the wineries' locations and displays a circle around them indicating the closest town to the winery. This provides users with a clear geographical context of where each winery is located.

## Features

- **User Authentication**:
  - Users can register and log in to the application.
  - Once logged in, users can create, update, and delete wineries they have added.
  
- **Admin Access**:
  - Admin users can manage all wineries, including creating, updating, and deleting any winery in the system.

- **Winery Listings**:
  - A map is displayed showing all wineries in Macedonia.
  - Each winery has a circle around it representing the distance to the closest town.
  - Below the map, all wineries are listed, and users can click on a winery from the list to be redirected to a detailed page for that winery.

- **Winery Details Page**:
  - The page displays all information about a single winery, including location, name, and description.
  - Users can leave comments and ratings for wineries.
  - Users can delete their own comments and ratings.
  - Admins can manage all comments and ratings.

- **Data Scraping**:
  - All wineries in Macedonia are scraped from external sources and populated into the application’s database for easy access and management.

## Tech Stack

- **Frontend**:
  - **Thymeleaf**: For rendering dynamic HTML pages on the frontend, integrated with Spring Boot.
  - **CSS**: For styling the components and layout.
  
- **Backend**:
  - **Spring Boot**: For the server-side logic and API endpoints.
  - **Spring Security**: For managing user authentication and authorization (without JWT, uses session-based authentication).
  - **PostgreSQL**: For storing winery data, user information, comments, and ratings.

- **Additional Tools**:
  - **Data Scraping**: Used to scrape winery data and populate the database.
  - **Thymeleaf Templates**: For rendering dynamic content on the website.
