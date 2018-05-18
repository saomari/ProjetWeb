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
 * <p>Classe Java pour parcoursType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="parcoursType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anneeBac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filiereBac" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dernierDiplome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filiere" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="etablissement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="choix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parcoursType", propOrder = {
    "anneeBac",
    "filiereBac",
    "dernierDiplome",
    "filiere",
    "etablissement",
    "choix"
})
public class ParcoursType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String anneeBac;
    @XmlElement(required = true)
    protected String filiereBac;
    @XmlElement(required = true)
    protected String dernierDiplome;
    @XmlElement(required = true)
    protected String filiere;
    @XmlElement(required = true)
    protected String etablissement;
    @XmlElement(required = true)
    protected String choix;

    /**
     * Obtient la valeur de la propriété anneeBac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneeBac() {
        return anneeBac;
    }

    /**
     * Définit la valeur de la propriété anneeBac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneeBac(String value) {
        this.anneeBac = value;
    }

    /**
     * Obtient la valeur de la propriété filiereBac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiliereBac() {
        return filiereBac;
    }

    /**
     * Définit la valeur de la propriété filiereBac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiliereBac(String value) {
        this.filiereBac = value;
    }

    /**
     * Obtient la valeur de la propriété dernierDiplome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDernierDiplome() {
        return dernierDiplome;
    }

    /**
     * Définit la valeur de la propriété dernierDiplome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDernierDiplome(String value) {
        this.dernierDiplome = value;
    }

    /**
     * Obtient la valeur de la propriété filiere.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * Définit la valeur de la propriété filiere.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiliere(String value) {
        this.filiere = value;
    }

    /**
     * Obtient la valeur de la propriété etablissement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtablissement() {
        return etablissement;
    }

    /**
     * Définit la valeur de la propriété etablissement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtablissement(String value) {
        this.etablissement = value;
    }

    /**
     * Obtient la valeur de la propriété choix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChoix() {
        return choix;
    }

    /**
     * Définit la valeur de la propriété choix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChoix(String value) {
        this.choix = value;
    }

}
