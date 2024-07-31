package factory;

public class PdfDocumentFactory extends DocumentFactory {

	@Override
	public Document createDocument() {
        return new PdfDocumentImpl();
	}

}