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
public class Moto extends Veiculo {

  private int cilindradas = 0;

  /**
   * @return the cilindradas
   */
  public int getCilindradas() {
    return cilindradas;
  }

  /**
   * @param cilindradas the cilindradas to set
   */
  public void setCilindradas(int cilindradas) {
    if (cilindradas > 0)
      this.cilindradas = cilindradas;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VeiculoMoto [cilindradas=");
    builder.append(cilindradas);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
