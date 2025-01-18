package com.careerit.cj.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionExample4 {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try{
            fis = new FileInputStream(new File("data"));
            // Reading file data
            // Get filtered data
            // Write filtered data into another file
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
