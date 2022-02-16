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
import io.swagger.client.model.KubernetesAuthCredential;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains kubernetes client key certificate details
 */
@Schema(description = "This contains kubernetes client key certificate details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class KubernetesClientKeyCert extends KubernetesAuthCredential {
  @SerializedName("caCertRef")
  private String caCertRef = null;

  @SerializedName("clientCertRef")
  private String clientCertRef = null;

  @SerializedName("clientKeyRef")
  private String clientKeyRef = null;

  @SerializedName("clientKeyPassphraseRef")
  private String clientKeyPassphraseRef = null;

  @SerializedName("clientKeyAlgo")
  private String clientKeyAlgo = null;

  public KubernetesClientKeyCert caCertRef(String caCertRef) {
    this.caCertRef = caCertRef;
    return this;
  }

   /**
   * Get caCertRef
   * @return caCertRef
  **/
  @Schema(description = "")
  public String getCaCertRef() {
    return caCertRef;
  }

  public void setCaCertRef(String caCertRef) {
    this.caCertRef = caCertRef;
  }

  public KubernetesClientKeyCert clientCertRef(String clientCertRef) {
    this.clientCertRef = clientCertRef;
    return this;
  }

   /**
   * Get clientCertRef
   * @return clientCertRef
  **/
  @Schema(required = true, description = "")
  public String getClientCertRef() {
    return clientCertRef;
  }

  public void setClientCertRef(String clientCertRef) {
    this.clientCertRef = clientCertRef;
  }

  public KubernetesClientKeyCert clientKeyRef(String clientKeyRef) {
    this.clientKeyRef = clientKeyRef;
    return this;
  }

   /**
   * Get clientKeyRef
   * @return clientKeyRef
  **/
  @Schema(required = true, description = "")
  public String getClientKeyRef() {
    return clientKeyRef;
  }

  public void setClientKeyRef(String clientKeyRef) {
    this.clientKeyRef = clientKeyRef;
  }

  public KubernetesClientKeyCert clientKeyPassphraseRef(String clientKeyPassphraseRef) {
    this.clientKeyPassphraseRef = clientKeyPassphraseRef;
    return this;
  }

   /**
   * Get clientKeyPassphraseRef
   * @return clientKeyPassphraseRef
  **/
  @Schema(description = "")
  public String getClientKeyPassphraseRef() {
    return clientKeyPassphraseRef;
  }

  public void setClientKeyPassphraseRef(String clientKeyPassphraseRef) {
    this.clientKeyPassphraseRef = clientKeyPassphraseRef;
  }

  public KubernetesClientKeyCert clientKeyAlgo(String clientKeyAlgo) {
    this.clientKeyAlgo = clientKeyAlgo;
    return this;
  }

   /**
   * Get clientKeyAlgo
   * @return clientKeyAlgo
  **/
  @Schema(description = "")
  public String getClientKeyAlgo() {
    return clientKeyAlgo;
  }

  public void setClientKeyAlgo(String clientKeyAlgo) {
    this.clientKeyAlgo = clientKeyAlgo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesClientKeyCert kubernetesClientKeyCert = (KubernetesClientKeyCert) o;
    return Objects.equals(this.caCertRef, kubernetesClientKeyCert.caCertRef) &&
        Objects.equals(this.clientCertRef, kubernetesClientKeyCert.clientCertRef) &&
        Objects.equals(this.clientKeyRef, kubernetesClientKeyCert.clientKeyRef) &&
        Objects.equals(this.clientKeyPassphraseRef, kubernetesClientKeyCert.clientKeyPassphraseRef) &&
        Objects.equals(this.clientKeyAlgo, kubernetesClientKeyCert.clientKeyAlgo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caCertRef, clientCertRef, clientKeyRef, clientKeyPassphraseRef, clientKeyAlgo, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesClientKeyCert {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    caCertRef: ").append(toIndentedString(caCertRef)).append("\n");
    sb.append("    clientCertRef: ").append(toIndentedString(clientCertRef)).append("\n");
    sb.append("    clientKeyRef: ").append(toIndentedString(clientKeyRef)).append("\n");
    sb.append("    clientKeyPassphraseRef: ").append(toIndentedString(clientKeyPassphraseRef)).append("\n");
    sb.append("    clientKeyAlgo: ").append(toIndentedString(clientKeyAlgo)).append("\n");
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