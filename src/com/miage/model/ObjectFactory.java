//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2018.04.21 à 03:08:58 AM CEST 
//


package com.miage.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Candidatures_QNAME = new QName("", "candidatures");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CandidaturesTypes }
     * 
     */
    public CandidaturesTypes createCandidaturesTypes() {
        return new CandidaturesTypes();
    }

    /**
     * Create an instance of {@link CandidatureType }
     * 
     */
    public CandidatureType createCandidatureType() {
        return new CandidatureType();
    }

    /**
     * Create an instance of {@link CandidatType }
     * 
     */
    public CandidatType createCandidatType() {
        return new CandidatType();
    }

    /**
     * Create an instance of {@link ParcoursType }
     * 
     */
    public ParcoursType createParcoursType() {
        return new ParcoursType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CandidaturesTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "candidatures")
    public JAXBElement<CandidaturesTypes> createCandidatures(CandidaturesTypes value) {
        return new JAXBElement<CandidaturesTypes>(_Candidatures_QNAME, CandidaturesTypes.class, null, value);
    }

}
