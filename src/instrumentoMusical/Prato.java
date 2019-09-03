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

package instrumentoMusical;

public class Prato extends Metal {

  private double dimensao;
  private String tom;

  public Prato(String cor, String marca, String tipo, double dimensao, String tom) {
    super(cor, marca, tipo);
    setDimensao(dimensao);
    setTom(tom);
  }

  public double getDimensao() {
    return dimensao;
  }

  public void setDimensao(double dimensao) {
    if (dimensao > 0)
      this.dimensao = dimensao;
  }

  public String getTom() {
    return tom;
  }

  public void setTom(String tom) {
    if (tom.length() != 0)
      this.tom = tom;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Prato [dimensao=");
    builder.append(dimensao);
    builder.append(", tom=");
    builder.append(tom);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
