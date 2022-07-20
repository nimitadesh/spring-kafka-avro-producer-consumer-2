/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.vishaluplanch.avro.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PlanningEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7742387104527164268L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PlanningEvent\",\"namespace\":\"com.vishaluplanch.avro.schema\",\"fields\":[{\"name\":\"brand\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"market\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"channel\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"brandGuid\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"plannedCustomerChoiceId\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PlanningEvent> ENCODER =
      new BinaryMessageEncoder<PlanningEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PlanningEvent> DECODER =
      new BinaryMessageDecoder<PlanningEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PlanningEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PlanningEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PlanningEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PlanningEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PlanningEvent from a ByteBuffer. */
  public static PlanningEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence brand;
  @Deprecated public java.lang.CharSequence market;
  @Deprecated public java.lang.CharSequence channel;
  @Deprecated public java.lang.CharSequence brandGuid;
  @Deprecated public java.lang.CharSequence plannedCustomerChoiceId;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PlanningEvent() {}

  /**
   * All-args constructor.
   * @param brand The new value for brand
   * @param market The new value for market
   * @param channel The new value for channel
   * @param brandGuid The new value for brandGuid
   * @param plannedCustomerChoiceId The new value for plannedCustomerChoiceId
   */
  public PlanningEvent(java.lang.CharSequence brand, java.lang.CharSequence market, java.lang.CharSequence channel, java.lang.CharSequence brandGuid, java.lang.CharSequence plannedCustomerChoiceId) {
    this.brand = brand;
    this.market = market;
    this.channel = channel;
    this.brandGuid = brandGuid;
    this.plannedCustomerChoiceId = plannedCustomerChoiceId;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return brand;
    case 1: return market;
    case 2: return channel;
    case 3: return brandGuid;
    case 4: return plannedCustomerChoiceId;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: brand = (java.lang.CharSequence)value$; break;
    case 1: market = (java.lang.CharSequence)value$; break;
    case 2: channel = (java.lang.CharSequence)value$; break;
    case 3: brandGuid = (java.lang.CharSequence)value$; break;
    case 4: plannedCustomerChoiceId = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'brand' field.
   * @return The value of the 'brand' field.
   */
  public java.lang.CharSequence getBrand() {
    return brand;
  }

  /**
   * Sets the value of the 'brand' field.
   * @param value the value to set.
   */
  public void setBrand(java.lang.CharSequence value) {
    this.brand = value;
  }

  /**
   * Gets the value of the 'market' field.
   * @return The value of the 'market' field.
   */
  public java.lang.CharSequence getMarket() {
    return market;
  }

  /**
   * Sets the value of the 'market' field.
   * @param value the value to set.
   */
  public void setMarket(java.lang.CharSequence value) {
    this.market = value;
  }

  /**
   * Gets the value of the 'channel' field.
   * @return The value of the 'channel' field.
   */
  public java.lang.CharSequence getChannel() {
    return channel;
  }

  /**
   * Sets the value of the 'channel' field.
   * @param value the value to set.
   */
  public void setChannel(java.lang.CharSequence value) {
    this.channel = value;
  }

  /**
   * Gets the value of the 'brandGuid' field.
   * @return The value of the 'brandGuid' field.
   */
  public java.lang.CharSequence getBrandGuid() {
    return brandGuid;
  }

  /**
   * Sets the value of the 'brandGuid' field.
   * @param value the value to set.
   */
  public void setBrandGuid(java.lang.CharSequence value) {
    this.brandGuid = value;
  }

  /**
   * Gets the value of the 'plannedCustomerChoiceId' field.
   * @return The value of the 'plannedCustomerChoiceId' field.
   */
  public java.lang.CharSequence getPlannedCustomerChoiceId() {
    return plannedCustomerChoiceId;
  }

  /**
   * Sets the value of the 'plannedCustomerChoiceId' field.
   * @param value the value to set.
   */
  public void setPlannedCustomerChoiceId(java.lang.CharSequence value) {
    this.plannedCustomerChoiceId = value;
  }

  /**
   * Creates a new PlanningEvent RecordBuilder.
   * @return A new PlanningEvent RecordBuilder
   */
  public static com.vishaluplanch.avro.schema.PlanningEvent.Builder newBuilder() {
    return new com.vishaluplanch.avro.schema.PlanningEvent.Builder();
  }

  /**
   * Creates a new PlanningEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PlanningEvent RecordBuilder
   */
  public static com.vishaluplanch.avro.schema.PlanningEvent.Builder newBuilder(com.vishaluplanch.avro.schema.PlanningEvent.Builder other) {
    return new com.vishaluplanch.avro.schema.PlanningEvent.Builder(other);
  }

  /**
   * Creates a new PlanningEvent RecordBuilder by copying an existing PlanningEvent instance.
   * @param other The existing instance to copy.
   * @return A new PlanningEvent RecordBuilder
   */
  public static com.vishaluplanch.avro.schema.PlanningEvent.Builder newBuilder(com.vishaluplanch.avro.schema.PlanningEvent other) {
    return new com.vishaluplanch.avro.schema.PlanningEvent.Builder(other);
  }

  /**
   * RecordBuilder for PlanningEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PlanningEvent>
    implements org.apache.avro.data.RecordBuilder<PlanningEvent> {

    private java.lang.CharSequence brand;
    private java.lang.CharSequence market;
    private java.lang.CharSequence channel;
    private java.lang.CharSequence brandGuid;
    private java.lang.CharSequence plannedCustomerChoiceId;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.vishaluplanch.avro.schema.PlanningEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.brand)) {
        this.brand = data().deepCopy(fields()[0].schema(), other.brand);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.market)) {
        this.market = data().deepCopy(fields()[1].schema(), other.market);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.channel)) {
        this.channel = data().deepCopy(fields()[2].schema(), other.channel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brandGuid)) {
        this.brandGuid = data().deepCopy(fields()[3].schema(), other.brandGuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.plannedCustomerChoiceId)) {
        this.plannedCustomerChoiceId = data().deepCopy(fields()[4].schema(), other.plannedCustomerChoiceId);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PlanningEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.vishaluplanch.avro.schema.PlanningEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.brand)) {
        this.brand = data().deepCopy(fields()[0].schema(), other.brand);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.market)) {
        this.market = data().deepCopy(fields()[1].schema(), other.market);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.channel)) {
        this.channel = data().deepCopy(fields()[2].schema(), other.channel);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.brandGuid)) {
        this.brandGuid = data().deepCopy(fields()[3].schema(), other.brandGuid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.plannedCustomerChoiceId)) {
        this.plannedCustomerChoiceId = data().deepCopy(fields()[4].schema(), other.plannedCustomerChoiceId);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'brand' field.
      * @return The value.
      */
    public java.lang.CharSequence getBrand() {
      return brand;
    }

    /**
      * Sets the value of the 'brand' field.
      * @param value The value of 'brand'.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder setBrand(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.brand = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'brand' field has been set.
      * @return True if the 'brand' field has been set, false otherwise.
      */
    public boolean hasBrand() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'brand' field.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder clearBrand() {
      brand = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'market' field.
      * @return The value.
      */
    public java.lang.CharSequence getMarket() {
      return market;
    }

    /**
      * Sets the value of the 'market' field.
      * @param value The value of 'market'.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder setMarket(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.market = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'market' field has been set.
      * @return True if the 'market' field has been set, false otherwise.
      */
    public boolean hasMarket() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'market' field.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder clearMarket() {
      market = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'channel' field.
      * @return The value.
      */
    public java.lang.CharSequence getChannel() {
      return channel;
    }

    /**
      * Sets the value of the 'channel' field.
      * @param value The value of 'channel'.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder setChannel(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.channel = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'channel' field has been set.
      * @return True if the 'channel' field has been set, false otherwise.
      */
    public boolean hasChannel() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'channel' field.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder clearChannel() {
      channel = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'brandGuid' field.
      * @return The value.
      */
    public java.lang.CharSequence getBrandGuid() {
      return brandGuid;
    }

    /**
      * Sets the value of the 'brandGuid' field.
      * @param value The value of 'brandGuid'.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder setBrandGuid(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.brandGuid = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'brandGuid' field has been set.
      * @return True if the 'brandGuid' field has been set, false otherwise.
      */
    public boolean hasBrandGuid() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'brandGuid' field.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder clearBrandGuid() {
      brandGuid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'plannedCustomerChoiceId' field.
      * @return The value.
      */
    public java.lang.CharSequence getPlannedCustomerChoiceId() {
      return plannedCustomerChoiceId;
    }

    /**
      * Sets the value of the 'plannedCustomerChoiceId' field.
      * @param value The value of 'plannedCustomerChoiceId'.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder setPlannedCustomerChoiceId(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.plannedCustomerChoiceId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'plannedCustomerChoiceId' field has been set.
      * @return True if the 'plannedCustomerChoiceId' field has been set, false otherwise.
      */
    public boolean hasPlannedCustomerChoiceId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'plannedCustomerChoiceId' field.
      * @return This builder.
      */
    public com.vishaluplanch.avro.schema.PlanningEvent.Builder clearPlannedCustomerChoiceId() {
      plannedCustomerChoiceId = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PlanningEvent build() {
      try {
        PlanningEvent record = new PlanningEvent();
        record.brand = fieldSetFlags()[0] ? this.brand : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.market = fieldSetFlags()[1] ? this.market : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.channel = fieldSetFlags()[2] ? this.channel : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.brandGuid = fieldSetFlags()[3] ? this.brandGuid : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.plannedCustomerChoiceId = fieldSetFlags()[4] ? this.plannedCustomerChoiceId : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PlanningEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<PlanningEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PlanningEvent>
    READER$ = (org.apache.avro.io.DatumReader<PlanningEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}