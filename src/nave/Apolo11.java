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

package nave;

/**
 * @author foletto.neo
 *
 */
public class Apolo11 extends NaveEspacial {

  private String tipoCombustivel = "";

  /**
   * @return the tipoCombustivel
   */
  public String getTipoCombustivel() {
    return tipoCombustivel;
  }

  /**
   * @param tipoCombustivel the tipoCombustivel to set
   */
  public void setTipoCombustivel(String tipoCombustivel) {
    if (tipoCombustivel.length() != 0)
      this.tipoCombustivel = tipoCombustivel;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Apolo11 [tipoCombustivel=");
    builder.append(tipoCombustivel);
    builder.append(", toString()=");
    builder.append(super.toString());
    builder.append("]");
    return builder.toString();
  }

}
