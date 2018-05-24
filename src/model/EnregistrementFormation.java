package model;

import java.io.File;
import javax.xml.bind.*;
import javax.xml.bind.Marshaller;

public class EnregistrementFormation {

	private File c;

	public EnregistrementFormation(String chemin) {
		c = new File(chemin);
	}

	public void enregistrer(Formation f) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Formation.class);

			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));

			marshaller.marshal(f, c);
		} catch (Exception mEx) {
			System.err.println(mEx.getMessage());
		}
	}
}
