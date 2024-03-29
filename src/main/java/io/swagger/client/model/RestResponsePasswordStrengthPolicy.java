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
import io.swagger.client.model.PasswordStrengthPolicy;
import io.swagger.client.model.ResponseMessage;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * RestResponsePasswordStrengthPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class RestResponsePasswordStrengthPolicy {
  @SerializedName("metaData")
  private Map<String, Object> metaData = null;

  @SerializedName("resource")
  private PasswordStrengthPolicy resource = null;

  @SerializedName("responseMessages")
  private List<ResponseMessage> responseMessages = null;

  public RestResponsePasswordStrengthPolicy metaData(Map<String, Object> metaData) {
    this.metaData = metaData;
    return this;
  }

  public RestResponsePasswordStrengthPolicy putMetaDataItem(String key, Object metaDataItem) {
    if (this.metaData == null) {
      this.metaData = new HashMap<String, Object>();
    }
    this.metaData.put(key, metaDataItem);
    return this;
  }

   /**
   * Get metaData
   * @return metaData
  **/
  @Schema(description = "")
  public Map<String, Object> getMetaData() {
    return metaData;
  }

  public void setMetaData(Map<String, Object> metaData) {
    this.metaData = metaData;
  }

  public RestResponsePasswordStrengthPolicy resource(PasswordStrengthPolicy resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @Schema(description = "")
  public PasswordStrengthPolicy getResource() {
    return resource;
  }

  public void setResource(PasswordStrengthPolicy resource) {
    this.resource = resource;
  }

  public RestResponsePasswordStrengthPolicy responseMessages(List<ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
    return this;
  }

  public RestResponsePasswordStrengthPolicy addResponseMessagesItem(ResponseMessage responseMessagesItem) {
    if (this.responseMessages == null) {
      this.responseMessages = new ArrayList<ResponseMessage>();
    }
    this.responseMessages.add(responseMessagesItem);
    return this;
  }

   /**
   * Get responseMessages
   * @return responseMessages
  **/
  @Schema(description = "")
  public List<ResponseMessage> getResponseMessages() {
    return responseMessages;
  }

  public void setResponseMessages(List<ResponseMessage> responseMessages) {
    this.responseMessages = responseMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResponsePasswordStrengthPolicy restResponsePasswordStrengthPolicy = (RestResponsePasswordStrengthPolicy) o;
    return Objects.equals(this.metaData, restResponsePasswordStrengthPolicy.metaData) &&
        Objects.equals(this.resource, restResponsePasswordStrengthPolicy.resource) &&
        Objects.equals(this.responseMessages, restResponsePasswordStrengthPolicy.responseMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metaData, resource, responseMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestResponsePasswordStrengthPolicy {\n");
    
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    responseMessages: ").append(toIndentedString(responseMessages)).append("\n");
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
