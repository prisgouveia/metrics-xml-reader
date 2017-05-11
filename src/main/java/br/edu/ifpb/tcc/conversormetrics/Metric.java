/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.tcc.conversormetrics;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

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
    @XmlElement(name = "Values")
    private List<Values> values;
    
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

    public List<Values> getValues() {
        return values;
    }

    public void setValues(List<Values> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "\n---Metric " + "id=" + id + ", description=" + description + ", values=" + values + '\n';
    }

    
    
    
    
}
