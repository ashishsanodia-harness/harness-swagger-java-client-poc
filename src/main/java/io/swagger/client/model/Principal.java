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
 * Principal
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-16T23:54:49.094+05:30[Asia/Kolkata]")
public class Principal {
  @SerializedName("identifier")
  private String identifier = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("USER"),
    USER_GROUP("USER_GROUP"),
    SERVICE("SERVICE"),
    API_KEY("API_KEY"),
    SERVICE_ACCOUNT("SERVICE_ACCOUNT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public Principal identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @Schema(description = "")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Principal type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Principal principal = (Principal) o;
    return Objects.equals(this.identifier, principal.identifier) &&
        Objects.equals(this.type, principal.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Principal {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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