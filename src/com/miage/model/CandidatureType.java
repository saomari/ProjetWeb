//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.21 à 03:08:58 AM CEST 
//


package com.miage.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour candidatureType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="candidatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="candidat" type="{}candidatType"/&gt;
 *         &lt;element name="parcours" type="{}parcoursType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidatureType", propOrder = {
    "candidat",
    "parcours"
})
public class CandidatureType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected CandidatType candidat;
    @XmlElement(required = true)
    protected ParcoursType parcours;

    /**
     * Obtient la valeur de la propriété candidat.
     * 
     * @return
     *     possible object is
     *     {@link CandidatType }
     *     
     */
    public CandidatType getCandidat() {
        return candidat;
    }

    /**
     * Définit la valeur de la propriété candidat.
     * 
     * @param value
     *     allowed object is
     *     {@link CandidatType }
     *     
     */
    public void setCandidat(CandidatType value) {
        this.candidat = value;
    }

    /**
     * Obtient la valeur de la propriété parcours.
     * 
     * @return
     *     possible object is
     *     {@link ParcoursType }
     *     
     */
    public ParcoursType getParcours() {
        return parcours;
    }

    /**
     * Définit la valeur de la propriété parcours.
     * 
     * @param value
     *     allowed object is
     *     {@link ParcoursType }
     *     
     */
    public void setParcours(ParcoursType value) {
        this.parcours = value;
    }

}
