package model;
import java.io.File;
import javax.xml.bind.*;
import javax.xml.bind.Marshaller;

public class EnregistrementCriteres {
	
	private File e;
	
	public EnregistrementCriteres(String chemin) {
		e = new File(chemin);
	}
	
	public void enregistrer (Criteres c) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Criteres.class);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			
			marshaller.marshal(c, e);
		}
		catch (Exception mEx) {
			System.err.println(mEx.getMessage());
		}
	}
	

}