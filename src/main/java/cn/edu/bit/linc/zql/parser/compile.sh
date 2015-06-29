#!/bin/zsh
source ~/.zshrc
rm -rf *.java *.class
antlr4 -no-listener -visitor uniformSQL.g4 -package cn.edu.bit.linc.zql.parser
javac uniformSQL*.java
