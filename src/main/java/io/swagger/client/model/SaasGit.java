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
/**
 * This contains a boolean which specifies whether the repoURL is SaasGit or not
 */
@Schema(description = "This contains a boolean which specifies whether the repoURL is SaasGit or not")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class SaasGit {
  @SerializedName("isSaasGit")
  private Boolean isSaasGit = null;

  @SerializedName("saasGit")
  private Boolean saasGit = null;

  public SaasGit isSaasGit(Boolean isSaasGit) {
    this.isSaasGit = isSaasGit;
    return this;
  }

   /**
   * Specifies whether the repoURL is SaasGit or not
   * @return isSaasGit
  **/
  @Schema(required = true, description = "Specifies whether the repoURL is SaasGit or not")
  public Boolean isIsSaasGit() {
    return isSaasGit;
  }

  public void setIsSaasGit(Boolean isSaasGit) {
    this.isSaasGit = isSaasGit;
  }

  public SaasGit saasGit(Boolean saasGit) {
    this.saasGit = saasGit;
    return this;
  }

   /**
   * Get saasGit
   * @return saasGit
  **/
  @Schema(description = "")
  public Boolean isSaasGit() {
    return saasGit;
  }

  public void setSaasGit(Boolean saasGit) {
    this.saasGit = saasGit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaasGit saasGit = (SaasGit) o;
    return Objects.equals(this.isSaasGit, saasGit.isSaasGit) &&
        Objects.equals(this.saasGit, saasGit.saasGit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSaasGit, saasGit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaasGit {\n");
    
    sb.append("    isSaasGit: ").append(toIndentedString(isSaasGit)).append("\n");
    sb.append("    saasGit: ").append(toIndentedString(saasGit)).append("\n");
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
