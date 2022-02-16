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
import io.swagger.client.model.PmsNotificationChannel;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NotificationChannelWrapper
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class NotificationChannelWrapper {
  @SerializedName("type")
  private String type = null;

  @SerializedName("spec")
  private PmsNotificationChannel spec = null;

  public NotificationChannelWrapper type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public NotificationChannelWrapper spec(PmsNotificationChannel spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @Schema(description = "")
  public PmsNotificationChannel getSpec() {
    return spec;
  }

  public void setSpec(PmsNotificationChannel spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelWrapper notificationChannelWrapper = (NotificationChannelWrapper) o;
    return Objects.equals(this.type, notificationChannelWrapper.type) &&
        Objects.equals(this.spec, notificationChannelWrapper.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelWrapper {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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