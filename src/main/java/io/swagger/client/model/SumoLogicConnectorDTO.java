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
import io.swagger.client.model.ConnectorConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * SumoLogicConnectorDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SumoLogicConnectorDTO extends ConnectorConfig {
  @SerializedName("url")
  private String url = null;

  @SerializedName("accessIdRef")
  private String accessIdRef = null;

  @SerializedName("accessKeyRef")
  private String accessKeyRef = null;

  @SerializedName("delegateSelectors")
  private List<String> delegateSelectors = null;

  public SumoLogicConnectorDTO url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @Schema(required = true, description = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SumoLogicConnectorDTO accessIdRef(String accessIdRef) {
    this.accessIdRef = accessIdRef;
    return this;
  }

   /**
   * Get accessIdRef
   * @return accessIdRef
  **/
  @Schema(required = true, description = "")
  public String getAccessIdRef() {
    return accessIdRef;
  }

  public void setAccessIdRef(String accessIdRef) {
    this.accessIdRef = accessIdRef;
  }

  public SumoLogicConnectorDTO accessKeyRef(String accessKeyRef) {
    this.accessKeyRef = accessKeyRef;
    return this;
  }

   /**
   * Get accessKeyRef
   * @return accessKeyRef
  **/
  @Schema(required = true, description = "")
  public String getAccessKeyRef() {
    return accessKeyRef;
  }

  public void setAccessKeyRef(String accessKeyRef) {
    this.accessKeyRef = accessKeyRef;
  }

  public SumoLogicConnectorDTO delegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
    return this;
  }

  public SumoLogicConnectorDTO addDelegateSelectorsItem(String delegateSelectorsItem) {
    if (this.delegateSelectors == null) {
      this.delegateSelectors = new ArrayList<String>();
    }
    this.delegateSelectors.add(delegateSelectorsItem);
    return this;
  }

   /**
   * Get delegateSelectors
   * @return delegateSelectors
  **/
  @Schema(description = "")
  public List<String> getDelegateSelectors() {
    return delegateSelectors;
  }

  public void setDelegateSelectors(List<String> delegateSelectors) {
    this.delegateSelectors = delegateSelectors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SumoLogicConnectorDTO sumoLogicConnectorDTO = (SumoLogicConnectorDTO) o;
    return Objects.equals(this.url, sumoLogicConnectorDTO.url) &&
        Objects.equals(this.accessIdRef, sumoLogicConnectorDTO.accessIdRef) &&
        Objects.equals(this.accessKeyRef, sumoLogicConnectorDTO.accessKeyRef) &&
        Objects.equals(this.delegateSelectors, sumoLogicConnectorDTO.delegateSelectors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, accessIdRef, accessKeyRef, delegateSelectors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumoLogicConnectorDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    accessIdRef: ").append(toIndentedString(accessIdRef)).append("\n");
    sb.append("    accessKeyRef: ").append(toIndentedString(accessKeyRef)).append("\n");
    sb.append("    delegateSelectors: ").append(toIndentedString(delegateSelectors)).append("\n");
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
