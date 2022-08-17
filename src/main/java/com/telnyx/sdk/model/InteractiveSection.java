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
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telnyx.sdk.model.InteractiveProduct;
import com.telnyx.sdk.model.InteractiveSectionRow;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.telnyx.sdk.JSON;


/**
 * InteractiveSection
 */
@JsonPropertyOrder({
  InteractiveSection.JSON_PROPERTY_TITLE,
  InteractiveSection.JSON_PROPERTY_ROWS,
  InteractiveSection.JSON_PROPERTY_PRODUCT_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteractiveSection {
  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private List<InteractiveSectionRow> rows = null;

  public static final String JSON_PROPERTY_PRODUCT_ITEMS = "product_items";
  private List<InteractiveProduct> productItems = null;

  public InteractiveSection() { 
  }

  public InteractiveSection title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the section. Required if the message has more than one section.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the section. Required if the message has more than one section.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public InteractiveSection rows(List<InteractiveSectionRow> rows) {
    this.rows = rows;
    return this;
  }

  public InteractiveSection addRowsItem(InteractiveSectionRow rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Contains a list of rows. Limited to 10 rows across all sections. Required for List Messages.
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a list of rows. Limited to 10 rows across all sections. Required for List Messages.")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InteractiveSectionRow> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRows(List<InteractiveSectionRow> rows) {
    this.rows = rows;
  }


  public InteractiveSection productItems(List<InteractiveProduct> productItems) {
    this.productItems = productItems;
    return this;
  }

  public InteractiveSection addProductItemsItem(InteractiveProduct productItemsItem) {
    if (this.productItems == null) {
      this.productItems = new ArrayList<>();
    }
    this.productItems.add(productItemsItem);
    return this;
  }

   /**
   * Array of product objects. There is a minimum of 1 product per section. There is a maximum of 30 products across all sections.
   * @return productItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of product objects. There is a minimum of 1 product per section. There is a maximum of 30 products across all sections.")
  @JsonProperty(JSON_PROPERTY_PRODUCT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<InteractiveProduct> getProductItems() {
    return productItems;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProductItems(List<InteractiveProduct> productItems) {
    this.productItems = productItems;
  }


  /**
   * Return true if this InteractiveSection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteractiveSection interactiveSection = (InteractiveSection) o;
    return Objects.equals(this.title, interactiveSection.title) &&
        Objects.equals(this.rows, interactiveSection.rows) &&
        Objects.equals(this.productItems, interactiveSection.productItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, rows, productItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteractiveSection {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    productItems: ").append(toIndentedString(productItems)).append("\n");
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

