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

class Values {

    @XmlAttribute
    private String avg;
    @XmlAttribute
    private String stdDev;
    @XmlAttribute
    private String total;
    @XmlAttribute
    private String max;

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getStdDev() {
        return stdDev;
    }

    public void setStdDev(String stdDev) {
        this.stdDev = stdDev;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }
    


   
    @Override
    public String toString() {
        return "\n------Values " + "avg=" + avg + ", stdDev=" + stdDev + ", total=" + total + ", max=" + max + '\n';
    }
    
    

}
