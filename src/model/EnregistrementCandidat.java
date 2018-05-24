package model;

import java.io.File;
import javax.xml.bind.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class EnregistrementCandidat {
	
	private File d;
	
	public EnregistrementCandidat(String chemin) {
		d = new File(chemin);
	}
	
	public void enregistrer (Candidat f) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Candidat.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			
			marshaller.marshal(f, d);
		}
		catch (Exception mEx) {
			System.err.println(mEx.getMessage());
		}
	}
	

}