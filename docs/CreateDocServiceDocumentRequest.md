

# CreateDocServiceDocumentRequest

## oneOf schemas
* [DocServiceDocumentUploadInline](DocServiceDocumentUploadInline.md)
* [DocServiceDocumentUploadURL](DocServiceDocumentUploadURL.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.CreateDocServiceDocumentRequest;
import com.telnyx.sdk.model.DocServiceDocumentUploadInline;
import com.telnyx.sdk.model.DocServiceDocumentUploadURL;

public class Example {
    public static void main(String[] args) {
        CreateDocServiceDocumentRequest exampleCreateDocServiceDocumentRequest = new CreateDocServiceDocumentRequest();

        // create a new DocServiceDocumentUploadInline
        DocServiceDocumentUploadInline exampleDocServiceDocumentUploadInline = new DocServiceDocumentUploadInline();
        // set CreateDocServiceDocumentRequest to DocServiceDocumentUploadInline
        exampleCreateDocServiceDocumentRequest.setActualInstance(exampleDocServiceDocumentUploadInline);
        // to get back the DocServiceDocumentUploadInline set earlier
        DocServiceDocumentUploadInline testDocServiceDocumentUploadInline = (DocServiceDocumentUploadInline) exampleCreateDocServiceDocumentRequest.getActualInstance();

        // create a new DocServiceDocumentUploadURL
        DocServiceDocumentUploadURL exampleDocServiceDocumentUploadURL = new DocServiceDocumentUploadURL();
        // set CreateDocServiceDocumentRequest to DocServiceDocumentUploadURL
        exampleCreateDocServiceDocumentRequest.setActualInstance(exampleDocServiceDocumentUploadURL);
        // to get back the DocServiceDocumentUploadURL set earlier
        DocServiceDocumentUploadURL testDocServiceDocumentUploadURL = (DocServiceDocumentUploadURL) exampleCreateDocServiceDocumentRequest.getActualInstance();
    }
}
```


