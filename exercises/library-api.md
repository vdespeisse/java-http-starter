# Library API

We want to build a REST api for loaning books.

## First step

Manage books with the following fields:

- id (UUID)
- title (String)
- author (String)

I want a REST API to create, read, update and delete books.
For now, store the books in memory in a Map.

## Second step

Manage users with the following fields:

- id (UUID)
- name (String)
- email (String)

I want a REST API to create, read, update and delete users.
For now, store the users in memory in a Map.

## Third step

Manage loans.
A loan is a User + a book.
