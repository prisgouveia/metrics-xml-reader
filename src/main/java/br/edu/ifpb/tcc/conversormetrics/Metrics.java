/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tcc.conversormetrics;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pris
 */
@XmlRootElement(name = "Metrics",namespace = "http://metrics.sourceforge.net/2003/Metrics-First-Flat")
public class Metrics {
    @XmlAttribute
    private String scope;
    @XmlAttribute
    private String date;
//    @XmlAttribute
//    private URI xmlns;
    @XmlElement(name = "Metric")
    private List<Metric> metric;

//    public String getScope() {
//        return scope;
//    }
//
//    public void setScope(String scope) {
//        this.scope = scope;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }

//    public Collection<Metric> getMetrics() {
//        return metric;
//    }
//
//    public void setMetrics(Collection<Metric> metric) {
//        this.metric = metric;
//    }

    @Override
    public String toString() {
        return "Metrics{" + "scope=" + scope + ", date=" + date + ",\n metrics=" + metric + '}';
    }
    
    
}
