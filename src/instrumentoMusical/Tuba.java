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

public class Tuba extends Metal {

  private int quantidade;
  private String tom;

  public Tuba(String cor, String marca, String tipo, int quantidade, String tom) {
    super(cor, marca, tipo);
    setQuantidade(quantidade);
    setTom(tom);
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade > -1)
      this.quantidade = quantidade;
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
    builder.append("Tuba [quantidade=");
    builder.append(quantidade);
    builder.append(", tom=");
    builder.append(tom);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
