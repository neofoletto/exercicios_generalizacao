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

package ambiente;

/**
 * @author foletto.neo
 *
 */
public class Cozinha extends Ambiente {

  private boolean microondas = false;

  /**
   * @return the tv
   */
  public boolean isMicroondas() {
    return microondas;
  }

  /**
   * @param microondas the tv to set
   */
  public void setMicroondas(boolean microondas) {
    if (microondas)
      this.microondas = microondas;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Cozinha{");
    sb.append("microondas=").append(microondas);
    sb.append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
