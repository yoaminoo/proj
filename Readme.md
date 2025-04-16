# Genius Music Application

This is a Java-based program inspired by the Genius app that uses OOP (Object-Oriented Programming) principles to model accounts, songs, albums, commenting, liking, and more.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Setup and Installation](#setup-and-installation)
- [Credits](#credits)

## Introduction

This is a program written in Java, inspired by the "Genius" application.

The application simulates a music platform where users can sign up as regular listeners, artists, or administrators. Using object-oriented design, the project organizes data into accounts, songs, albums, and comments.

## Features

### **Accounts and Role Management**
- **User:** Browse song lyrics, comment on songs, and follow artists.
- **Artist:** Create and manage songs and albums, update lyrics directly.
- **Admin:** Review, approve, or reject artist registrations and user-submitted lyric edits.

### **Songs**
- Each song contains a name, artist, album, genre, lyric, view count, likes, and dislikes.
- Every time a song is viewed, its view count increases.
- Users can like/dislike songs and comment on them.

### **Albums**
- Albums group together songs by an artist.
- Albums include a title and artist name.

### **Comments**
- Users can leave comments on songs.
- Comments are displayed along with the username of the commenter.

### **Search Functionality**
- Search for artists, songs, or albums using a case-insensitive match.

## Project Structure

The project is designed using modular packages to keep concerns separated and to follow clean OOP principles.

There are **seven main packages** in the project—some are essential, like `Signup`, `Account`, `Song`, and `Display`, while others, such as `CS`, `P`, and `PrintObj`, help you code easier.

### **Package Overview**
1. **Signup and Login**
2. **Account, User, Artist, and Admin**
3. **Song, Album, and Comment**
4. **Search**
5. **FileManager**
6. **Display**
7. **P, CS, toString, and PrintObj**

## Setup and Installation

To run this program on your device, follow these steps:

1. Download the latest JDK from [Oracle's official website](https://www.oracle.com/java/technologies/downloads/).
2. Download Gradle package manager from [Gradle's official website](https://gradle.org/install/).
3. Download and install IntelliJ IDEA from [JetBrains' official website](https://www.jetbrains.com/idea/download/?section=windows).
4. Make sure Git is installed and you have a GitHub account.
5. Fork this repository to your GitHub account.
6. Clone the repository:
   - Open Git in your desired folder.
   - Copy the repository HTTPS link.
   - Enter the following command in Git:
     ```bash
     git clone <repository-url>
     ```
   - Paste the HTTPS link using `Shift + Insert`.

7. Once cloned, navigate to the project folder and open it in IntelliJ IDEA.
8. Run the `Main.java` class to start the application.

## Usage

- First, create a **User** account.
- View a list of all songs sorted by views.
- Choose a number to see more details of a song.
- Enter:
  - **1** to see all comments (if any exist).
  - **2** to see the song's lyrics.
  - **3** to leave a comment (your username will be shown).
  - **4** to like the song.
  - **5** to dislike the song.
  - **6** to follow the artist.
  - **7** to exit the song list.

## Credits

- [Dr. Kheradpishe](https://github.com/SRKH) (Instructor)
- [Ehsan Habibagaahi](https://github.com/Ehsan-Habibagahi) (Mentor)
- Special thanks to **Kia** and **Mobin** for helping me in coding this programm:
  - [Kia](https://github.com/kia8506)
  - [Mobin](https://github.com/fermow)

## Note

- This code is tested and is fully functional on my laptop.
- But it may just need more work and some features are not fully implemented.
