package com.miage.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.miage.model.CandidaturesTypes;

public class XMLMarshaller {
	public XMLMarshaller() {
		marshllerCondidatures();
	}

	/**
	 * Cette méthode permet de lire le contenu du fichier xml
	 * 
	 * @return
	 */
	public CandidaturesTypes marshllerCondidature() {
		// cet objet contient la liste des candidatures du fichier xml.
		CandidaturesTypes candidatures = new CandidaturesTypes();
		JAXBElement<CandidaturesTypes> candidaturesE = null;
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			// lecture du fichier xml -> il faut le mettre dans le classpath.
			File file = new File(classLoader.getResource("candidatures.xml").getFile());
			JAXBContext jaxbContext = JAXBContext.newInstance("com.miage.model");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			candidaturesE = (JAXBElement<CandidaturesTypes>) jaxbUnmarshaller.unmarshal(file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return candidaturesE.getValue();
	}

	// a supprimé-> que pour tester.
	public static void main(String[] args) {
		new XMLMarshaller();
	}
}
