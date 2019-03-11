/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.mm.channel.accountmanagement;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TAccountStatus implements org.apache.thrift.TEnum {
  Active(0),
  Inactive(1),
  financeApprovalPending(2),
  financeApprovalRejected(3);

  private final int value;

  private TAccountStatus(int value) {
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
  public static TAccountStatus findByValue(int value) { 
    switch (value) {
      case 0:
        return Active;
      case 1:
        return Inactive;
      case 2:
        return financeApprovalPending;
      case 3:
        return financeApprovalRejected;
      default:
        return null;
    }
  }
}