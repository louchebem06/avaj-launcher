#!/bin/bash

find fr/* -name "*.java" > sources.txt
javac @sources.txt
rm sources.txt
java fr.school42.avaj.simulator.Simulator scenario.txt
