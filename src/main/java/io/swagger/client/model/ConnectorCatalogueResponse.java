/*
 * CD NextGen API Reference
 * This is the Open Api Spec 3 for the NextGen Manager. This is under active development. Beware of the breaking change with respect to the generated code stub  # Authentication  <!-- ReDoc-Inject: <security-definitions> -->
 *
 * OpenAPI spec version: 3.0
 * Contact: contact@harness.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ConnectorCatalogueItem;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This has details of the retrieved Connector Catalogue.
 */
@Schema(description = "This has details of the retrieved Connector Catalogue.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class ConnectorCatalogueResponse {
  @SerializedName("catalogue")
  private List<ConnectorCatalogueItem> catalogue = null;

  public ConnectorCatalogueResponse catalogue(List<ConnectorCatalogueItem> catalogue) {
    this.catalogue = catalogue;
    return this;
  }

  public ConnectorCatalogueResponse addCatalogueItem(ConnectorCatalogueItem catalogueItem) {
    if (this.catalogue == null) {
      this.catalogue = new ArrayList<ConnectorCatalogueItem>();
    }
    this.catalogue.add(catalogueItem);
    return this;
  }

   /**
   * List of Connector category and Connector types corresponding to a specific category.
   * @return catalogue
  **/
  @Schema(description = "List of Connector category and Connector types corresponding to a specific category.")
  public List<ConnectorCatalogueItem> getCatalogue() {
    return catalogue;
  }

  public void setCatalogue(List<ConnectorCatalogueItem> catalogue) {
    this.catalogue = catalogue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorCatalogueResponse connectorCatalogueResponse = (ConnectorCatalogueResponse) o;
    return Objects.equals(this.catalogue, connectorCatalogueResponse.catalogue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorCatalogueResponse {\n");
    
    sb.append("    catalogue: ").append(toIndentedString(catalogue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
