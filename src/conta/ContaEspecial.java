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
public class ContaEspecial extends Conta {

  private int diasDeJuros = 0;
  private double limite = 0;

  /**
   * @return the diasDeJuros
   */
  public int getDiasDeJuros() {
    return diasDeJuros;
  }

  /**
   * @param diasDeJuros the diasDeJuros to set
   */
  public void setDiasDeJuros(int diasDeJuros) {
    if (diasDeJuros > -1)
      this.diasDeJuros = diasDeJuros;
  }

  /**
   * @return the limie
   */
  public double getLimie() {
    return limite;
  }

  /**
   * @param limie the limie to set
   */
  public void setLimie(double limie) {
    if (limie > -1)
      this.limite = limie;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("ContaEspecial [diasDeJuros=");
    builder.append(diasDeJuros);
    builder.append(", limie=");
    builder.append(limite);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
