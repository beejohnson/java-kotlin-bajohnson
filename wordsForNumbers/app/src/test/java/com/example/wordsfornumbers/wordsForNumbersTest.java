package com.example.wordsfornumbers;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

import static org.junit.Assert.*;

public class wordsForNumbersTest {

    @Test
    public void runIt() throws Exception  {
        BufferedReader test = new BufferedReader();
        BufferedWriter print = new BufferedWriter(test);
        wordsForNumbers nw = new wordsForNumbers(null, print);
        nw.vars.put("blah blah", 3);
    }
}