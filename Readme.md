# Genius Music Application

This a java-based programm inspired by Genius app, that use OOP (object-oriented programming) principles to model accounts, songs, albums, commenting, liking and more.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Project Structures](#project-structures)
- [Usage](#usage)
- [Setup and Installation](#setup--installation)
- [Credits](#credits)

## Introduction

This is a programm in java language that inspired by "Genius" application.

This programm simulates a music platform where users can sign up as regular listeners, artists, or administrators. Using object-oriented design, the project organizes data into accounts, songs, albums, and comments.

## Features

- **Accounts and Role Management:**
  - **user:** Browse song lyrics, comment on songs, and follow artists.
  - **Artist:** Create and manage songs and albums, update lyrics directly.
  - **Admin:** Review, approve, or reject artist registrations and user-submitted lyric edits.

- **Songs:**

  - Each song contains a name, artist, album, genre, lyric, view count, likes, and dislikes.
  - Every time a song is viewed, its view count increases.
  - Users can like/dislike songs and comment on them.

- **Albums:**

  - Albums group together songs by an artist.
  - Albums include a title and artist name.

- **Comments:**

  - Users can leave comments on songs.
  - Comments are displayed along with the username of the commenter.

- **Search Functionality:**

  - Search for artists, songs, or albums using a case-insensitive match.

## Project Structures

  -The project is designed using modular packages to keep concerns separated and to follow clean OOP principles.
  -In this project there is 7 important packages that some of them are essential for the programm like Signup,Account, Song and Display, and some other like CS, P and PrintObj just help you code easier. and this is a full list of all class and sub-classe based on relation:

  -1 Signup and Login
  -2 Account, User, Artist and Admin
  -3 Song, Album, Comment
  -4 Search
  -5 FileManager
  -6 Display
  -7 P, CS, toString and PrintObj

## Setup & Installation

  -For running this programm on your device you must follow this steps:

  -1 Download the latest JDK from [oracle's officiall website](#https://www.oracle.com/java/technologies/downloads/)
  -2 Download Gradle package manager from [gradle's oficiall website ](#gradle.org/install/)
  -3 Download and Install intellij idea from [jetbrains's oficiall website](#https://www.jetbrains.com/idea/download/?section=windows)
  -4 Make sure you installed git and have a github account.
  -5 Fork this repository to your github account.
  -6 Clone the repository by:
    - first choose a folder on your device and open git on that folder.
    - second copy the https from the repository.
    - third write the code on git:

    ```
    git clone
    ```
    
    - and then paste the https with shift+insert.

    - Now if you enter the folder you will find all the codes and files of the repository.

  -Now if you run the Main.java class in intellij, you can use the programm.

## Usage

    - For using the programm you must first create a User account and then you can see a list of all songs based on views.
    - You can choose a number to see more details of the information of the song you want.
    - You can enter 1 to see all the comments (if exist any) of the song.
    - You can enter 2 to see song's lyric.
    - You can enter 3 to leave a comment (but your username will be shown).
    - You can enter 4 to like and 5 to dislike the song.
    - And if youu enter 6 you will exit song list.

## Credits

  - [Dr. Kheradpishe](#https://github.com/SRKH)(Instructor)
  - [Ehsan Habibagaahi](#https://github.com/Ehsan-Habibagahi)(Mentor)
  - And special thanks to kia and mobin who helped me in coding this programm
  - [Kia](#https://github.com/kia8506)
  - [Mobin](#https://github.com/fermow)