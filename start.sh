#!/bin/bash

find fr/* -name "*.java" > sources.txt && javac @sources.txt && java Main scenario.txt
