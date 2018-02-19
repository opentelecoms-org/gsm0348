//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.09 at 04:14:20 PM MSD 
//


package org.opentelecoms.gsm0348.api.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KIC", propOrder = {

})
public class KIC {

  @XmlElement(name = "KeysetID")
  protected byte keysetID;
  @XmlElement(name = "CipheringAlgorithmMode", required = true)
  protected CipheringAlgorithmMode cipheringAlgorithmMode;
  @XmlElement(name = "AlgorithmImplementation", required = true)
  protected AlgorithmImplementation algorithmImplementation;

  /**
   * Gets the value of the keysetID property.
   *
   * @return possible object is
   * {@link byte }
   */
  public byte getKeysetID() {
    return keysetID;
  }

  /**
   * Sets the value of the keysetID property.
   *
   * @param value allowed object is
   *              {@link byte }
   */
  public void setKeysetID(byte value) {
    this.keysetID = value;
  }

  /**
   * Gets the value of the cipheringAlgorithmMode property.
   *
   * @return possible object is
   * {@link CipheringAlgorithmMode }
   */
  public CipheringAlgorithmMode getCipheringAlgorithmMode() {
    return cipheringAlgorithmMode;
  }

  /**
   * Sets the value of the cipheringAlgorithmMode property.
   *
   * @param value allowed object is
   *              {@link CipheringAlgorithmMode }
   */
  public void setCipheringAlgorithmMode(CipheringAlgorithmMode value) {
    this.cipheringAlgorithmMode = value;
  }

  /**
   * Gets the value of the algorithmImplementation property.
   *
   * @return possible object is
   * {@link AlgorithmImplementation }
   */
  public AlgorithmImplementation getAlgorithmImplementation() {
    return algorithmImplementation;
  }

  /**
   * Sets the value of the algorithmImplementation property.
   *
   * @param value allowed object is
   *              {@link AlgorithmImplementation }
   */
  public void setAlgorithmImplementation(AlgorithmImplementation value) {
    this.algorithmImplementation = value;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((algorithmImplementation == null) ? 0 : algorithmImplementation.hashCode());
    result = prime * result + ((cipheringAlgorithmMode == null) ? 0 : cipheringAlgorithmMode.hashCode());
    result = prime * result + keysetID;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof KIC)) {
      return false;
    }
    KIC other = (KIC) obj;
    if (algorithmImplementation != other.algorithmImplementation) {
      return false;
    }
    if (cipheringAlgorithmMode != other.cipheringAlgorithmMode) {
      return false;
    }
    if (keysetID != other.keysetID) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("KIC [keysetID=");
    builder.append(keysetID);
    builder.append(", cipheringAlgorithmMode=");
    builder.append(cipheringAlgorithmMode);
    builder.append(", algorithmImplementation=");
    builder.append(algorithmImplementation);
    builder.append("]");
    return builder.toString();
  }

}
