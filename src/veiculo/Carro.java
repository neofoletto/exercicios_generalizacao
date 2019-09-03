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
public class Carro extends Veiculo {

  private int portas = 0;

  /**
   * @return the portas
   */
  public int getPortas() {
    return portas;
  }

  /**
   * @param portas the portas to set
   */
  public void setPortas(int portas) {
    if (portas > 0)
      this.portas = portas;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("VeiculoCarro [portas=");
    builder.append(portas);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }


}
