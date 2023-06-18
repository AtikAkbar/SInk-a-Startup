# Sink a Startup

It is a Battleship-style game.

## Goal 

Sink all of the computer's Strtups in fewest number of guesses. You're given a rating or level, based on how well you perform.

## Setup

When the game program is launched the computer places three Strtpus on a virtual 7 x 7 grid where each Startup takes 3 cells. Where that's complete the game asks you for your first guess.

## How you play

This version works at the command line. The computer will prompt you to enter a guess (a cell) that you'll type at the commnad line (as "A3", "C5" etc.). In response to your guess, you'll see a result at the command line, either "hid", "miss" or "You sunk poniez" (or whatever the lucky Startup of the day is). When you sent all three Stratups to a big 404 in the sky, the game ends by printing your rating.


## Version

### version 1.0

A simple version of the game

- no grid only a single row
- not 3 but 1 stratup 

2 classes SimpleStartupGame & SimpleStartup. The game creates a Startup instance, assign it to a location somewhere in the row, get user input, and when all the startup's cells have been hit the game is over.

