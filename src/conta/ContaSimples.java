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
package conta;

/**
 * @author foletto.neo
 *
 */
public class ContaSimples extends Conta {

  private double saldoPoupanca = 0;

  /**
   * @return the saldoPoupanca
   */
  public double getSaldoPoupanca() {
    return saldoPoupanca;
  }

  /**
   * @param valor the saldoPoupanca to set
   */
  public boolean depositoPoupanca(double valor) {
    if (valor > 0) {
      this.saldoPoupanca += valor;
      return true;
    } else
      return false;
  }

  public boolean saquePoupanca(double valor) {
    if (valor <= this.saldoPoupanca) {
      this.saldoPoupanca -= valor;
      return true;
    } else
      return false;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ContaSimples [saldoPoupanca=");
    builder.append(saldoPoupanca);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
