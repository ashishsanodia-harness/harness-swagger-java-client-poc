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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * This has the SMTP configuration details defined in Harness.
 */
@Schema(description = "This has the SMTP configuration details defined in Harness.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SmtpConfig {
  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("fromAddress")
  private String fromAddress = null;

  @SerializedName("useSSL")
  private Boolean useSSL = null;

  @SerializedName("startTLS")
  private Boolean startTLS = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private List<String> password = null;

  public SmtpConfig host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @Schema(required = true, description = "")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public SmtpConfig port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @Schema(required = true, description = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SmtpConfig fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @Schema(description = "")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public SmtpConfig useSSL(Boolean useSSL) {
    this.useSSL = useSSL;
    return this;
  }

   /**
   * Get useSSL
   * @return useSSL
  **/
  @Schema(description = "")
  public Boolean isUseSSL() {
    return useSSL;
  }

  public void setUseSSL(Boolean useSSL) {
    this.useSSL = useSSL;
  }

  public SmtpConfig startTLS(Boolean startTLS) {
    this.startTLS = startTLS;
    return this;
  }

   /**
   * Get startTLS
   * @return startTLS
  **/
  @Schema(description = "")
  public Boolean isStartTLS() {
    return startTLS;
  }

  public void setStartTLS(Boolean startTLS) {
    this.startTLS = startTLS;
  }

  public SmtpConfig username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @Schema(description = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SmtpConfig password(List<String> password) {
    this.password = password;
    return this;
  }

  public SmtpConfig addPasswordItem(String passwordItem) {
    if (this.password == null) {
      this.password = new ArrayList<String>();
    }
    this.password.add(passwordItem);
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @Schema(description = "")
  public List<String> getPassword() {
    return password;
  }

  public void setPassword(List<String> password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmtpConfig smtpConfig = (SmtpConfig) o;
    return Objects.equals(this.host, smtpConfig.host) &&
        Objects.equals(this.port, smtpConfig.port) &&
        Objects.equals(this.fromAddress, smtpConfig.fromAddress) &&
        Objects.equals(this.useSSL, smtpConfig.useSSL) &&
        Objects.equals(this.startTLS, smtpConfig.startTLS) &&
        Objects.equals(this.username, smtpConfig.username) &&
        Objects.equals(this.password, smtpConfig.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port, fromAddress, useSSL, startTLS, username, password);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmtpConfig {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    useSSL: ").append(toIndentedString(useSSL)).append("\n");
    sb.append("    startTLS: ").append(toIndentedString(startTLS)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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