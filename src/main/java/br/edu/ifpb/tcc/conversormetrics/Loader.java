/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tcc.conversormetrics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Pris
 */
public class Loader {

    public static void main(String[] args) {
        Metrics c1 =  new Loader().unmarshal(Metrics.class, "/Users/job/Downloads/ConversorMetricsq/ConversorMetricsq/src/main/java/resource/parametros.xml");
        c1.toString();
        System.out.println("c1 = " + c1);
    }

    public Metrics unmarshal(Class clazz, String xml) {
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return  (Metrics) unmarshaller.unmarshal(
                    new FileInputStream(xml)
            );
        } catch (JAXBException e) {
            e.printStackTrace();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
            return null;
    }
}
