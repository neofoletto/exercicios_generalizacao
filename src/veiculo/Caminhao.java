/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

/**
 *
 */
package veiculo;

/**
 * @author foletto.neo
 *
 */
public class Caminhao extends Veiculo {

  private int eixos = 0;

  /**
   * @return the eixos
   */
  public int getEixos() {
    return eixos;
  }

  /**
   * @param eixos the eixos to set
   */
  public void setEixos(int eixos) {
    if (eixos > 1)
      this.eixos = eixos;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VeiculoCaminhao [eixos=");
    builder.append(eixos);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }


}
