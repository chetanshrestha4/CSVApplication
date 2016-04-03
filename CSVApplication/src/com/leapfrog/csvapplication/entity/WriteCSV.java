/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.csvapplication.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Chetan
 */
public class WriteCSV {

    public WriteCSV() {

    }

    public void fwrite(String data) {

        try {
            FileWriter fwriter = new FileWriter(new File("d:/PourEmployees.csv"), true);
            fwriter.write(data);
            fwriter.write("\n");
            fwriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
