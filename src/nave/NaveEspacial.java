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
public class NaveEspacial {

  private int velocidadeMaxima = 0;

  /**
   * @return the velocidadeMaxima
   */
  public int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  /**
   * @param velocidadeMaxima the velocidadeMaxima to set
   */
  public void setVelocidadeMaxima(int velocidadeMaxima) {
    if (velocidadeMaxima > -1)
      this.velocidadeMaxima = velocidadeMaxima;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("NaveEspacial [velocidadeMaxima=");
    builder.append(velocidadeMaxima);
    builder.append("]");
    return builder.toString();
  }

}
