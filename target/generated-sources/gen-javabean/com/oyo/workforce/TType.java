/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.workforce;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TType implements org.apache.thrift.TEnum {
  WEDDINGZ_CITY(0),
  WEDDINGZ_VENUE(1),
  WEDDINGZ_NONVENUE(2);

  private final int value;

  private TType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TType findByValue(int value) { 
    switch (value) {
      case 0:
        return WEDDINGZ_CITY;
      case 1:
        return WEDDINGZ_VENUE;
      case 2:
        return WEDDINGZ_NONVENUE;
      default:
        return null;
    }
  }
}