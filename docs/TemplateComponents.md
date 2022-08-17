

# TemplateComponents



## anyOf schemas
* [TemplateButtonComponent](TemplateButtonComponent.md)
* [TemplateComponent](TemplateComponent.md)

## Example
```java
// Import classes:
import com.telnyx.sdk.model.TemplateComponents;
import com.telnyx.sdk.model.TemplateButtonComponent;
import com.telnyx.sdk.model.TemplateComponent;

public class Example {
    public static void main(String[] args) {
        TemplateComponents exampleTemplateComponents = new TemplateComponents();

        // create a new TemplateButtonComponent
        TemplateButtonComponent exampleTemplateButtonComponent = new TemplateButtonComponent();
        // set TemplateComponents to TemplateButtonComponent
        exampleTemplateComponents.setActualInstance(exampleTemplateButtonComponent);
        // to get back the TemplateButtonComponent set earlier
        TemplateButtonComponent testTemplateButtonComponent = (TemplateButtonComponent) exampleTemplateComponents.getActualInstance();

        // create a new TemplateComponent
        TemplateComponent exampleTemplateComponent = new TemplateComponent();
        // set TemplateComponents to TemplateComponent
        exampleTemplateComponents.setActualInstance(exampleTemplateComponent);
        // to get back the TemplateComponent set earlier
        TemplateComponent testTemplateComponent = (TemplateComponent) exampleTemplateComponents.getActualInstance();
    }
}
```


