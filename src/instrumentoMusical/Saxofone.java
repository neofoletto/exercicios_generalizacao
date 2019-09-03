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

public class Saxofone extends Metal {

  private double tamanho;

  public Saxofone(String cor, String marca, String tipo, double tamanho) {
    super(cor, marca, tipo);
    setTamanho(tamanho);
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    if (tamanho > 0)
      this.tamanho = tamanho;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Saxofone [tamanho=");
    builder.append(tamanho);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
