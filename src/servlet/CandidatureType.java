//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.3.0 
// Voir <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2018.05.24 � 07:05:41 PM CEST 
//


package servlet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour candidatureType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="candidatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="motivaion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="diplome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidatureType", propOrder = {

})
public class CandidatureType {

    @XmlElement(required = true)
    protected String motivaion;
    @XmlElement(required = true)
    protected String school;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(required = true)
    protected String diplome;

    /**
     * Obtient la valeur de la propri�t� motivaion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivaion() {
        return motivaion;
    }

    /**
     * D�finit la valeur de la propri�t� motivaion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivaion(String value) {
        this.motivaion = value;
    }

    /**
     * Obtient la valeur de la propri�t� school.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchool() {
        return school;
    }

    /**
     * D�finit la valeur de la propri�t� school.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchool(String value) {
        this.school = value;
    }

    /**
     * Obtient la valeur de la propri�t� note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * D�finit la valeur de la propri�t� note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Obtient la valeur de la propri�t� diplome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiplome() {
        return diplome;
    }

    /**
     * D�finit la valeur de la propri�t� diplome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiplome(String value) {
        this.diplome = value;
    }

}
