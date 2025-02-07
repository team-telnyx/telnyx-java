/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.InteractiveAction;
import com.telnyx.sdk.model.InteractiveButton;
import com.telnyx.sdk.model.InteractiveSection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * Action you want the user to perform after reading the message.
 */
@ApiModel(description = "Action you want the user to perform after reading the message.")
@JsonPropertyOrder({
  Action.JSON_PROPERTY_BUTTON,
  Action.JSON_PROPERTY_BUTTONS,
  Action.JSON_PROPERTY_SECTIONS,
  Action.JSON_PROPERTY_CATALOG_ID,
  Action.JSON_PROPERTY_PRODUCT_RETAILER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Action {
  public static final String JSON_PROPERTY_BUTTON = "button";
  private String button;

  public static final String JSON_PROPERTY_BUTTONS = "buttons";
  private List<InteractiveButton> buttons = null;

  public static final String JSON_PROPERTY_SECTIONS = "sections";
  private List<InteractiveSection> sections = null;

  public static final String JSON_PROPERTY_CATALOG_ID = "catalog_id";
  private String catalogId;

  public static final String JSON_PROPERTY_PRODUCT_RETAILER_ID = "product_retailer_id";
  private String productRetailerId;

  public Action() { 
  }

  public Action button(String button) {
    this.button = button;
    return this;
  }

   /**
   * Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Required for List Messages.
   * @return button
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Button content. It cannot be an empty string and must be unique within the message. Emojis are supported, markdown is not. Required for List Messages.")
  @JsonProperty(JSON_PROPERTY_BUTTON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getButton() {
    return button;
  }


  @JsonProperty(JSON_PROPERTY_BUTTON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButton(String button) {
    this.button = button;
  }


  public Action buttons(List<InteractiveButton> buttons) {
    this.buttons = buttons;
    return this;
  }

  public Action addButtonsItem(InteractiveButton buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * A list of buttons. Required for Reply Button Messages.
   * @return buttons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of buttons. Required for Reply Button Messages.")
  @JsonProperty(JSON_PROPERTY_BUTTONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InteractiveButton> getButtons() {
    return buttons;
  }


  @JsonProperty(JSON_PROPERTY_BUTTONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setButtons(List<InteractiveButton> buttons) {
    this.buttons = buttons;
  }


  public Action sections(List<InteractiveSection> sections) {
    this.sections = sections;
    return this;
  }

  public Action addSectionsItem(InteractiveSection sectionsItem) {
    if (this.sections == null) {
      this.sections = new ArrayList<>();
    }
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Array of section objects. Required for List Messages and Multi-Product Messages.
   * @return sections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of section objects. Required for List Messages and Multi-Product Messages.")
  @JsonProperty(JSON_PROPERTY_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InteractiveSection> getSections() {
    return sections;
  }


  @JsonProperty(JSON_PROPERTY_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSections(List<InteractiveSection> sections) {
    this.sections = sections;
  }


  public Action catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via Commerce Manager. Required for Single Product Messages and Multi-Product Messages.
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the Facebook catalog linked to your WhatsApp Business Account. This ID can be retrieved via Commerce Manager. Required for Single Product Messages and Multi-Product Messages.")
  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCatalogId() {
    return catalogId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  public Action productRetailerId(String productRetailerId) {
    this.productRetailerId = productRetailerId;
    return this;
  }

   /**
   * Unique identifier of the product in a catalog. To get this ID, go to Commerce Manager, select your Facebook Business account, and you will see a list of shops connected to your account. Click the shop you want to use. On the left-side panel, click Catalog &gt; Items, and find the item you want to mention. The ID for that item is displayed under the item&#39;s name.
   * @return productRetailerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the product in a catalog. To get this ID, go to Commerce Manager, select your Facebook Business account, and you will see a list of shops connected to your account. Click the shop you want to use. On the left-side panel, click Catalog > Items, and find the item you want to mention. The ID for that item is displayed under the item's name.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_RETAILER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProductRetailerId() {
    return productRetailerId;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_RETAILER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductRetailerId(String productRetailerId) {
    this.productRetailerId = productRetailerId;
  }


  /**
   * Return true if this Action object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action action = (Action) o;
    return Objects.equals(this.button, action.button) &&
        Objects.equals(this.buttons, action.buttons) &&
        Objects.equals(this.sections, action.sections) &&
        Objects.equals(this.catalogId, action.catalogId) &&
        Objects.equals(this.productRetailerId, action.productRetailerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(button, buttons, sections, catalogId, productRetailerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    sb.append("    button: ").append(toIndentedString(button)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    productRetailerId: ").append(toIndentedString(productRetailerId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

