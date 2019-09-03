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

public class Metal extends Instrumento {

  private String tipo;

  public Metal(String cor, String marca, String tipo) {
    super(cor, marca);
    setTipo(tipo);
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    if (tipo.length() > 2)
      this.tipo = tipo;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Metal [tipo=");
    builder.append(tipo);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }
}
