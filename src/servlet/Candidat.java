//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.05.24 � 06:51:18 PM CEST 
//


package servlet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour candidatType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="candidatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mdp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sexe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="naissance" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nationalite" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidatType", propOrder = {

})
public class Candidat {

    @XmlElement(required = true)
    protected String prenom;
    @XmlElement(required = true)
    protected String nom;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String mdp;
    @XmlElement(required = true)
    protected String sexe;
    @XmlElement(required = true)
    protected String naissance;
    @XmlElement(required = true)
    protected String nationalite;
    @XmlElement(required = true)
    protected String adresse;

    /**
     * Obtient la valeur de la propri�t� prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * D�finit la valeur de la propri�t� prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * D�finit la valeur de la propri�t� email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propri�t� mdp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * D�finit la valeur de la propri�t� mdp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdp(String value) {
        this.mdp = value;
    }

    /**
     * Obtient la valeur de la propri�t� sexe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * D�finit la valeur de la propri�t� sexe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexe(String value) {
        this.sexe = value;
    }

    /**
     * Obtient la valeur de la propri�t� naissance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaissance() {
        return naissance;
    }

    /**
     * D�finit la valeur de la propri�t� naissance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaissance(String value) {
        this.naissance = value;
    }

    /**
     * Obtient la valeur de la propri�t� nationalite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalite() {
        return nationalite;
    }

    /**
     * D�finit la valeur de la propri�t� nationalite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalite(String value) {
        this.nationalite = value;
    }

    /**
     * Obtient la valeur de la propri�t� adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * D�finit la valeur de la propri�t� adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

}
