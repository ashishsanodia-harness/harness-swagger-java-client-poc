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
 * This contains kubernetes open id connect details
 */
@Schema(description = "This contains kubernetes open id connect details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class KubernetesOpenIdConnect extends KubernetesAuthCredential {
  @SerializedName("oidcIssuerUrl")
  private String oidcIssuerUrl = null;

  @SerializedName("oidcUsername")
  private String oidcUsername = null;

  @SerializedName("oidcUsernameRef")
  private String oidcUsernameRef = null;

  @SerializedName("oidcClientIdRef")
  private String oidcClientIdRef = null;

  @SerializedName("oidcPasswordRef")
  private String oidcPasswordRef = null;

  @SerializedName("oidcSecretRef")
  private String oidcSecretRef = null;

  @SerializedName("oidcScopes")
  private String oidcScopes = null;

  public KubernetesOpenIdConnect oidcIssuerUrl(String oidcIssuerUrl) {
    this.oidcIssuerUrl = oidcIssuerUrl;
    return this;
  }

   /**
   * Get oidcIssuerUrl
   * @return oidcIssuerUrl
  **/
  @Schema(description = "")
  public String getOidcIssuerUrl() {
    return oidcIssuerUrl;
  }

  public void setOidcIssuerUrl(String oidcIssuerUrl) {
    this.oidcIssuerUrl = oidcIssuerUrl;
  }

  public KubernetesOpenIdConnect oidcUsername(String oidcUsername) {
    this.oidcUsername = oidcUsername;
    return this;
  }

   /**
   * Get oidcUsername
   * @return oidcUsername
  **/
  @Schema(description = "")
  public String getOidcUsername() {
    return oidcUsername;
  }

  public void setOidcUsername(String oidcUsername) {
    this.oidcUsername = oidcUsername;
  }

  public KubernetesOpenIdConnect oidcUsernameRef(String oidcUsernameRef) {
    this.oidcUsernameRef = oidcUsernameRef;
    return this;
  }

   /**
   * Get oidcUsernameRef
   * @return oidcUsernameRef
  **/
  @Schema(description = "")
  public String getOidcUsernameRef() {
    return oidcUsernameRef;
  }

  public void setOidcUsernameRef(String oidcUsernameRef) {
    this.oidcUsernameRef = oidcUsernameRef;
  }

  public KubernetesOpenIdConnect oidcClientIdRef(String oidcClientIdRef) {
    this.oidcClientIdRef = oidcClientIdRef;
    return this;
  }

   /**
   * Get oidcClientIdRef
   * @return oidcClientIdRef
  **/
  @Schema(required = true, description = "")
  public String getOidcClientIdRef() {
    return oidcClientIdRef;
  }

  public void setOidcClientIdRef(String oidcClientIdRef) {
    this.oidcClientIdRef = oidcClientIdRef;
  }

  public KubernetesOpenIdConnect oidcPasswordRef(String oidcPasswordRef) {
    this.oidcPasswordRef = oidcPasswordRef;
    return this;
  }

   /**
   * Get oidcPasswordRef
   * @return oidcPasswordRef
  **/
  @Schema(required = true, description = "")
  public String getOidcPasswordRef() {
    return oidcPasswordRef;
  }

  public void setOidcPasswordRef(String oidcPasswordRef) {
    this.oidcPasswordRef = oidcPasswordRef;
  }

  public KubernetesOpenIdConnect oidcSecretRef(String oidcSecretRef) {
    this.oidcSecretRef = oidcSecretRef;
    return this;
  }

   /**
   * Get oidcSecretRef
   * @return oidcSecretRef
  **/
  @Schema(description = "")
  public String getOidcSecretRef() {
    return oidcSecretRef;
  }

  public void setOidcSecretRef(String oidcSecretRef) {
    this.oidcSecretRef = oidcSecretRef;
  }

  public KubernetesOpenIdConnect oidcScopes(String oidcScopes) {
    this.oidcScopes = oidcScopes;
    return this;
  }

   /**
   * Get oidcScopes
   * @return oidcScopes
  **/
  @Schema(description = "")
  public String getOidcScopes() {
    return oidcScopes;
  }

  public void setOidcScopes(String oidcScopes) {
    this.oidcScopes = oidcScopes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KubernetesOpenIdConnect kubernetesOpenIdConnect = (KubernetesOpenIdConnect) o;
    return Objects.equals(this.oidcIssuerUrl, kubernetesOpenIdConnect.oidcIssuerUrl) &&
        Objects.equals(this.oidcUsername, kubernetesOpenIdConnect.oidcUsername) &&
        Objects.equals(this.oidcUsernameRef, kubernetesOpenIdConnect.oidcUsernameRef) &&
        Objects.equals(this.oidcClientIdRef, kubernetesOpenIdConnect.oidcClientIdRef) &&
        Objects.equals(this.oidcPasswordRef, kubernetesOpenIdConnect.oidcPasswordRef) &&
        Objects.equals(this.oidcSecretRef, kubernetesOpenIdConnect.oidcSecretRef) &&
        Objects.equals(this.oidcScopes, kubernetesOpenIdConnect.oidcScopes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oidcIssuerUrl, oidcUsername, oidcUsernameRef, oidcClientIdRef, oidcPasswordRef, oidcSecretRef, oidcScopes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KubernetesOpenIdConnect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    oidcIssuerUrl: ").append(toIndentedString(oidcIssuerUrl)).append("\n");
    sb.append("    oidcUsername: ").append(toIndentedString(oidcUsername)).append("\n");
    sb.append("    oidcUsernameRef: ").append(toIndentedString(oidcUsernameRef)).append("\n");
    sb.append("    oidcClientIdRef: ").append(toIndentedString(oidcClientIdRef)).append("\n");
    sb.append("    oidcPasswordRef: ").append(toIndentedString(oidcPasswordRef)).append("\n");
    sb.append("    oidcSecretRef: ").append(toIndentedString(oidcSecretRef)).append("\n");
    sb.append("    oidcScopes: ").append(toIndentedString(oidcScopes)).append("\n");
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
