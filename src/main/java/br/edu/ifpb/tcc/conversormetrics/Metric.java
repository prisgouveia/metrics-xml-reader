/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tcc.conversormetrics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author Pris
 */
@XmlAccessorType(XmlAccessType.FIELD)

public class Metric {
    @XmlAttribute
    private String id;
    @XmlAttribute
    private String description;
//    @XmlAttribute
//    protected double avg;
//    @XmlAttribute
//    protected String stdDev;
//    @XmlAttribute
//    protected double total;
//    @XmlAttribute
//    protected double max;

   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public double getAvg() {
//        return avg;
//    }
//
//    public void setAvg(double avg) {
//        this.avg = avg;
//    }
//
//    public String getStdDev() {
//        return stdDev;
//    }
//
//    public void setStdDev(String stdDev) {
//        this.stdDev = stdDev;
//    }
//
//    public double getMax() {
//        return max;
//    }
//
//    public void setMax(double max) {
//        this.max = max;
//    }

//    @Override
//    public String toString() {
//        return "Metric{ id=" + id + ", description=" + description + ", avg=" + avg + ", stdDev=" + stdDev + ", max=" + max + '}';
//    }

    @Override
    public String toString() {
        return "Metric{" + "id=" + id + ", description=" + description + '}';
    }
    
    
    
}
