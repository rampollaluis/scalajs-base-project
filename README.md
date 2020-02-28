# scalajs-base-project
Base environment setup for IntelliJ made following the basic tutorial on scala-js.org

## Setup
First, make sure you have the scala compiler installed. If you've never worked with scala, you probably don't have it. You can get it [here](scala-lang.org)

Clone the repo and import it to IntelliJ with sbt and make sure the **use sbt shell for imports** and **for builds** boxes are checked.

In the terminal, run **npm install** on the project root to install all of the node modules and dependencies.

## Usage
Your html is at project/scalajs-tutorial-fastopt.html. You can use this as you would any other html or you can alter the DOM with scala at src/main/scala/tutorial.webapp/TutorialApp

You can rename any of these files to fit your project but be sure to change the paths and references in other files.

## Compiling and running
Go to your sbt shell on Intellij and run **fastOptJS** to compile the scala code into a js file. This will generate a file under the target/scala-2.12 folder. You call it in your html with a regular script tag. You can also turn on auto-compile if you run **~fastOptJS**

If you are not using any other framework like React or Angular, you can simply open up the html file in your browser. If you *are* using a framework then you are on your own, good luck I hope you do well and let me know if you figure it out because I don't have a clue.

## References
[Tutorial I used](https://www.scala-js.org/doc/tutorial/basic/) to setup

[Other tutorials](https://www.scala-js.org/doc/tutorial/) by the official Scalajs site
