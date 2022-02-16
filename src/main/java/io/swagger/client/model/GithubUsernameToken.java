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
import io.swagger.client.model.GithubHttpCredentialsSpec;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * This contains details of the Github credentials Specs such as references of username and token
 */
@Schema(description = "This contains details of the Github credentials Specs such as references of username and token")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class GithubUsernameToken extends GithubHttpCredentialsSpec {
  @SerializedName("username")
  private String username = null;

  @SerializedName("usernameRef")
  private String usernameRef = null;

  @SerializedName("tokenRef")
  private String tokenRef = null;

  public GithubUsernameToken username(String username) {
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

  public GithubUsernameToken usernameRef(String usernameRef) {
    this.usernameRef = usernameRef;
    return this;
  }

   /**
   * Get usernameRef
   * @return usernameRef
  **/
  @Schema(description = "")
  public String getUsernameRef() {
    return usernameRef;
  }

  public void setUsernameRef(String usernameRef) {
    this.usernameRef = usernameRef;
  }

  public GithubUsernameToken tokenRef(String tokenRef) {
    this.tokenRef = tokenRef;
    return this;
  }

   /**
   * Get tokenRef
   * @return tokenRef
  **/
  @Schema(required = true, description = "")
  public String getTokenRef() {
    return tokenRef;
  }

  public void setTokenRef(String tokenRef) {
    this.tokenRef = tokenRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubUsernameToken githubUsernameToken = (GithubUsernameToken) o;
    return Objects.equals(this.username, githubUsernameToken.username) &&
        Objects.equals(this.usernameRef, githubUsernameToken.usernameRef) &&
        Objects.equals(this.tokenRef, githubUsernameToken.tokenRef) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, usernameRef, tokenRef, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubUsernameToken {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    usernameRef: ").append(toIndentedString(usernameRef)).append("\n");
    sb.append("    tokenRef: ").append(toIndentedString(tokenRef)).append("\n");
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
