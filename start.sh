#!/bin/bash

find * -name "*.java" > sources.txt && javac @sources.txt && java Main scenario.txt
