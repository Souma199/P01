package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Throwable;
import javax.print.attribute.standard.PrinterMakeAndModel;
import javax.swing.plaf.BorderUIResource;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;

public class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.FINE, "Started with arguments: {0} ", Arrays.toString(args));
        try {
            randomFailingAlgorithm();
        } catch (IllegalStateException e) {
            LOGGER.log(Level.SEVERE, "Exception caught", e);
            System.exit(2);
        }
        LOGGER.fine("Finished successfully");
    }

    private static void randomFailingAlgorithm(){
        double randomNumber = Math.random();
        LOGGER.log(Level.FINE, "Generated random number: {0}", randomNumber);
        if(randomNumber < 0.5){
            throw new IllegalStateException("Invalid phase of the Noon");
        }
//        Timer timer = new Timer();
//        long time =  timer.measureTime(() -> new BigDecimal("1234567").pow(100000));
//        System.out.println(time);
        }
    }


