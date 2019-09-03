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

package bombaCombustivel;

/**
 * @author foletto.neo
 *
 */
public class Bomba {

  private double totalLitros = 0;
  private double valorLitro = 0;

  /**
   * @return the totalLitros
   */
  public double getTotalLitros() {
    return totalLitros;
  }

  /**
   * @param totalLitros the totalLitros to set
   */
  protected void setTotalLitros(double totalLitros) {
    if (totalLitros > -1)
      this.totalLitros = totalLitros;
  }

  /**
   * @return the valorLitro
   */
  public double getValorLitro() {
    return valorLitro;
  }

  /**
   * @param valorLitro the valorLitro to set
   */
  protected void setValorLitro(double valorLitro) {
    if (valorLitro > -1)
      this.valorLitro = valorLitro;
  }

  /**
   * @param litro the litro to set
   */
  public boolean abastecerPorLitro(int litro) {
    if (litro > 0) {
      this.totalLitros = litro;
      return true;
    } else
      return false;
  }

  public boolean abastecerPorValor(double valor) {
    if (valor > 0) {
      this.totalLitros = this.valorLitro / valor;
      return true;
    } else
      return false;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Bomba [litro=");
    builder.append(totalLitros);
    builder.append(", valorLitro=");
    builder.append(valorLitro);
    builder.append("]");
    return builder.toString();
  }
}
